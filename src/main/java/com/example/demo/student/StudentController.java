package com.example.demo.student;
// alle bronnen voor de API

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// "api/v1/student" is een endpoint path die een array van student object stuurt via de getStudent methode
@RequestMapping(path = "api/v1/student" )
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    //	endpoint die een array van studenten objecten stuurt naar de client.
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();

    }


}
