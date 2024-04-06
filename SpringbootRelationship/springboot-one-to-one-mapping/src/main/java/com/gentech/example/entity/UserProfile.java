package com.gentech.example.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_user_profiles")
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_Profile_Id")
	private Long userProfileId;

	@Column(name="phone_Number")
	private String phoneNumber;

	@Column(name="date_Of_Birth")
	private LocalDate dateOfBirth;

	@Column(name="email_Id")
	private String emailId;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;

	public UserProfile(Long userProfileId, String phoneNumber, LocalDate dateOfBirth, String emailId) {
		super();
		this.userProfileId = userProfileId;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailId = emailId;
	}

	public UserProfile(String phoneNumber, LocalDate dateOfBirth, String emailId) {
		super();
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailId = emailId;
	}

	public Long getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(Long userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public UserProfile(User user) {
		super();
		this.user = user;
	}

	public UserProfile()
	{
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
