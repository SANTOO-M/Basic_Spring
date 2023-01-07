package com.demo.spring.Spring_Practice;

public class Bank {

	public Bank() {
		System.out.println("Bank Created...");
	}
	
	public void deposite(double amount) {
		System.out.println("Transaction Succes...");
		System.out.println("Rupees "+amount+" Deposited");
	}
}
