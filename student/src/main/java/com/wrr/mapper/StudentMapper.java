package com.wrr.mapper;

import com.wrr.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author wrr
 * @create 2025/03/18
 * @desc  数据库操作接口
 */
@Mapper
public interface StudentMapper {

    List<Student> getStudent();

    Student getStudentById(Integer id);

    void updateStudent(Student student);

    void deleteStudent(Integer id);

    void addStudent(Student student);

    /**
     * 获取最大id
     */
    Integer getMaxId();

    /**
     * 多条件查询学生信息
     */
    List<Student> getStudentByConditions(Student student);

    /**
     * 按ID范围查询学生信息
     */
    List<Student> getStudentByIdRange(@Param("startId") Integer startId, @Param("endId") Integer endId);

    /**
     * 按性别查询学生信息
     */
    List<Student> getStudentBySex(@Param("sex") String sex);
}
