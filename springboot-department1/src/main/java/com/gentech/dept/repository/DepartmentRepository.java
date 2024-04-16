package com.gentech.dept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gentech.dept.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
