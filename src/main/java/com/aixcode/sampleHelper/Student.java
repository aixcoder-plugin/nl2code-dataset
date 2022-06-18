package com.aixcode.sampleHelper;

import java.util.List;

public class Student {
    public String name1;
    public String name2;
    public String name3;


    private Integer age;
    public List<String> teachers;

    public Student() {
    }

    public Student(String name, Integer age, List<String> teachers) {
        this.name1 = name;
        this.age = age;
        this.teachers = teachers;
    }

    public void setName1(String name) {
        this.name1 = name;
    }
    public void setName2(String name) {
        this.name2 = name;
    }
    public void setName3(String name) {
        this.name3 = name;
    }

    public String getValueByName(String name) {
        try {
            if ("name1".equals(name)) {
                return name1;
            } else if ("name2".equals(name)) {
                return name2;
            } else if ("name3".equals(name)) {
                return name3;
            } else if ("age".equals(name)) {
                return String.valueOf(age);
            } else if ("teachers".equals(name)) {
                return teachers.toString();
            }
        } catch (Exception e) {
        }
        return null;
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
