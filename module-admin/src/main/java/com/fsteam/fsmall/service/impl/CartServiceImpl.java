package com.fsteam.fsmall.service.impl;

import com.fsteam.fsmall.mapper.CartMapper;
import com.fsteam.fsmall.model.Cart;
import com.fsteam.fsmall.service.CartService;
import com.fsteam.fsmall.utils.MyBatisUtils;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static com.fsteam.fsmall.mapper.CartDynamicSqlSupport.*;

@Service
public class CartServiceImpl implements CartService {

    private CartMapper cartMapper;

    @Override
    public List<Cart> getCart(String cusId_, String mallId_) {
        MyBatisUtils.startSqlSession();
        cartMapper = MyBatisUtils.getMapper(CartMapper.class);
        List<Cart> carts = null;
        try {
            SelectStatementProvider selectStatement = select(cart.allColumns())
                    .from(cart)
                    .where(mallId, isEqualTo(mallId_), and(customerId, isEqualTo(cusId_)))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);

            carts = cartMapper.selectMany(selectStatement);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return carts;
    }

    @Override
    public int cleanUpCart(String cusId_, String mallId_) {
        MyBatisUtils.startSqlSession();
        cartMapper = MyBatisUtils.getMapper(CartMapper.class);
        int rows = -1;
        try {
            DeleteStatementProvider deleteStatement = deleteFrom(cart)
                    .where(mallId, isEqualTo(mallId_), and(customerId, isEqualTo(cusId_)))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            rows = cartMapper.delete(deleteStatement);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }

    @Override
    public int addItemIntoCart(Cart record) {
        MyBatisUtils.startSqlSession();
        cartMapper = MyBatisUtils.getMapper(CartMapper.class);
        int rows = -1;
        try {
            rows = cartMapper.insertSelective(record);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }

    @Override
    public int deleteItemFromCart(Integer cid) {
        MyBatisUtils.startSqlSession();
        cartMapper = MyBatisUtils.getMapper(CartMapper.class);
        int rows = -1;
        try {
            rows = cartMapper.deleteByPrimaryKey(cid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }

    @Override
    public int updateItemNumberOfCart(Cart record) {
        MyBatisUtils.startSqlSession();
        cartMapper = MyBatisUtils.getMapper(CartMapper.class);
        int rows = -1;
        try {
            UpdateStatementProvider updateStatement = update(cart)
                    .set(number).equalTo(record::getNumber)
                    .where(id, isEqualTo(record.getId()))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);

            rows = cartMapper.update(updateStatement);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }
}
