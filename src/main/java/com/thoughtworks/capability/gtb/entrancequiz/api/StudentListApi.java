package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class StudentListApi {

    private final StudentService studentService;
    public StudentListApi(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudentList(){
        return studentService.getAllStudent();
    }

    @PostMapping("/students/add")
    public List<Student> addStudent(@RequestBody String name){
        return studentService.addStudent(name);
    }

    @GetMapping("/students/sort")
    public List<Student> sortStudent(){
        return studentService.sortStudent();
    }
}
