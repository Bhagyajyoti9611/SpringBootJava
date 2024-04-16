package com.gentech.employee.dto;

import java.util.Date;

public class EmployeeDto {

	private Long id;
	private String employeeFirstName;
	private String employeeLastName;
	private String jobName;
	private String emailId;
	private int age;
	private Long contactNumber;
	private double salary;
	private String departmentName;
	private String cityName;
	private String address;
	private Date createdAt;
	private Date updatedAt;

	public EmployeeDto()
	{

	}

	public EmployeeDto(String employeeFirstName, String employeeLastName, String jobName, String emailId, int age,
			Long contactNumber, double salary, String departmentName, String cityName, String address, Date createdAt,
			Date updatedAt) {
		super();
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.jobName = jobName;
		this.emailId = emailId;
		this.age = age;
		this.contactNumber = contactNumber;
		this.salary = salary;
		this.departmentName = departmentName;
		this.cityName = cityName;
		this.address = address;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public EmployeeDto(Long id, String employeeFirstName, String employeeLastName, String jobName, String emailId,
			int age, Long contactNumber, double salary, String departmentName, String cityName, String address,
			Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.jobName = jobName;
		this.emailId = emailId;
		this.age = age;
		this.contactNumber = contactNumber;
		this.salary = salary;
		this.departmentName = departmentName;
		this.cityName = cityName;
		this.address = address;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
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
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
