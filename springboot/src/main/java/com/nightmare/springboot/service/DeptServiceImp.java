package com.nightmare.springboot.service;

import com.nightmare.springboot.entity.Department;
import com.nightmare.springboot.repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImp implements DepartmentService{

    @Autowired
    private DeptRepo deptRepo;
    @Override
    public Department saveDepartment(Department department) {
        return deptRepo.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return deptRepo.findAll();
    }
}
