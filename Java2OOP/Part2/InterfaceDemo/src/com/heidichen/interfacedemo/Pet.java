package com.heidichen.interfacedemo;

public class Pet {

	private String name;
	private String type;
	
	public Pet() {}

	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void display() {
		System.out.println("Name: "+ this.name);
		System.out.println("Type: "+ this.type);
	}
	
	

}
