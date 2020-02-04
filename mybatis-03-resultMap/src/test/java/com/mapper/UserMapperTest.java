package com.mapper;

import com.pojo.User;
import com.utils.MybatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName UserMapperTest
 * @Description
 * @Author WangXL
 * @Date 2020/2/2 17:24
 **/
public class UserMapperTest {
    @Test
    public void selectUser() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void getLimitUser() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", 0);
        map.put("pageSize", 3);
        List<User> limitUser = mapper.getLimitUser(map);
        for (User user : limitUser) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserByRowBounds() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        RowBounds rowBounds = new RowBounds(1, 2);
        List<User> selectList = sqlSession.selectList("com.mapper.UserMapper.getUserByRowBounds", null, rowBounds);
        for (User user : selectList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
