package com.gentech.bank.service;

import com.gentech.bank.dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccount(Long id);

	AccountDto depositAmount(Long id, double amount);
	
	AccountDto withdrawAmount(Long id, double amount);
}
