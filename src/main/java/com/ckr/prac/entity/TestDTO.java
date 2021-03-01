package com.ckr.prac.entity;

import org.hibernate.validator.constraints.Range;

import java.util.List;

public class TestDTO {
    private String id;
    private String name;

    @Range(min=1, max=100)
    private int age;
    private List<String> testTags;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTestTags() {
        return testTags;
    }

    public void setTestTags(List<String> testTags) {
        this.testTags = testTags;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
