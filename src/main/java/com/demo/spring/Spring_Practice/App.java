package com.demo.spring.Spring_Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Computer c=context.getBean(Computer.class);
		c.display();
    	
    	
    	/*
		 * Vehicle c=context.getBean(Vehicle.class); c.ride();
		 */
    	/*
		 * Car c=context.getBean(Car.class); Bike c=context.getBean(Bike.class);
		 * c.ride();
		 */
    	
    	/*
		 * Bank bankobj=context.getBean(Bank.class); 
		 * bankobj.deposite(2300.50);
		 */
    	
		/*
		 * Book bookObj=context.getBean(Book.class); bookObj.display();
		 */
    }
}
