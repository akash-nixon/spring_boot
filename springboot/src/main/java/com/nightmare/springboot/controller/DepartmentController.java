package com.nightmare.springboot.controller;


import com.nightmare.springboot.entity.Department;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){

    }
}
