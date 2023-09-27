package com.heidichen.inheritancedemo;

import java.util.ArrayList;

public class Developer {

    // 1. private member variables
    private String name;
    private ArrayList<String> skills;
    // ** Null Pointer Exception if it is not instantiated
    private int braincell;
    private double salary;
    

    // 2. constructors
    public Developer(){
        this.name = "Anonymous Hacker";
        this.skills = new ArrayList<String>();
        this.skills.add("Java");
        this.braincell = 5;
        this.salary = 90000;
    }
    
    public Developer(String name){
        this.name = name;
        this.skills = new ArrayList<String>();
        this.skills.add("Java");
        this.braincell = 5;
        this.salary = 90000;
    }
    

    public Developer(String name, int braincell, double salary){
        this.name = name;
        this.braincell = braincell;
        this.salary = salary;
        this.skills = new ArrayList<String>();
        skills.add("Break some code");
        skills.add("Fix some bugs");
    }
    
    public void display(){
        System.out.println("########### DISPLAY DEVELOPER ###########");
        System.out.println("Name: "+ this.name);
        System.out.println("Skills: "+ this.skills);
        System.out.println("braincell: "+ this.braincell);
        System.out.println("Salary: "+ this.salary);
    }

    public Developer goToBootcamp(String learntSkill){
        this.braincell++;
        this.skills.add(learntSkill);
        this.salary *= 1.1; // this.salary + this.salary * 0.1
        System.out.println(this.name + " went to the bootcamp and learnt " + learntSkill);
        return this;
    }

    public void addSkill(String skill) {
    	this.skills.add(skill);
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public int getBraincell() {
		return braincell;
	}

	public void setBraincell(int braincell) {
		this.braincell = braincell;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
	
	
    
    
}
