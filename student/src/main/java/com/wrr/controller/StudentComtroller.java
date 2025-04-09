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
    /**
     * 多条件查询学生信息
     */
    @PostMapping("/search")
    public Result getStudentByConditions(@RequestBody Student student) {
        log.info("多条件查询学生信息: {}", student);
        List<Student> students = studentServiceImpl.getStudentByConditions(student);
        return Result.success(students);
    }
    /**
     * 按ID范围查询学生信息
     */
    @GetMapping("/range")
    public Result getStudentByIdRange(@RequestParam Integer startId, @RequestParam Integer endId) {
        if (startId == null || endId == null) {
            return Result.error("起始ID和结束ID不能为空");
        }
        if (startId > endId) {
            return Result.error("起始ID不能大于结束ID");
        }
        log.info("按ID范围查询学生信息: {} - {}", startId, endId);
        List<Student> students = studentServiceImpl.getStudentByIdRange(startId, endId);
        return Result.success(students);
    }
    /**
     * 按性别查询学生信息
     */
    @GetMapping("/sex/{sex}")
    public Result getStudentBySex(@PathVariable String sex) {
        if (sex == null || sex.trim().isEmpty()) {
            return Result.error("性别不能为空");
        }
        if (!sex.equals("男") && !sex.equals("女")) {
            return Result.error("性别只能是'男'或'女'");
        }
        log.info("按性别查询学生信息: {}", sex);
        List<Student> students = studentServiceImpl.getStudentBySex(sex);
        return Result.success(students);
    }
}
