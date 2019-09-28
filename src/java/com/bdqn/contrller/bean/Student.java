package com.bdqn.contrller.bean;

import java.security.PrivateKey;

/**
 * @author 忍
 * @title: Student
 * @projectName priactices
 * @description: TODO
 * @date 2019/4/220:22
 */

public class Student {
    private String name;
    private int age;
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
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
}
