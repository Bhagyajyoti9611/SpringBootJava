package com.gentech.student.service;

import java.util.List;

import com.gentech.student.entity.dto.StudentDto;

public interface StudentService {
	
	StudentDto addStudent(StudentDto studentDto);
	
	List<StudentDto> getAllStudents();

}