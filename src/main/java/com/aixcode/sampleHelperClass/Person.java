package com.aixcode.sampleHelperClass;

public class Person <T,M>{
    private T name;
    private M age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }
}
