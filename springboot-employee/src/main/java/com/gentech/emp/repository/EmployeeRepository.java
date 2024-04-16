package com.gentech.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gentech.emp.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
