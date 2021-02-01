import com.fsteam.fsmall.mapper.MallDynamicSqlSupport;
import com.fsteam.fsmall.mapper.MallMapper;
import com.fsteam.fsmall.model.Mall;
import com.mysql.cj.xdevapi.SelectStatement;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.SqlTable;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.*;




public class MallTest {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mall_db?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "123456";

    private SqlSessionFactory sqlSessionFactory;

    @BeforeEach
    public void init() throws Exception{
        Class.forName(JDBC_DRIVER);
        UnpooledDataSource ds = new UnpooledDataSource(JDBC_DRIVER, JDBC_URL, username, password);
        Environment environment = new Environment("test", new JdbcTransactionFactory(), ds);
        Configuration config = new Configuration(environment);
        config.addMapper(MallMapper.class);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
    }

    @Test
    public void testInsert() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            MallMapper mapper = sqlSession.getMapper(MallMapper.class);

            Mall mall = new Mall();
            mall.setId("shuiguodian");
            mall.setName("水果店");
            mall.setDescription("水果");
            mall.setPhone("13733333333");
            mall.setAddress("广州增城");

            InsertStatementProvider<Mall> insertStatementProvider = insert(mall)
                    .into(new MallDynamicSqlSupport.Mall())
                    .map(MallDynamicSqlSupport.id).toProperty("id")
                    .map(MallDynamicSqlSupport.name).toProperty("name")
                    .map(MallDynamicSqlSupport.description).toProperty("description")
                    .map(MallDynamicSqlSupport.phone).toProperty("phone")
                    .map(MallDynamicSqlSupport.address).toProperty("address")
                    .build().render(RenderingStrategies.MYBATIS3);

            int rows = mapper.insert(insertStatementProvider);
            System.out.println(rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelect() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            MallMapper mapper = sqlSession.getMapper(MallMapper.class);

            SelectStatementProvider selectStatementProvider = select(
                    MallDynamicSqlSupport.id,
                    MallDynamicSqlSupport.name,
                    MallDynamicSqlSupport.description,
                    MallDynamicSqlSupport.description,
                    MallDynamicSqlSupport.phone,
                    MallDynamicSqlSupport.address,
                    MallDynamicSqlSupport.status
                    ).from(new MallDynamicSqlSupport.Mall()).build().render(RenderingStrategies.MYBATIS3);

            List<Mall> malls = mapper.selectMany(selectStatementProvider);
            System.out.println("===============================");
            System.out.println(malls);
            System.out.println("===============================");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
