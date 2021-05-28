package com.bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.Logger;







public class MainTest extends Customer {
	
	public MainTest(){
		super(customer_id, name, add);
	}

	public MainTest(String customer_id, String name, String add) {
		super(customer_id, name, add);
		
	}

	HashMap<String,Customer> map=new HashMap<String,Customer>();
	Scanner sc=new Scanner(System.in);
	static Logger log=Logger.getLogger(MainTest.class.getName());
	
	
	public void addCustomer() throws Exception{
		
		System.out.println("Enter Customer id");
		 String customer_id=sc.next();
		System.out.println("Enter Customer Name : ");
		 String name=sc.next();
		System.out.println("Enter Customer Address : "); 
		 String add=sc.next();
		 Customer c=new Customer(customer_id,name,add);
		 map.put(customer_id,c);
		 System.out.println("New Customer Added Successfully");
		    System.out.println("Welcome to  Bank System Mr./Ms."+c.name);
		    log.info("Customer Added");
		 
	 }
	
	public void getCustomer() throws Exception
	   {
	    System.out.println("Enter customer id to view account : ");
	    String customer_id=sc.next();
	    
	    if(map.containsKey(customer_id))
	    {
	    	System.out.println("Customer details");
	    	System.out.println(Customer.customer_id+"\t"+Customer.name+"\t"+Customer.add+"\t"+Account.acno+"\t"+Account.accountType+"\t"+Account.bal);
	    	log.info("Customer Information");
	    	 
	    }
	 
	    else
	    	System.out.println("Customer does not exist");
	      
	    
	   }
    
	 
	  
 		
 		
	    	
	    	
	
	
	public void delCustomer() throws Exception{
		 System.out.println("Enter Customer id to be Deleted");
		 String customer_id=sc.next();
		    
		    if(map.containsKey(customer_id))
		    {
		
		    	map.remove(customer_id);
		    	System.out.println("Successfully deleted");
		    	log.info("Customer deleted");
		    }
	
	}
	
	public void account() throws Exception{
		System.out.println("Enter the Customer id");
		String customer_id=sc.next();
	    
	    if(map.containsKey(customer_id))
	    {
	    	System.out.println("Enter account number");
	    	Long acno=sc.nextLong();
	    	System.out.println("Enter account type");
	    	String accountType=sc.next();
	    	System.out.println("Enter account balance");
	    	Long bal=sc.nextLong();
	    	Account A1=new Account(acno,accountType,bal);
	    	accounts.add(A1);
	    	System.out.println("These are account details");
	    	log.info("Account details entered to customer");
	    }
		
	}
	
	
	 public void upCustomer() throws Exception
	   {
	    System.out.println("Enter Customer id to be Update customer details : ");
	    String customer_id=sc.next();
	    
	    if(map.containsKey(customer_id))
	    {
	    	
			System.out.println("Enter Customer Name : ");
			 String name=sc.next();
			System.out.println("Enter Customer Address : "); 
			 String add=sc.next();
			 Customer c=new Customer(customer_id,name,add);
			 map.put(customer_id,c);
			 
			 System.out.println("Enter account number");
		    	Long acno=sc.nextLong();
		    	System.out.println("Enter account type");
		    	String accountType=sc.next();
		    	System.out.println("Enter account balance");
		    	Long bal=sc.nextLong();
		    	Account A1=new Account(acno,accountType,bal);
		    	accounts.add(A1);
		    	System.out.println("These are account details");
	  
		    	System.out.println(Customer.customer_id+"\t"+Customer.name+"\t"+Customer.add+"\t"+Account.acno+"\t"+Account.accountType+"\t"+Account.bal);
	    	
		    log.info("Customer Updated");
	    }
	   }
	    

	
     public static void main(String[] args) throws Exception {
		    MainTest obj = new MainTest();
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
		    PrintStream ps=new PrintStream(System.out);
		    Scanner sc=new Scanner(System.in);
		 
		    System.out.println("—————————————————–");
		    System.out.println("Welcome To  Bank");
		    System.out.println("—————————————————–");
		 
		    String next = "yes";
		    while(next.equalsIgnoreCase("yes"))
		    {
		    System.out.println("——————– MENU —————————");
		    System.out.println("—————————————————–");
		 
		    System.out.println(" 1 for Add new Customer");
		    System.out.println(" 2 for Delete Existing Customer");
		    System.out.println(" 3 for Update Existing Customer");
		    System.out.println(" 4 for Get Customer Information");
		    System.out.println("5 for Account details");
		 
		    System.out.println("—————————————————–");
		    System.out.println("—————————————————–");
		    System.out.println("Enter Your Choice from 1 to 4 : ");
		 
		 
		    int choice=sc.nextInt();
		 
		    switch(choice)
		    {
		    case 1 :
		    obj.addCustomer();
		    break;
		    case 2 :
		    obj.delCustomer();
		    break;
		    case 3:
		    	obj.upCustomer();
		    	break;
		    case 4 :
		    	obj.getCustomer();
		    break;
		    case 5:
		    	obj.account();
		    break;
		    
		    
		    default :
		    System.out.println("Enter Valid Choice ");
		    break;
		    }
		    System.out.println("Want to Continue?");
		    next = br.readLine();
		 
		    if(next.equalsIgnoreCase("no"))
		    {
		    System.exit(0);
		    }
		    }

	}

}
