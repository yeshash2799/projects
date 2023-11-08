package com.yeshash.springdatajpa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yeshash.springdatajpa.entity.Student;
import com.yeshash.springdatajpa.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getStudentListByLastName(String lastName) {
        return studentRepository.findByLastName(lastName);
    }

    @Override
    public List<Student> getStudentListByFirstName(String firstName) {
        return studentRepository.findByFirstNameContaining(firstName);
    }

    @Override
    public List<Student> getStudentListByGuardianMobileNumber(String number) {
        return studentRepository.findByGuardianMobileNumber(number);
    }

    @Override
    public Student getStudentbyEmailId(String emailId) {
        return studentRepository.getStudentbyEmailId(emailId);
    }

    @Override
    public String getStudentFirstNamebyEmailId(String emailId) {
        return studentRepository.getStudentFirstNamebyEmailId(emailId);
    }

    @Override
    public Student getStudentbyEmailIdNative(String emailId) {
        return studentRepository.getStudentbyEmailIdNative(emailId);
    }

    @Override
    public String getStudentFirstNamebyEmailIdNative(String emailId) {
        return studentRepository.getStudentFirstNamebyEmailIdNative(emailId);
    }

    @Override
    public int updateStudentFirstNamebyEmailId(String firstName, String emailId) {
        return studentRepository.updateStudentFirstNamebyEmailId(firstName, emailId);
    }
}
