package com.trg.service.imp;

import java.util.List;

import com.trg.dao.ItfAccountDao;
import com.trg.dao.imp.AccountDao;
import com.trg.model.Account;
import com.trg.service.ItfAccountService;

public class AccountService implements ItfAccountService {
	private ItfAccountDao accountDao = AccountDao.getInstance();
	private static AccountService accountService = null;

	private AccountService() {
	}

	public static AccountService getInstance() {
		return accountService == null ? new AccountService() : null;
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return accountDao.findAll();
	}

	@Override
	public List<Account> findAll(String orderBy, String orderType, int limit) {
		// TODO Auto-generated method stub
		return accountDao.findAll(orderBy, orderType, limit);
	}

	@Override
	public Account findAccount(String email) {
		// TODO Auto-generated method stub
		return accountDao.findAccount(email);
	}

	@Override
	public Account findAccount(String email, String password) {
		// TODO Auto-generated method stub
		return accountDao.findAccount(email, password);
	}

	@Override
	public Account save(Account account) {
		return accountDao.save(account);
	}

	@Override
	public Account update(Account account) {
		return accountDao.update(account);
	}

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		System.out.println("hello");
	}
}
