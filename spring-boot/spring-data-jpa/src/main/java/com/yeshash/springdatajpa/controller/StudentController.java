package com.yeshash.springdatajpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yeshash.springdatajpa.entity.Student;
import com.yeshash.springdatajpa.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/student")
    public List<Student> getStudentList() {
        return studentService.getStudentList();
    }

    @GetMapping("/student/lastName/{lastName}")
    public List<Student> getStudentListByLastName(@PathVariable("lastName") String lastName) {
        return studentService.getStudentListByLastName(lastName);
    }

    @GetMapping("/student/firstName/{firstName}")
    public List<Student> getStudentListByFirstName(@PathVariable("firstName") String firstName) {
        return studentService.getStudentListByFirstName(firstName);
    }

    @GetMapping("/student/guardianMobileNumber/{guardianMobileNumber}")
    public List<Student> getStudentListByGuardianMobileNumber(@PathVariable("guardianMobileNumber") String number) {
        return studentService.getStudentListByGuardianMobileNumber(number);
    }

    @GetMapping("/student/emailId/{emailId}")
    public Student getStudentbyEmailId(@PathVariable("emailId") String emailId) {
        return studentService.getStudentbyEmailId(emailId);
    }

    @GetMapping("/student/firstName/emailId/{emailId}")
    public String getStudentFirstNamebyEmailId(@PathVariable("emailId") String emailId) {
        return studentService.getStudentFirstNamebyEmailId(emailId);
    }

    @GetMapping("/student/native/emailId/{emailId}")
    public Student getStudentbyEmailIdNative(@PathVariable("emailId") String emailId) {
        return studentService.getStudentbyEmailIdNative(emailId);
    }

    @GetMapping("/student/native/firstName/emailId/{emailId}")
    public String getStudentFirstNamebyEmailIdNative(@PathVariable("emailId") String emailId) {
        return studentService.getStudentFirstNamebyEmailIdNative(emailId);
    }

    @PutMapping("/student/firstName/{firstName}/emailId/{emailId}")
    public int updateStudentFirstNamebyEmailId(
            @PathVariable("firstName") String firstName,
            @PathVariable("emailId") String emailId) {
        return studentService.updateStudentFirstNamebyEmailId(firstName, emailId);
    }
}
