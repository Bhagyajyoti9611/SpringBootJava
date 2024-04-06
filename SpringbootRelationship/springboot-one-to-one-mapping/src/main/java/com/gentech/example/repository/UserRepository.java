package com.gentech.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.example.entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
