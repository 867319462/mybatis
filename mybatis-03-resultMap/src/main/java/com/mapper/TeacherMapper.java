package com.mapper;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName TeacherMapper
 * @Description
 * @Author WangXL
 * @Date 2020/2/3 18:41
 **/
public interface TeacherMapper {
    /**
     * 查询所有老师
     *
     * @return 老师信息
     */
    List<Teacher> selectTeacher();

    /**
     * 根据id查询老师
     *
     * @param id 老师id
     * @return 老师信息
     */
    Teacher selectTeacherById(@Param("id") int id);

    /**
     * 根据id查询老师
     *
     * @param id 老师id
     * @return 老师信息
     */
    Teacher selectTeacherById2(@Param("id") int id);
}
