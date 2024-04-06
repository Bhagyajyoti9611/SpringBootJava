package com.gentech.emp.dto;

import java.util.Date;

public class EmployeeDto {
	private  long id;
	private String empName;
	private String jobName;
	private String emailId;
	private int age;
	private double salary;
	private String cityName;
	private Date createDate;
	private Date updateDate;
	
	public EmployeeDto() {
		
	}
	public EmployeeDto(String empName, String jobName, String emailId, int age, double salary, String cityName,
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
	
	public EmployeeDto(long id, String empName, String jobName, String emailId, int age, double salary, String cityName,
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

