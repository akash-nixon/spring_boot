package com.nightmare.springboot.service;

import com.nightmare.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();
}
