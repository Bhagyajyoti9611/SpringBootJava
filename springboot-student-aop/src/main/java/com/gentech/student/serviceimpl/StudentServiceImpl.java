package com.gentech.student.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentech.student.entity.Student;
import com.gentech.student.entity.dto.StudentDto;
import com.gentech.student.mapper.StudentMapper;
import com.gentech.student.repository.StudentRepository;
import com.gentech.student.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentDto addStudent(StudentDto studentDto) {
		Student student=StudentMapper.mapToStudent(studentDto);
		if(student.getFirstName().length()<5)
		{
			try
			{
				throw new Exception("The First Name of the Employee should not be less than 5 Characters");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		Student savedStudent=studentRepository.save(student);
		return StudentMapper.mapToStudentDto(savedStudent);
	}

	@Override
	public List<StudentDto> getAllStudents() {
		
		return studentRepository.findAll().stream()
				.map((student) -> StudentMapper.mapToStudentDto(student))
				.collect(Collectors.toList());
	}
	
	
}
