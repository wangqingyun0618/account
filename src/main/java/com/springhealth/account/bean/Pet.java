package com.springhealth.account.bean;

/**
 * @version 1.0
 * @Author 王庆运
 * @Date: 2021/02/28/ 15:50
 * @Description
 */
public class Pet {
    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
