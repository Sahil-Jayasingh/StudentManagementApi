package com.example.student_api;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dept;
    private String name;

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDept(String dept) { this.dept = dept; }
}