package com.gentech.student.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.student.entity.dto.StudentDto;
import com.gentech.student.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto)
	{
		return new ResponseEntity<StudentDto>(studentService.addStudent(studentDto), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<StudentDto>> displayAllStudents()
	{
		return new ResponseEntity<List<StudentDto>>(studentService.getAllStudents(), HttpStatus.OK);
	}
}
