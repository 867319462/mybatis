package com.mapper;

import com.pojo.User;
import com.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @ClassName UserMapperTest
 * @Description
 * @Author WangXL
 * @Date 2020/2/2 19:23
 **/
public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void testLog4j() {
        logger.info("info:进入方法");
        logger.debug("debug:进入方法");
        logger.error("error:进入方法");
    }
}
