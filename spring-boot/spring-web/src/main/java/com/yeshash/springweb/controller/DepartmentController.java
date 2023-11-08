package com.yeshash.springweb.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yeshash.springweb.entity.Department;
import com.yeshash.springweb.service.DepartmentService;

@RestController
public class DepartmentController {
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department) {
        LOGGER.info("Department created");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> getDepartmentList() {
        return departmentService.getDepartmentList();
    }

    @GetMapping("/department/id/{id}")
    public Department getDepartmentById(@PathVariable("id") int id) {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/department/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String name) {
        return departmentService.getDepartmentByName(name);
    }

    @DeleteMapping("/department/id/{id}")
    public List<Department> deleteDepartmentbyId(@PathVariable("id") int id) {
        return departmentService.deleteDepartmentbyId(id);
    }

    @PutMapping("/department/id/{id}")
    public List<Department> updateDepartmentById(@RequestBody Department department,
            @PathVariable("id") int id) {
        return departmentService.updateDepartmentById(department, id);
    }
}
