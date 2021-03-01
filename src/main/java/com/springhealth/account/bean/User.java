package com.springhealth.account.bean;

/**
 * @version 1.0
 * @Author 王庆运
 * @Date: 2021/02/28/ 15:50
 * @Description
 */
public class User {
    private String name;
    private Integer age;
    private Pet pet;
    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public Pet getCat() {
        return pet;
    }

    public void setCat(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + pet +
                '}';
    }
}
