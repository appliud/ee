package com.wrr.service;

import com.wrr.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();

    Student getStudentById(Integer id);

    void updateStudent(Student student);

    void deleteStudent(Integer id);

    void addStudent(Student student);
}
