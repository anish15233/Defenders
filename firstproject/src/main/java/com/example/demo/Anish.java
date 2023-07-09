package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

 @Component 
 @Scope(value= "prototype")
  public class Anish {

	
	private int aid;
	private String name;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private laptop laptop;
	
	
	
	public Anish() {
		super();
		System.out.println("object created..");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	
	
	
	public laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(laptop laptop) {
		this.laptop = laptop;
	}
	public void setTech(String tech) {
		this.tech = tech;
		
		
	}
	 public void show()
	 {
	System.out.println("in show");
	laptop.compile();
	 }
	 
}
