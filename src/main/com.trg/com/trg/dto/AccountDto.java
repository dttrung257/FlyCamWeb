package com.trg.dto;

import com.trg.model.Account;

public class AccountDto {
	private long accountId;
	private String email;
	private String fullName;
	private String gender;
	private int age;
	private String country;
	private String phoneNumber;
	private String address;
	private String accountStatus;
	private String role;
	
	public AccountDto() {
		super();
	}

	public AccountDto(Account account) {
		super();
		this.email = account.getEmail();
		this.fullName = account.getFullName();
		this.gender = account.getGender();
		this.age = account.getAge();
		this.country = account.getCountry();
		this.phoneNumber = account.getPhoneNumber();
		this.address = account.getAddress();
		this.accountStatus = account.getAccountStatus();
		this.role = account.getRole();
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
