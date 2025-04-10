package com.bridgelabz.practiceproblems.validatejson;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> subjects;

    public Student(){}

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

    public List<String> getSubjects() {
        return subjects;
    }
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
