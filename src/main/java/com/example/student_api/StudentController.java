package com.example.student_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repository;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
        return "Student deleted successfully!";
    }
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updated) {
        updated.setId(id);
        return repository.save(updated);
    }
}