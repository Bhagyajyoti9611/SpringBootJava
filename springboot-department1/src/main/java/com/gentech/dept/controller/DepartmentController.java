package com.gentech.dept.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.dept.entity.Department;
import com.gentech.dept.service.DepartmentService;

@RestController
@RequestMapping(path = "/api/v1/departments")
public class DepartmentController {
	
	private DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}
	
	//http://localhost:8082/api/v1/departments
	@PostMapping
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department)
	{
		return new ResponseEntity<Department>(departmentService.createDepartment(department), HttpStatus.CREATED);
	}
	
	//http://localhost:8082/api/v1/departments
	@GetMapping
	public ResponseEntity<List<Department>> getAllDepartments()
	{
		return new ResponseEntity<List<Department>>(departmentService.getAllDepartments(), HttpStatus.OK);
	}

	//http://localhost:8082/api/v1/departments/1
	@GetMapping("{id}")
	public ResponseEntity<Department> getParticularDepartment(@PathVariable("id") long id)
	{
		return new ResponseEntity<Department>(departmentService.getDepartment(id), HttpStatus.OK);
	}
	
	//http://localhost:8082/api/v1/departments/1
	@PutMapping("{id}")
	public ResponseEntity<Department> modifyDepartment(@RequestBody Department dept,
			@PathVariable("id") long id)
	{
		return new ResponseEntity<Department>(departmentService.updateDepartment(dept, id), HttpStatus.OK);
	}
	
	//http://localhost:8082/api/v1/departments/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> removeDepartment(@PathVariable("id") long id)
	{
		departmentService.deleteDepartment(id);
		return new ResponseEntity<String>("The department id "+id+" has deleted successfully", HttpStatus.OK);
	}
}
