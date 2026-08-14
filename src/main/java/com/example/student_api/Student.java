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
    @NotBlank(message="Must add the email")
    private String mail;

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public String getMail() { return mail; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDept(String dept) { this.dept = dept; }
    public void setMail(String mail) { this.mail = mail; }
}