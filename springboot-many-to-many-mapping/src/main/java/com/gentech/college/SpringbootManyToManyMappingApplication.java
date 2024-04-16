package com.gentech.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gentech.college.entity.Course;
import com.gentech.college.entity.Student;
import com.gentech.college.repository.CourseRepository;
import com.gentech.college.repository.StudentRepository;

@SpringBootApplication
public class SpringbootManyToManyMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootManyToManyMappingApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Student student1=new Student("Santosh", "santosh@gmail.com");
		Student student2=new Student("Anusha","anu@gmail.com");
		
		Course course1=new Course("Mathematics", "Algebra Mathematics");
		Course course2=new Course("Data Science", "Basic Data Science Concepts");
		
		student1.getCourses().add(course1);
		student1.getCourses().add(course2);
		
		course1.getStudents().add(student1);
		course2.getStudents().add(student1);
		
		student2.getCourses().add(course1);
		student2.getCourses().add(course2);
		
		course1.getStudents().add(student2);
		course2.getStudents().add(student2);
		
		studentRepository.save(student1);
		studentRepository.save(student2);
	}

}
