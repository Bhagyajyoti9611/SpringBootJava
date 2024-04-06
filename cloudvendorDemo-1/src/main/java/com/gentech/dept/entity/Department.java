package com.gentech.dept.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dept")
public class Department {
		
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
//	        id is Long so it is used in repository(Department, Long)
	private long deptId;
	
	@Column(name="dept_Name")
	
	private String deptName;
	
	@Column(name="location")
	private String location;
	
	
//      getter & setter method  
	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Department()
	{
		
	}
	
//	     constractior
	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}
	
}
