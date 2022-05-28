package com.example.onlineschool.service;

import com.example.onlineschool.model.Student;

import java.util.List;

public interface StudentService {
    void create(Student student);
    List<Student> list();
    Student get(Long id);
    void update(Student student);
    void delete(Long id);
}
