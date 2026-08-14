package com.example.student_api;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") //Cors
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @PostMapping("/students")
    public Student addStudent(@Valid @RequestBody Student student) {
        return repository.save(student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
        return "Student deleted successfully!";
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id,@Valid @RequestBody Student updated) {
        updated.setId(id);
        return repository.save(updated);
    }
}