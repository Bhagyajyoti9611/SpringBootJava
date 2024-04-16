package com.gentech.bank.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
