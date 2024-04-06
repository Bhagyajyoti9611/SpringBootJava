package com.gentech.dept.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.dept.entity.Department;
import com.gentech.dept.service.DeptService;

@RestController
@RequestMapping("/api/v1")
public class DeptController {

private DeptService deptService;
//    constructor method
public DeptController(DeptService deptService) {
	super();
	this.deptService = deptService;
}


@PostMapping("/dept")
//  returns the data to the postman/browser
    public ResponseEntity<Department> saveDepartment( @RequestBody  Department department )
    {
    	return new  ResponseEntity<Department>(deptService.createDepartment(department), HttpStatus.CREATED);
    }
	
//	 get 
	@GetMapping("/getdept")
	public ResponseEntity<List<Department>> getAllDepts()
	{
		return new ResponseEntity<List<Department>> (deptService.getAllDepartments(),HttpStatus.CREATED);


	}
	@GetMapping("{id}")
	public ResponseEntity<Department> getDept(@PathVariable long id)
	{
		return new ResponseEntity<Department> (deptService.getDepartment(id), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Department> updateDepartmentData(@RequestBody Department department,  @PathVariable("id") long id)
	{
		return new ResponseEntity<Department>(deptService.updateDepartment(department, id), HttpStatus.OK);
	}
	
}
