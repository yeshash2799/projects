package com.yeshash.springdatajpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.yeshash.springdatajpa.entity.Student;
import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findByLastName(String lastName);

    public List<Student> findByFirstNameContaining(String firstName);

    public List<Student> findByGuardianMobileNumber(String mobileNumber);

    @Query("select s from Student s where s.emailId = ?1")
    public Student getStudentbyEmailId(String emailId);

    @Query("select s.firstName from Student s where s.emailId = ?1")
    public String getStudentFirstNamebyEmailId(String emailId);

    @Query(value = "select * from student_tbl s where s.student_email_id = ?1", nativeQuery = true)
    public Student getStudentbyEmailIdNative(String emailId);

    @Query(value = "select student_first_name from student_tbl s where s.student_email_id = :emailId", nativeQuery = true)
    public String getStudentFirstNamebyEmailIdNative(@Param("emailId") String emailId);

    @Modifying
    @Transactional
    @Query(value = "update student_tbl s set s.student_first_name = :firstName where s.student_email_id = :emailId", nativeQuery = true)
    public int updateStudentFirstNamebyEmailId(
            @Param("firstName") String firstName,
            @Param("emailId") String emailId);
}
