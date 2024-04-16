package com.gentech.dept.service;

import java.util.List;
import com.gentech.dept.entity.Department;

public interface DepartmentService {
	
	Department createDepartment(Department department);
	
	List<Department> getAllDepartments();
	
	Department getDepartment(long id);

	Department updateDepartment(Department department, long id);
	
	void deleteDepartment(long id);
}
