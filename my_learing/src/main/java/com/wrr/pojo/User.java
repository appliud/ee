package com.wrr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(age, user.age) && Objects.equals(position, user.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, position);
    }
}
