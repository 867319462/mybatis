package com.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.pojo.User;
import com.utils.MybatisUtil;

import java.util.List;

/**
 * @ClassName UserMapperTest
 * @Description
 * @Author WangXL
 * @Date 2020/2/2 14:55
 **/
public class UserMapperTest {
    @Test
    public void selectUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
