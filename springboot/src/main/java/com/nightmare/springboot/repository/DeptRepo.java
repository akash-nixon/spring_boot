package com.nightmare.springboot.repository;

import com.nightmare.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends JpaRepository<Department,Long> {
}
