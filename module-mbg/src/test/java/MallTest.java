import com.fsteam.fsmall.mapper.MallDynamicSqlSupport;
import com.fsteam.fsmall.mapper.MallMapper;
import com.fsteam.fsmall.model.Mall;
import com.fsteam.fsmall.utils.MyBatisUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.dynamic.sql.insert.InsertDSL;
import org.mybatis.dynamic.sql.insert.render.GeneralInsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static com.fsteam.fsmall.mapper.MallDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@SpringBootTest
public class MallTest {
    private MallMapper mallMapper;

    @Before
    public void init() {
        MyBatisUtils.startSqlSession();
        mallMapper = MyBatisUtils.getMapper(MallMapper.class);
    }

    @After
    public void release() {
        MyBatisUtils.close();
    }

    @Test
    public void testInsertMall() {
        Mall mall = new Mall();
        mall.setId("shuiguodian5.0");
        mall.setName("水果店");
        mall.setDescription("水果");
        mall.setPhone("13733333333");
        mall.setAddress("广州增城");

        InsertStatementProvider<Mall> insertStatementProvider = insert(mall)
                .into(new MallDynamicSqlSupport.Mall())
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(description).toProperty("description")
                .map(phone).toProperty("phone")
                .map(address).toProperty("address")
                .build().render(RenderingStrategies.MYBATIS3);

        int rows = mallMapper.insert(insertStatementProvider);
        System.out.println(rows);
    }

    @Test
    public void testGetMall() {
        SelectStatementProvider selectStatementProvider = select(
                MallDynamicSqlSupport.id,
                MallDynamicSqlSupport.name,
                MallDynamicSqlSupport.description,
                MallDynamicSqlSupport.description,
                MallDynamicSqlSupport.phone,
                MallDynamicSqlSupport.address,
                MallDynamicSqlSupport.status
        ).from(new MallDynamicSqlSupport.Mall()).build().render(RenderingStrategies.MYBATIS3);

        List<Mall> malls = mallMapper.selectMany(selectStatementProvider);
        System.out.println("===============================");
        System.out.println(malls);
        System.out.println("===============================");
    }

    @Test
    public void testGenInsert() {
        Mall record = new Mall();
        record.setId("shuiguodian50");
        record.setName("水果店");
        record.setDescription("水果");
        record.setPhone("13733333333");
        record.setAddress("广州增城");


        GeneralInsertStatementProvider insertStatement = insertInto(mall)
                .set(id).toValueWhenPresent(record::getId)
                .set(name).toValueWhenPresent(record::getName)
                .set(description).toValueWhenPresent(record::getDescription)
                .set(phone).toValueWhenPresent(record::getPhone)
                .set(address).toValueWhenPresent(record::getAddress)
                .set(iconId).toValueWhenPresent(record::getIconId)
                .set(status).toValueWhenPresent(record::getStatus)
                .build()
                .render(RenderingStrategies.MYBATIS3);
        System.out.println(insertStatement.getInsertStatement());

        System.out.println(mallMapper.generalInsert(insertStatement));
    }

    @Test
    public void testUpdateMall() {
        Mall record = new Mall();
        record.setId("shuiguodian50");
        record.setAddress("广州,增城");
        record.setStatus(1);

        UpdateStatementProvider updateStatement = update(mall)
                .set(name).equalToWhenPresent(record::getName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(iconId).equalToWhenPresent(record::getIconId)
                .set(status).equalToWhenPresent(record::getStatus)
                .where(id, isEqualTo(record.getId()))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        System.out.println(updateStatement.getUpdateStatement());
        System.out.println(mallMapper.update(updateStatement));
    }

    @Test
    public void testDelete() {
        System.out.println(mallMapper.deleteByPrimaryKey("benji"));
    }
}

