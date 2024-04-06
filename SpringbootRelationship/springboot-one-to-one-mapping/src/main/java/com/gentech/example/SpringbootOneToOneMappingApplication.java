package com.gentech.example;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gentech.example.entity.User;
import com.gentech.example.entity.UserProfile;
import com.gentech.example.repository.UserProfileRepository;
import com.gentech.example.repository.UserRepository;

@SpringBootApplication
public class SpringbootOneToOneMappingApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneToOneMappingApplication.class, args);
	}
   @Autowired
	private UserRepository userRepository;
	
   @Autowired
	private UserProfileRepository UserProfileRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		User user= new User();
		user.setUserName("Santosh");
		user.setJobName("Sales VP");
		
		UserProfile userProfile= new UserProfile();
		userProfile.setEmailId("satosh@gamil.com");
		userProfile.setPhoneNumber("96779645324");
		userProfile.setDateOfBirth(LocalDate.of(1995, 4, 25));
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		
		// userRepository or UserProfileRepository  any one save another one is atomatic saveing.
		// UserprofileRepository.save(userProfile); or 
		userRepository.save(user);
		
		
		
	}

}
