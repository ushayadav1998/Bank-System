package com.assignment;

public class Customer {
	
	 Long acno;
	 String name;
	 String add;
     Long bal;
	 String accountType;
	 String customer_id;
	
	public Customer(Long acno, String name, String add, Long bal,
			String accountType, String customer_id) {
		super();
		this.acno = acno;
		this.name = name;
		this.add = add;
		this.bal = bal;
		this.accountType = accountType;
		this.customer_id = customer_id;
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
