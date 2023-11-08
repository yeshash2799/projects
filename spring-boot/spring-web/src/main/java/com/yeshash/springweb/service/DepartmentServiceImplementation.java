package com.yeshash.springweb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yeshash.springweb.entity.Department;
import com.yeshash.springweb.repository.DepartmentRepository;

@Service
public class DepartmentServiceImplementation implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department getDepartmentByName(String name) {
        return departmentRepository.findByNameIgnoreCase(name);
    }

    @Override
    public List<Department> deleteDepartmentbyId(int id) {
        departmentRepository.deleteById(id);
        return departmentRepository.findAll();
    }

    @Override
    public List<Department> updateDepartmentById(Department department, int id) {
        Department departmentFromDB = departmentRepository.findById(id).get();

        departmentFromDB.setName(department.getName());
        departmentFromDB.setAddress(department.getAddress());
        departmentFromDB.setCode(department.getCode());

        departmentRepository.save(departmentFromDB);

        return departmentRepository.findAll();
    }
}
