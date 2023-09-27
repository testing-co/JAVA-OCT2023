package com.heidichen.interfacedemo;

public class Cat extends Pet implements Keepable {

	public Cat() {
		super("A random cat", "Cat");
	}

	public Cat(String name, String type) {
		super(name, type);
	}
	
	@Override
	public void showAffection() {
		System.out.println("biting you.......");
	}

	@Override
	public void begForFood() {
		System.out.println("Waking you up for food at 4am");
		
	}
	
	
	
	
}
