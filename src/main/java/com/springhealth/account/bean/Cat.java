package com.springhealth.account.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Author 王庆运
 * @Date: 2021/02/28/ 17:56
 * @Description
 */
@Component
@ConfigurationProperties(prefix = "mycat")
public class Cat {
    private String brand;
    private String pirct;

    public Cat() {
    }

    public Cat(String brand, String pirct) {
        this.brand = brand;
        this.pirct = pirct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPirct() {
        return pirct;
    }

    public void setPirct(String pirct) {
        this.pirct = pirct;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "brand='" + brand + '\'' +
                ", pirct='" + pirct + '\'' +
                '}';
    }
}
