package com.gentech.college.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long courseId;
	
	@Column(name="course_Name")
     private String courseName;
	
	@Column(name="course_description")
     private String description;
     
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
     Set<Student> students = new HashSet<>();

	public Course(String courseName, String description) {
		super();
		this.courseName = courseName;
		this.description = description;
	}
	public Course() {
		
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
     
	
	
}
