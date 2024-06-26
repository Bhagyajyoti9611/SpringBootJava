package com.gentech.example.entity;

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
@Table(name="user_Table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;

	@Column(name="user_name")
	private String userName;

	@Column(name="job_name")
	private String jobName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_Profile_Id")
	private UserProfile userProfile;

	public User(Long userId, String userName, String jobName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.jobName = jobName;
	}

	public User(String userName, String jobName) {
		super();
		this.userName = userName;
		this.jobName = jobName;
	}


	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public User() {

	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	

}
