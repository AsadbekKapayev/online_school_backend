package com.example.onlineschool.service;

import com.example.onlineschool.mapper.StudentMapper;
import com.example.onlineschool.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void create(Student student) {
        studentMapper.create(student);
    }

    @Override
    public Student get(Long id) {
        return studentMapper.findById(id);
    }

    @Override
    public List<Student> list() {
        return studentMapper.findAll();
    }

    @Override
    public void update(Student student) {
        studentMapper.updateStudent(student);
    }

    @Override
    public void delete(Long id) {
        studentMapper.deleteStudent(id);
    }
}
