package com.gentech.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.college.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
