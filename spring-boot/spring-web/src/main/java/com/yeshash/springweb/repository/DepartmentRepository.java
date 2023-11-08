package com.yeshash.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yeshash.springweb.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    public Department findByNameIgnoreCase(String departmentName);
}
