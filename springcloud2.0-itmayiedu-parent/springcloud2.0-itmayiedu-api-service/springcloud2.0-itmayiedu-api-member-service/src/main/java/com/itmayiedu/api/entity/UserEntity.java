package com.itmayiedu.api.entity;

import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 21:12
 */
@Data
public class UserEntity {
    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
