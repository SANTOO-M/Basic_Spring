package com.demo.spring.Spring_Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monitor {
	
	//@Value("17") 		//type - 1
	private int size;
	
	//@Value("1024")	//type - 1
	private int pixels;
	
	//@Value("17")		//type - 2
	public void setSize(int size) {
		this.size = size;
	}
	
	//@Value("1024")	//type - 2
	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	
	@Autowired		//type -3
	public Monitor(@Value("25")int size,@Value("2048") int pixels) {
		super();
		this.size = size;
		this.pixels = pixels;
	}
	public Monitor() {
		System.out.println("Monitor Object Created...");
	}
	
	public void displayMonitor() {
		System.out.println("Monitor size= "+size+" Monitor Pixels="+pixels);
	}

}
