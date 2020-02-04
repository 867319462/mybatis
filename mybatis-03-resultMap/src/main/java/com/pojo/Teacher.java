package com.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName Teacher
 * @Description 老师
 * @Author WangXL
 * @Date 2020/2/3 18:07
 **/
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
