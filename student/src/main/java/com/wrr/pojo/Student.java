package com.wrr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wrr
 * @create 2025/03/18 16:05
 * @desc 实体类student
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private String phone;
}
