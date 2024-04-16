package com.gentech.user;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gentech.user.entity.User;
import com.gentech.user.entity.UserProfile;
import com.gentech.user.repository.UserProfileRepository;
import com.gentech.user.repository.UserRepository;

@SpringBootApplication
public class SpringbootOneToOneMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneToOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user=new User();
		user.setUserName("Santosh");
		user.setJobName("Sales VP");
		
		UserProfile userProfile=new UserProfile();
		userProfile.setEmailId("santosh@gmail.com");
		userProfile.setPhoneNumber("9080102030");
		userProfile.setDateOfBirth(LocalDate.of(1995, 6, 25));
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
		
	}

}
