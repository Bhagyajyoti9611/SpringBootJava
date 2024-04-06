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
public class SpringbootManyToManyMapping1Application  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootManyToManyMapping1Application.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1=new Student("Santhosh","santhu@gamail.com");
		Student student2=new Student("Anusha","anusha@gamil.com");
		Course course1=new Course("Mathematics","Msc mathematics");
		Course course2=new Course("DataScience","Msc mathematics");

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
