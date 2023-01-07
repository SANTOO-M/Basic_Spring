package com.demo.spring.Spring_Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    	Bank bankobj=context.getBean(Bank.class);
    	bankobj.deposite(2300.50);
    }
}
