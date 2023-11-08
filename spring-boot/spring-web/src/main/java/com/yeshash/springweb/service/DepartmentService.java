package com.yeshash.springweb.service;

import java.util.List;
import com.yeshash.springweb.entity.Department;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getDepartmentList();

    public Department getDepartmentById(int id);

    public Department getDepartmentByName(String name);

    public List<Department> deleteDepartmentbyId(int id);

    public List<Department> updateDepartmentById(Department department, int id);
}
