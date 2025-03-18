package com.wrr.mapper;

import com.wrr.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> getStudent();

    @Select("select * from student where id=#{id}")
    Student getStudentById(Integer id);

    @Update("update student set name=#{name},age=#{age},sex=#{sex},address=#{address},phone=#{phone} where id=#{id}")
    void updateStudent(Student student);

    @Delete("delete from student where id=#{id}")
    void deleteStudent(Integer id);

    @Insert("insert into student(id,name,age,sex,address,phone) values(#{id},#{name},#{age},#{sex},#{address},#{phone})")
    void addStudent(Student student);

    /**
     * 获取最大id
     */
    @Select("select max(id) from student")
    Integer getMaxId();
}
