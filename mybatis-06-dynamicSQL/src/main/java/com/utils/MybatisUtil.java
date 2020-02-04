package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MybatisUtil
 * @Description mybatis的工具类 sqlSessionFactory-->sqlSession
 * @Author WangXL
 * @Date 2020/2/1 11:49
 **/
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取sqlSession
     *
     * @return sqlSession
     */
    public static SqlSession getSqlSession() {
        // 设置自动提交事务
        return sqlSessionFactory.openSession(true);
    }
}
