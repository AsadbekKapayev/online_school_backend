package com.example.onlineschool.controller;

import com.example.onlineschool.mapper.StudentMapper;
import com.example.onlineschool.model.Student;
import com.example.onlineschool.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileReader;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {
    private final StudentServiceImpl studentService;

    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public List<Student> index() {
        return studentService.list();
    }

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student) {
        studentService.create(student);
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable("id") Long id) {
        return studentService.get(id);
    }

    @PatchMapping("/edit/{id}")
    public void updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        student.setId(id);
        studentService.update(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        studentService.delete(id);
    }
}
