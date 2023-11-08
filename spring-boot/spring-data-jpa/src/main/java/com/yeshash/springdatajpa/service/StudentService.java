package com.yeshash.springdatajpa.service;

import java.util.List;
import com.yeshash.springdatajpa.entity.Student;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getStudentList();

    public List<Student> getStudentListByLastName(String lastName);

    public List<Student> getStudentListByFirstName(String firstName);

    public List<Student> getStudentListByGuardianMobileNumber(String number);

    public Student getStudentbyEmailId(String emailId);

    public String getStudentFirstNamebyEmailId(String emailId);

    public Student getStudentbyEmailIdNative(String emailId);

    public String getStudentFirstNamebyEmailIdNative(String emailId);

    public int updateStudentFirstNamebyEmailId(String firstName, String emailId);
}
