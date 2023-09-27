package com.heidichen.interfacedemo;

public class PetTest {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.display();
		
		Dog dog1 = new Dog();
		dog1.display();
		
		cat1.play();
		dog1.play();
		cat1.showAffection();
		
		dog1.showAffection();
		
		cat1.begForFood();
		dog1.begForFood();
	}

}
