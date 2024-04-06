package com.gentech.dept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gentech.dept.entity.Department;
//                                                     (CLASS NAME,  iD(PRIMARY KEY NAME IS lONG)
@Repository                                          
public interface DeptRepository extends JpaRepository<Department, Long> {//save, findAll, findByID, deleteByID

	
	
}
