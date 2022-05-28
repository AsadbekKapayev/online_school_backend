package com.example.onlineschool.model;

import lombok.Data;

@Data
public class Student {
    private Long id;
    private String name;
    private String surname;

    public Student(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
