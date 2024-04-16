package com.gentech.student.aop;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.gentech.student.entity.Student;
import com.gentech.student.entity.dto.StudentDto;

@Aspect
@Component
public class StudentAspect {
	
	@Before(value = "execution(* com.gentech.student.controller.StudentController.*(..))")
	public void beforeAdvice(JoinPoint joinPoint)
	{
		System.out.println("The Business Logic of Controller classs, Method "+ joinPoint.getSignature() + " has started at "+ new Date());
	}

	@After(value = "execution(* com.gentech.student.controller.StudentController.*(..))")
	public void afterAdvice(JoinPoint joinPoint)
	{
		System.out.println("The Business Logic of Controller class, Method "+ joinPoint.getSignature() + " has ended at "+ new Date());
	}
	
	@Before(value = "execution(* com.gentech.student.serviceimpl.StudentServiceImpl.*(..))")
	public void beforeServiceAdvice(JoinPoint joinPoint)
	{
		System.out.println("The Business Logic of ServiceImpl classs, Method "+ joinPoint.getSignature() + " has started at "+ new Date());
	}

	@After(value = "execution(* com.gentech.student.serviceimpl.StudentServiceImpl.*(..))")
	public void afterServiceAdvice(JoinPoint joinPoint)
	{
		System.out.println("The Business Logic of ServiceImpl class, Method "+ joinPoint.getSignature() + " has ended at "+ new Date());
	}
	
	@AfterReturning(value = "execution(* com.gentech.student.service.StudentService.addStudent(..))", returning = "studentDto")
	public void afterReturningAdviceForAddStudentService(JoinPoint joinPoint,StudentDto studentDto)
	{
		System.out.println(joinPoint.getSignature()+" the Logic for Creating Student with required parameters has perfromed successfullly :"+studentDto.getId()+" "+studentDto.getFirstName());
	}
	
	
	@AfterThrowing(value = "execution(* com.gentech.student.service.StudentService.addStudent(..))", throwing = "exception")
	public void afterThrowingAdviceForAddStudentService(JoinPoint joinPoint,Exception exception)
	{
		System.out.println(joinPoint.getSignature()+" the Logic for Creating Student with required parameters has provided and Exception :"+exception);
	}
}
