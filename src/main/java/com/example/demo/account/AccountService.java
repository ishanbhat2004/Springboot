package com.example.demo.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService {
	
	private final AccountRepository accountRepository; 
	
	
	
	@Autowired
	public AccountService(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}




	public List<Account> getAccount() {
		return accountRepository.findAll();
    }
}
