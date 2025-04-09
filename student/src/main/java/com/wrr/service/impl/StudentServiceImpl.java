package com.wrr.service.impl;

import com.wrr.mapper.StudentMapper;
import com.wrr.pojo.Student;
import com.wrr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wrr
 * @create 2025/03/18
 * @desc: Student逻辑层
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getStudent() {
        return studentMapper.getStudent();
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentMapper.deleteStudent(id);
    }

    @Override
    public void addStudent(Student student) {
        Integer id=studentMapper.getMaxId();
        student.setId(id+1);
        studentMapper.addStudent(student);
    }

    @Override
    public List<Student> getStudentByConditions(Student student) {
        return studentMapper.getStudentByConditions(student);
    }

    @Override
    public List<Student> getStudentByIdRange(Integer startId, Integer endId) {
        return studentMapper.getStudentByIdRange(startId, endId);
    }

    @Override
    public List<Student> getStudentBySex(String sex) {
        return studentMapper.getStudentBySex(sex);
    }
}
