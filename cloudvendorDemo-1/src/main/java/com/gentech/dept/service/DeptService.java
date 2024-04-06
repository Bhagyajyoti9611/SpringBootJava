package com.gentech.dept.service;

import java.util.List;

import com.gentech.dept.entity.Department;

public interface DeptService {
//       Abstract method ( method declaration)
//	 class name   ( class type  like String, long)   method name ( class name reference name)
	Department createDepartment(Department departdment);
//	    Get 
	List<Department> getAllDepartments();
	
//	particular person only one id get 
	Department getDepartment(Long id);
	
	Department updateDepartment(Department department, Long id);
	//void deleteDepartment(long id);
	
}
