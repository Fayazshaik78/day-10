package com.bank.customers;

public class Customer {


	private String  customerName  ;
	private int   customerId;
	
	public void setCustomerName (String  customerName ) {
		this.customerName=  customerName  ;
		
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId ;
		
	}
	public String getCustomerName  () {
		return  customerName ;
		
	}
	public int getCustomerId() {
		return customerId;
		
	}
	public void  showCustomerDetails()
 {
		System.out.println("customer name :"+ customerName );
		System.out.println("customar  id :"+customerId );
		
	}
}



