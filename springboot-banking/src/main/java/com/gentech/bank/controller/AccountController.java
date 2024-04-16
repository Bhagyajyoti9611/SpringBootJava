package com.gentech.bank.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.bank.dto.AccountDto;
import com.gentech.bank.service.AccountService;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping
	public ResponseEntity<AccountDto> saveAccount(@RequestBody 
			AccountDto accountDto)
	{
		return new ResponseEntity<AccountDto>(accountService.createAccount(accountDto), HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<AccountDto> getAccount(@PathVariable("id") Long id)
	{
		return ResponseEntity.ok(accountService.getAccount(id));
	}
	
	@PutMapping("/deposit/{id}")
	public ResponseEntity<AccountDto> depositAmount(@PathVariable("id") Long id,
			@RequestBody Map<String, Double> request)
	{
		double amount=request.get("amount");
		return new ResponseEntity<AccountDto>(accountService.depositAmount(id, amount), HttpStatus.OK);
	}
	
	@PutMapping("/withdraw/{id}")
	public ResponseEntity<AccountDto> withdrawAmount(@PathVariable("id") Long id,
			@RequestBody Map<String, Double> request)
	{
		double amount=request.get("amount");
		return new ResponseEntity<AccountDto>(accountService.withdrawAmount(id, amount), HttpStatus.OK);
	}
}
