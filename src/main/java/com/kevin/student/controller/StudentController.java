package com.kevin.student.controller;

import com.kevin.student.model.Student;
import com.kevin.student.repository.StudentRepository;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")

public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // POST - Save student with validation
    @PostMapping
    public Student saveStudent(@Valid @RequestBody Student student) {
        return studentRepository.save(student);
    }

    // GET - Fetch all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
