package com.gentech.emp.entity;



import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="employee2")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long id;
	
	@Column(name="emp_Name")
	private String empName;
	
	@Column(name="job_Name")
	private String jobName;
	
	@Column(name="email_Id")
	private String emailId;
	
	@Column(name="employee_age")
	private int age;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="city_name")
	private String cityName;
	
	@CreationTimestamp
	private Date createDate;
	
	@UpdateTimestamp
	private Date updateDate;
	
	public Employee() {
		
	}
	
	public Employee(String empName, String jobName, String emailId, int age, double salary, String cityName,
			Date createDate, Date updateDate) {
		super();
		this.empName = empName;
		this.jobName = jobName;
		this.emailId = emailId;
		this.age = age;
		this.salary = salary;
		this.cityName = cityName;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	


	public Employee(long id, String empName, String jobName, String emailId, int age, double salary, String cityName,
			Date createDate, Date updateDate) {
		super();
		this.id = id;
		this.empName = empName;
		this.jobName = jobName;
		this.emailId = emailId;
		this.age = age;
		this.salary = salary;
		this.cityName = cityName;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getJobName() {
		return jobName;
	}


	public void setJobName(String jobName) {
		this.jobName = jobName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
	

}
