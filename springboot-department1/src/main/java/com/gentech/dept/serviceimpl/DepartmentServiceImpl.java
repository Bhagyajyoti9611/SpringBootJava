package com.gentech.dept.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gentech.dept.entity.Department;
import com.gentech.dept.exception.ResourceNotFoundException;
import com.gentech.dept.repository.DepartmentRepository;
import com.gentech.dept.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{

	private DepartmentRepository departmentRepository=null;

	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	@Override
	public Department createDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartment(long id) {
		Department existingDept=departmentRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Department", "id", id));
				
		return existingDept;
	}

	@Override
	public Department updateDepartment(Department department, long id) {
		Department existingDept=departmentRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Department", "id", id));
		existingDept.setDepartmentName(department.getDepartmentName());
		existingDept.setEmailId(department.getEmailId());
		existingDept.setLocation(department.getLocation());
		departmentRepository.save(existingDept);
		
		return existingDept;
	}

	@Override
	public void deleteDepartment(long id) {
		
		departmentRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Department", "id", id));
		
		departmentRepository.deleteById(id);
	}
	
}
