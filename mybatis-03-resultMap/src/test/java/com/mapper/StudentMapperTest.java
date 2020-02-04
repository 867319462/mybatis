package com.mapper;

import com.pojo.Student;
import com.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName StudentMapperTest
 * @Description
 * @Author WangXL
 * @Date 2020/2/3 18:48
 **/
public class StudentMapperTest {
    @Test
    public void selectStudent(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectStudent();
        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void getStudentAndTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentAndTeacher = mapper.getStudentAndTeacher();
        for (Student student : studentAndTeacher) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void getStudentAndTeacher2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentAndTeacher = mapper.getStudentAndTeacher2();
        for (Student student : studentAndTeacher) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}
