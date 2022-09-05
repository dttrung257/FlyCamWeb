package com.trg.model;

public class Account {
	private long accountId;
	private String email;
	private String password;
	private String fullName;
	private String gender;
	private int age;
	private String country;
	private String phoneNumber;
	private String address;
	private String accountStatus;
	private String role;

	public Account() {
		super();
	}

	public Account(String email, String password, String fullName, String gender, int age, String country,
			String phoneNumber, String address, String accountStatus, String role) {
		super();
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.accountStatus = accountStatus;
		this.role = role;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", password=" + password + ", fullName="
				+ fullName + ", gender=" + gender + ", age=" + age + ", country=" + country + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", accountStatus=" + accountStatus + ", role=" + role + "]";
	}
	
}
