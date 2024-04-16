package com.gentech.employee.entity;

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
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "employee_first_name")
	private String employeeFirstName;

	@Column(name = "employee_last_name")
	private String employeeLastName;

	@Column(name = "employee_job_name")
	private String jobName;

	@Column(name = "employee_email_id")
	private String emailId;

	@Column(name = "employee_age")
	private int age;

	@Column(name = "employee_contact_number")
	private Long contactNumber;

	@Column(name = "employee_salary")
	private double salary;

	@Column(name = "employee_department_name")
	private String departmentName;

	@Column(name = "employee_city_name")
	private String cityName;

	@Column(name = "employee_address")
	private String address;

	@CreationTimestamp
	@Column(name = "created_at")
	private Date createdAt;

	@UpdateTimestamp
	@Column(name = "updated_at")
	private Date updatedAt;

	public Employee() {

	}


	public Employee(String employeeFirstName, String employeeLastName, String jobName, String emailId, int age,
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

	public Employee(Long id, String employeeFirstName, String employeeLastName, String jobName, String emailId, int age,
			Long contactNumber, double salary, String departmentName, String cityName, String address, Date createdAt,
			Date updatedAt) {
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
