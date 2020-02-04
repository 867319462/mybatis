package com.mapper;

import com.pojo.Student;

import java.util.List;

/**
 * @ClassName StudentMapper
 * @Description
 * @Author WangXL
 * @Date 2020/2/3 18:40
 **/
public interface StudentMapper {
    /**
     * 查询所有学生信息
     * @return 学生信息
     */
    List<Student> selectStudent();

    /**
     * 查询学生信息与其老师
     * @return 学生信息
     */
    List<Student> getStudentAndTeacher();

    /**
     * 查询学生信息与其老师
     * @return 学生信息
     */
    List<Student> getStudentAndTeacher2();
}
