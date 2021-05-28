package com.bank;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Account {
	
	 static String customer_id;
	static String name;
	static String add;
	 
	 List<Account> accounts=new ArrayList<Account>();
	 Account a=new Account(acno,accountType,bal);
	 
	 
	public Customer(String customer_id, String name, String add) {
		super(acno, accountType, bal);
		this.customer_id = customer_id;
		this.name = name;
		this.add = add;
	}


	public String getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public List<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customer_id == null) ? 0 : customer_id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customer_id == null) {
			if (other.customer_id != null)
				return false;
		} else if (!customer_id.equals(other.customer_id))
			return false;
		return true;
	}
	
	
	 
	 

}
