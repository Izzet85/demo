package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1l,
                        "Izzet",
                        "izzetates85@gmail.com",
                        36,
                        LocalDate.of(1985, Month.MARCH,1)


                )
        );
    }
}
