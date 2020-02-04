package com.mapper;

import com.pojo.Teacher;
import com.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @ClassName TeacherMapperTest
 * @Description
 * @Author WangXL
 * @Date 2020/2/4 10:40
 **/
public class TeacherMapperTest {
    @Test
    public void selectTeacherById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.selectTeacherById(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void selectTeacherById2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.selectTeacherById2(1);
        System.out.println(teacher);

        sqlSession.close();
    }
}
