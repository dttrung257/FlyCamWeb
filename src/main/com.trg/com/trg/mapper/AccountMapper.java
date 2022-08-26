package com.trg.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.trg.model.Account;

public class AccountMapper implements RowMapper<Account> {
	private static AccountMapper accountMapper = null;
	
	private AccountMapper() {
	}
	
	public static AccountMapper getInstance() {
		return accountMapper == null ? new AccountMapper() : accountMapper;
	}

	@Override
	public Account mapRow(ResultSet rs) {
		Account account = new Account();
		try {
			account.setAccountId(rs.getLong("accountId"));
			account.setEmail(rs.getString("email"));
			account.setPassword(rs.getString("password"));
			account.setFullName(rs.getString("fullName"));
			account.setPhoneNumber(rs.getString("phoneNumber"));
			account.setAccountStatus(rs.getString("accountStatus"));
			account.setRole(rs.getString("role"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
	}
}
