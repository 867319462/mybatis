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
 * @Date 2020/2/3 12:03
 **/
public class UserMapperTest {
    @Test
    public void selectUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        // 底层主要使用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.selectUsers();
        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("秦始皇");
        user.setAge(2000);
        user.setAddress("秦朝");
        mapper.addUser(user);

        sqlSession.close();
    }
}
