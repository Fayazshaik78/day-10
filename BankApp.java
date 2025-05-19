package com.bank.app;
import  com.bank.accounts.BankAccount;
import  com.bank.customers.Customer;

public class BankApp {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		Customer cut = new Customer();
		bank.setAccountNumber("73167633526");
		bank.setBalance(1200.40);
		cut.setCustomerId(233);
		cut.setCustomerName("fayaz");
		
		bank.showAccountDetails();
		System.out.println();
		
		cut.showCustomerDetails();
		
		
	}

}
