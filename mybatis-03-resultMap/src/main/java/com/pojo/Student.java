package com.pojo;

import lombok.Data;

/**
 * @ClassName Student
 * @Description 学生
 * @Author WangXL
 * @Date 2020/2/3 18:06
 **/
@Data
public class Student {
    private int id;
    private String name;
    private int teacherId;
    private Teacher teacher;
}
