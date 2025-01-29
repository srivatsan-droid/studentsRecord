package com.example.demo.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    //Reference to the Student Service
    private final StudentService studentService;
    //The Student Service will be auto wired to the controller class
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> hello() {
        return studentService.getStudents();
    }
    @PostMapping
    //Post is used to add new Resources to our system
    public void registerStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }
    //Put is used when we need to update an resource in the system
    @Transactional
    public void updateStudent(@PathVariable("studentId") Long studentId, @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId,name,email);
    }
}
