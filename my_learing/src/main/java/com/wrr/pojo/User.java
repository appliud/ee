package com.wrr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String position;

    public User(String name, Integer age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }
}
