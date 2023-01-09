package com.demo.spring.Spring_Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	//@Value("Dell")    //type - 1
	private String company;
	
	//@Value("50000")	//type - 1
	private double price;
	
	//@Autowired		//type - 1
	private Monitor mn;
	
	//Constructor Based Dependency Injection
	public Computer(Monitor mn) {
		super();
		this.mn = mn;
	}
	@Autowired		//type - 3
	public Computer(@Value("MicroSoft") String company,@Value("78000") double price, Monitor mn) {
		super();
		this.company = company;
		this.price = price;
		this.mn = mn;
	}

	public Computer() {
		System.out.println("Computer Object Created...");
	}

	void display() {
		if(mn!=null) {
			System.out.println("Monitor Working...	 Company Name:"+company+" and Its price:"+price);
			mn.displayMonitor();
		}
		
		else System.out.println("Monitor is not Working...");
	}
	
	//@Value("Dell") type - 2
	public void setCompany(String company) {
		this.company = company;
	}
	//@Value("50000") type -2
	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * public void setMn(Monitor mn) { this.mn = mn; }
	 */	
	
}
