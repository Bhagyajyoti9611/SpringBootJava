package com.gentech.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.example.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}
