package com.example.student_api;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dept;
    private String name;
    @NotBlank(message="Must add the email")
    @Pattern(
        regexp = "^[A-Za-z0-9._%+-]+@muj\\.manipal\\.edu$",
        message = "Email must belong to the @muj.manipal.edu domain"
    )
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