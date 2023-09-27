package com.heidichen.interfacedemo;

public class Dog extends Pet implements Keepable{
	public Dog() {
		super("A random dog", "Dog");
	}
	
	public Dog(String name, String type) {
		super(name, type);
	}

	@Override
	public void showAffection() {
		System.out.println("cuddling with you...");
	}

	@Override
	public void begForFood() {
		System.out.println("Whimpering for food");
	}
	

}
