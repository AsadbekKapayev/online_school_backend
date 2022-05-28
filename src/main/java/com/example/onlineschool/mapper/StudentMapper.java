package com.example.onlineschool.mapper;

import com.example.onlineschool.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM student")
    List<Student> findAll();

    @Insert("INSERT INTO student(name, surname) VALUES(#{name}, #{surname})")
    void create(Student student);

    @Select("SELECT * FROM student WHERE id=#{id}")
    Student findById(Long id);

    @Update("UPDATE student SET name=#{name}, surname=#{surname} WHERE id=#{id}")
    void updateStudent(Student student);

    @Delete("DELETE FROM student WHERE id=#{id}")
    void deleteStudent(Long id);
}
