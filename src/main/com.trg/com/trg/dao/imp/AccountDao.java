package com.trg.dao.imp;

import java.util.List;

import com.trg.dao.ItfAccountDao;
import com.trg.mapper.AccountMapper;
import com.trg.model.Account;

public class AccountDao extends Dao<Account> implements ItfAccountDao {
	private AccountMapper accountMapper = AccountMapper.getInstance();
	private static AccountDao accountDao;

	private AccountDao() {
	}

	public static AccountDao getInstance() {
		return accountDao == null ? new AccountDao() : accountDao;
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from accounts;";
		return query(sql, accountMapper);
	}

	@Override
	public List<Account> findAll(String sortBy, String orderType, int limit) {
		// Note : Can't use 2 question marks (?) next to each other ( ? ? => fail).
		String sql = "select * from accounts order by " + sortBy + " " + orderType + " limit " + limit;
		return query(sql, accountMapper);
	}

	@Override
	public Account findAccount(String email) {
		String sql = "select * from accounts where email = ?;";
		List<Account> result = query(sql, accountMapper, email);
		if (result == null || result.isEmpty()) {
			return null;
		}
		return result.get(0);
	}

	@Override
	public Account findAccount(String email, String password) {
		// TODO Auto-generated method stub
		String sql = "select * from accounts where email = ? and password = ?;";
		List<Account> result = query(sql, accountMapper, email, password);
		if (result == null || result.isEmpty()) {
			return null;
		}
		return result.get(0);
	}

	@Override
	public Account save(Account account) {
		String sql = "insert into accounts "
				+ "(email, password, fullName, gender, age, country, phoneNumber, address, accountStatus, role)"
				+ " values "
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		if (query(sql, account.getEmail(), account.getPassword(), account.getFullName(), account.getGender(),
				account.getAge(), account.getCountry(), account.getPhoneNumber(), account.getAddress(),
				account.getAccountStatus(), account.getRole())) {
			return account;
		}
		return null;
	}

	@Override
	public Account update(Account account) {
		String sql = "update accounts "
				+ "set email = ?, password = ?, fullName = ?, gender = ?, age = ?, country = ?, phoneNumber = ?, address = ?, accountStatus = ?, role = ? "
				+ "where accountId = ?;";

		if (query(sql, account.getEmail(), account.getPassword(), account.getFullName(), account.getGender(),
				account.getAge(), account.getCountry(), account.getPhoneNumber(), account.getAddress(),
				account.getAccountStatus(), account.getRole(), account.getAccountId())) {
			return account;
		}
		return null;
	}

	@Override
	public void delete(Long accountId) {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		System.out.println(AccountDao.getInstance().findAccount("tien@gmail.com"));
	}
}
