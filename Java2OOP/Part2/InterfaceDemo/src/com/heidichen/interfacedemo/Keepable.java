package com.heidichen.interfacedemo;

public interface Keepable {
	// complete methods
	public default void play() {
		System.out.println("Playing......");
	}
	
	public default void sleep() {
		System.out.println("Sleeping......");
	}
	
	// incomplete methods
	public abstract void showAffection();
	public abstract void begForFood();
	
	
}
