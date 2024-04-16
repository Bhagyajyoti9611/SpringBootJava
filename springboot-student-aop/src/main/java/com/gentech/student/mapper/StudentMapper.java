package com.gentech.student.mapper;

import com.gentech.student.entity.Student;
import com.gentech.student.entity.dto.StudentDto;

public class StudentMapper {
	
	public static Student mapToStudent(StudentDto studentDto)
	{
		Student student=new Student(
				studentDto.getId(),
				studentDto.getFirstName(),
				studentDto.getEmailId()
				
				);
		return student;
	}
	
	public static StudentDto mapToStudentDto(Student student)
	{
		StudentDto studentDto=new StudentDto(
				student.getId(),
				student.getFirstName(),
				student.getEmailId()
				
				);
		return studentDto;
	}

}
