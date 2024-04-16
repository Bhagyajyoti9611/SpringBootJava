package com.gentech.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.college.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
