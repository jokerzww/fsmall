package com.fsteam.fsmall.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    private static final ThreadLocal<SqlSession> localSqlSession = new ThreadLocal<>();

    static {
        init();
    }

    private static void init() {
        try {
            // 加载配置文件，初始化SqlSessionFactory对象
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch(Exception e) {
            throw new RuntimeException("初始化SqlSessionFactory失败", e);
        }
    }

    public static void startSqlSession() {
        localSqlSession.set(sqlSessionFactory.openSession());
    }

    public static SqlSession getSqlSession() {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        return sqlSession;
    }

    public static void commit() {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        sqlSession.commit();
    }

    public static void rollback() {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        sqlSession.rollback();
    }

    public static void close() {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        try {
            sqlSession.close();
        } finally {
            localSqlSession.remove();
        }
    }

    public static <T> T getMapper(Class<T> type) {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        return sqlSession.getMapper(type);
    }
}
