import com.fsteam.fsmall.mapper.CartMapper;
import com.fsteam.fsmall.mapper.MallDynamicSqlSupport;
import com.fsteam.fsmall.mapper.MallMapper;
import com.fsteam.fsmall.model.Cart;
import com.fsteam.fsmall.model.Mall;
import com.fsteam.fsmall.utils.MyBatisUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;

import static com.fsteam.fsmall.mapper.CartDynamicSqlSupport.*;
import static com.fsteam.fsmall.mapper.MallDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.insert;

public class CartTest {
    private CartMapper cartMapper;

    @Before
    public void init() {
        MyBatisUtils.startSqlSession();
        cartMapper = MyBatisUtils.getMapper(CartMapper.class);
    }

    @After
    public void release() {
        MyBatisUtils.close();
    }

    @Test
    public void testInsertCart() {
        Cart record = new Cart();
        record.setMallId("liuyuexue");
        record.setCustomerId("wxid");
        record.setItemId(123);
        record.setNumber(5);

        InsertStatementProvider<Cart> insertStatement = insert(record)
                .into(cart)
                .map(mallId).toProperty("mallId")
                .map(customerId).toProperty("customerId")
                .map(itemId).toProperty("itemId")
                .map(number).toProperty("number")
                .build()
                .render(RenderingStrategies.MYBATIS3);
        System.out.println(cartMapper.insert(insertStatement));
    }
}
