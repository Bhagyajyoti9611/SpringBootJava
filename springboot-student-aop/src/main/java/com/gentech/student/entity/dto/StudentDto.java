package com.gentech.student.entity.dto;

public class StudentDto {

	private long id;
	private String firstName;
	private String emailId;
	
	public StudentDto()
	{
		
	}
	public StudentDto(String firstName, String emailId) {
		super();
		this.firstName = firstName;
		this.emailId = emailId;
	}
	public StudentDto(long id, String firstName, String emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
