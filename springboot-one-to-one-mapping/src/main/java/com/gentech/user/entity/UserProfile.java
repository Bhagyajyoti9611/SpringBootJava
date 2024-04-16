package com.gentech.user.entity;

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
@Table(name = "tbl_user_profiles")
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_profile_id")
	private Long userProfileId;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	@Column(name = "email_id")
	private String emailId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	public UserProfile()
	{
		
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
