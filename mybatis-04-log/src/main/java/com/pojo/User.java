package com.pojo;

/**
 * @ClassName User
 * @Description
 * @Author WangXL
 * @Date 2020/2/1 11:30
 **/
public class User {
    public int id;
    public String name;
    public int age;
    public String adr;

    public User() {
    }

    public User(int id, String name, int age, String adr) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adr = adr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adr='" + adr + '\'' +
                '}';
    }
}
