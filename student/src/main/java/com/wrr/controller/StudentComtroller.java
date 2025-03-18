package com.wrr.controller;

import com.wrr.pojo.Student;
import com.wrr.service.impl.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wrr.pojo.Result;

import java.util.List;

/**
 * @author wrr
 * @date 2025/03/18
 * @desc student controller
 */
@RequestMapping("/student")
@RestController
public class StudentComtroller {
    private static final Logger log = LoggerFactory.getLogger(StudentComtroller.class);
    @Autowired
    private StudentServiceImpl studentServiceImpl;
    @GetMapping
    public Result getStudent(){
        List<Student> student =studentServiceImpl.getStudent();
        return Result.success(student);
    }
    /**
     * 根据id查询学生
     */
    @GetMapping("/{id}")
    public Result getStudentById(@PathVariable Integer id){
        log.info("根据id查询学生:{}",id);
        Student student =studentServiceImpl.getStudentById(id);
        return Result.success(student);
    }
    /**
     * 根据id修改学生信息
     */
    @PutMapping
    public Result updateStudent(@RequestBody Student student){
        log.info("根据id修改学生{}",student);
        studentServiceImpl.updateStudent(student);
        return Result.success();
    }
    /**
     * 删除学生
     */
    @DeleteMapping("/{id}")
    public Result deleteStudent(@PathVariable Integer id){
        log.info("根据id删除学生{}",id);
        studentServiceImpl.deleteStudent(id);
        return Result.success();
    }
    /**
     * 添加学生
     */
    @PostMapping
    public Result addStudent(@RequestBody Student student){
        log.info("添加学生{}",student);
        studentServiceImpl.addStudent(student);
        return Result.success();
    }
}
