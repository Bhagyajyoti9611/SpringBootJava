package com.gentech.bank.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentech.bank.dto.AccountDto;
import com.gentech.bank.entity.Account;
import com.gentech.bank.entity.repository.AccountRepository;
import com.gentech.bank.mapper.AccountMapper;
import com.gentech.bank.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account=AccountMapper.mapToAccount(accountDto);
		Account savedAccount=accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccount(Long id) {
		Account account=accountRepository.findById(id).orElseThrow(() ->
		new RuntimeException("The Account Id "+id+" does not exist!!!"));
		return AccountMapper.mapToAccountDto(account);
	}

	@Override
	public AccountDto depositAmount(Long id, double amount) {
		Account account=accountRepository.findById(id).orElseThrow(() ->
		new RuntimeException("The Account Id "+id+" does not exist!!!"));
		
		double total=account.getBalance() + amount;
		account.setBalance(total);
		Account savedAccount=accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto withdrawAmount(Long id, double amount) {
		Account account=accountRepository.findById(id).orElseThrow(() ->
		new RuntimeException("The Account Id "+id+" does not exist!!!"));
		
		if(account.getBalance() < amount)
		{
			throw new RuntimeException("Insuffient Balanace!!!!!!!!");
		}
		double total=account.getBalance() - amount;
		account.setBalance(total);
		Account savedAccount=accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}
	
}
