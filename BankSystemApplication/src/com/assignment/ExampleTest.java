package com.assignment;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;








public class ExampleTest {

	HashMap<String,Customer> map=new HashMap<String,Customer>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static Logger log=Logger.getLogger(ExampleTest.class.getName());
	 
	 public void addCustomer() throws Exception{
		 
		 System.out.println("?- Enter Customer Data ?-");
		    System.out.println("Enter Customer Name : ");
		    String nm = br.readLine(); 
		    System.out.println("Enter Customer Address : ");
		    String ad = br.readLine();
		    System.out.println("Enter Customer Account Number : ");
		    Long ac = Long.parseLong(br.readLine()); 
		    System.out.println("Enter Customer Initial Balance : ");
		    Long bl = Long.parseLong(br.readLine());
		    System.out.println("Enter Customer Account Type");
		    String ty=br.readLine();
		    System.out.println("Enter Customer id : ");
		    String id=br.readLine();
		  
		    Customer c=new Customer(ac,nm,ad,bl,ty,id);
		    
		 
		    map.put(id,c);
		    
		    
		      /*for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  */
		   
		 
		    System.out.println("New Customer Added Successfully");
		    System.out.println("Welcome to  Bank System Mr./Ms."+c.name);
		    log.info("Customer Added");
		 
	 }
	 
	 public void delCustomer() throws Exception{
		 System.out.println("Enter Customer id to be Deleted");
		 String id=br.readLine();
		 if(map.containsKey(id))
		    {
		    
		    	map.remove(id);
		    	System.out.println("Successfully deleted");
		    	log.info("Customer deleted");
		    }

      /*   if(map.containsKey(id))
         {
		 Iterator it=map.entrySet().iterator();
		 while(it.hasNext())
		 {
			 Map.Entry record=(Map.Entry)it.next();
			 Customer  c=(Customer)record.getValue();
			
           
        	 String c_name = c.name;
			 map.remove(c);
			
			 System.out.println("Customer"+id+"Removed Successfully");
			System.out.println("Mr./Ms. "+c_name+"You are no longer associated with Bank System");
			 
			 
			 
                
               
			 break;
		 }
			 
     } */
		    
	 }	    

		    
		  
		 
	 
	 
	 public void upCustomer() throws Exception
	    {
	    System.out.println("Enter Customer id to be Update customer details : ");
	    String id=br.readLine();
	  
	    
	    if(map.containsKey(id))
	    {
	    	
	    	System.out.println("Updated Customer");
	    	System.out.println("Enter Customer Account Type");
		    String ty=br.readLine();
		    System.out.println("Enter Customer  Balance : ");
		    Long bl = Long.parseLong(br.readLine());
		    System.out.println("Customer Name : " );
		    String nm = br.readLine();
		    System.out.println("Enter Customer Account Number : ");
		    Long ac = Long.parseLong(br.readLine()); 
		    
		    
		    System.out.println("Customer Address : ");
		    String ad = br.readLine();
		    Customer c_new =new Customer(ac,nm,ad,bl,ty,id);
		    map.put(id, c_new);
		    System.out.println("Customer updated succesfully");
		    log.info("Customer Updated");
	    }
	   }
	    
   

	
	
	 @SuppressWarnings("rawtypes")
	public void getCustomer() throws Exception
	   {
	    System.out.println("Enter customer id to view account : ");
	    String id=br.readLine();
	    
	   /* if(map.containsKey(id))
	    {
	    	map.get(id);
	    }*/
	    
	   
	    Iterator it=map.entrySet().iterator();
	  
	    while(it.hasNext())
	    {
	    	
	    	
	    	Map.Entry record=(Map.Entry)it.next();
	    	Customer c=(Customer)record.getValue();
	    	  if(map.containsKey(id))
	        	{
	    	
	    	System.out.println("Here is your details");
	    
	    	System.out.println("Customer name:"+c.name);
	    	
	    	System.out.println("Key:"+record.getKey()+" "+c.name+" "+c.add+" "+c.bal+" "+c.accountType);
	    	
	    	System.out.println("Here is your account Details");
    		System.out.println("Account Number:"+c.acno);
    		System.out.println("Account Balance:"+c.bal);
    		System.out.println("Account Type:"+c.accountType);
    		
    		log.info("Customer Details");
	    	}
	    	break;
	     }	
	    }
	 
	 
	    
	   
	    
	    
	     
	
	 
	 
	 public static void main(String[] args) throws Exception
	    {
	    ExampleTest obj = new ExampleTest();
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	    System.out.println("??????????????????");
	    System.out.println("Welcome To  Bank");
	    System.out.println("??????????????????");
	 
	    String next = "yes";
	    while(next.equalsIgnoreCase("yes"))
	    {
	    System.out.println("??????? MENU ?????????");
	    System.out.println("??????????????????");
	 
	    System.out.println(" 1 for Add new Customer");
	    System.out.println(" 2 for Delete Existing Customer");
	    System.out.println(" 3 for Update Existing Customer");
	    System.out.println(" 4 for Get Customer Information");
	 
	    System.out.println("??????????????????");
	    System.out.println("??????????????????");
	    System.out.println("Enter Your Choice from 1 to 4 : ");
	 
	    int choice = Integer.parseInt(br.readLine());
	 
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

	


