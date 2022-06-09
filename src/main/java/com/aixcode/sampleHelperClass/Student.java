package com.aixcode.sampleHelperClass;

import java.util.List;

public class Student {
    public String name;
    private Integer age;
    public List<String> teachers;

    public Student() {
    }

    public Student(String name, Integer age, List<String> teachers) {
        this.name = name;
        this.age = age;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<String> teachers) {
        this.teachers = teachers;
    }
}
