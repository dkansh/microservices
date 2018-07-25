package org.dkansh.account.entity;

public class Account {
	private Integer accountNumber;
	private String accountType;
	private Double amount;

	public Account() {
	}
	
	public Account(Integer accountNumber, String accountType, Double amount) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.amount = amount;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
