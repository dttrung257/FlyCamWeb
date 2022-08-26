package com.trg.dao;

import java.util.List;

import com.trg.model.Account;

public interface ItfAccountDao extends ItfDao<Account> {
	List<Account> findAll();
	
	List<Account> findAll(String sortBy, String orderType, int limit);
	
	Account findAccount(String email);

	Account findAccount(String email, String password);
	
	Account save(Account account);
	
	Account update(Account account);
	
	void delete(Long accountId);
}
