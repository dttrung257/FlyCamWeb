package com.trg.service;

import java.util.List;

import com.trg.model.Account;

public interface ItfAccountService {
	List<Account> findAll();
	
	List<Account> findAll(String orderBy, String orderType, int limit);
	
	Account findAccount(String email);
	
	Account findAccount(String email, String password);
	
	Account save(Account account);
	
	Account update(Account account);
	
	void delete(Account account);
}
