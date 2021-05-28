package com.bank;

public class Account {
	
	 static Long acno;
	 static String accountType;
	 static Long bal;
	public Account(Long acno, String accountType, Long bal) {
		super();
		this.acno = acno;
		this.accountType = accountType;
		this.bal = bal;
	}
	public Long getAcno() {
		return acno;
	}
	public void setAcno(Long acno) {
		this.acno = acno;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Long getBal() {
		return bal;
	}
	public void setBal(Long bal) {
		this.bal = bal;
	}
	 
	 

}
