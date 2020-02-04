package com.mapper;

import com.pojo.User;
import com.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName UserMapperTest
 * @Description
 * @Author WangXL
 * @Date 2020/2/4 19:34
 **/
public class UserMapperTest {
    @Test
    public void selectUser() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.selectUser();
        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void queryUser() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUser(1);
        System.out.println(user);

        // 清理缓存
        //sqlSession.clearCache();
        System.out.println("====================================");

        User user2 = mapper.queryUser(1);
        System.out.println(user2);

        System.out.println(user == user2);

        sqlSession.close();
    }

    @Test
    public void queryUser2() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        SqlSession sqlSession2 = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUser(1);
        System.out.println(user);

        sqlSession.close();


        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUser(1);
        System.out.println(user2);

        sqlSession2.close();
    }
}
