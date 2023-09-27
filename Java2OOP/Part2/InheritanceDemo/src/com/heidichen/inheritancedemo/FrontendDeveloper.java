package com.heidichen.inheritancedemo;

public class FrontendDeveloper extends Developer {
	// 1. private attributes
	// name, skills, braincell, salary , preferredFramework
	private String preferredFramework;

	// 2. constructor
	public FrontendDeveloper() {
		super("Anonymous Artist"); // calling the superclass constructor
		this.addSkill("Javascript");
		this.addSkill("CSS");
		this.preferredFramework = "ReactJS";
	}

	// getters/ setters
	public String getPreferredFramework() {
		return preferredFramework;
	}

	public void setPreferredFramework(String preferredFramework) {
		this.preferredFramework = preferredFramework;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Preferred framework: " + this.preferredFramework);
	}

	public FrontendDeveloper centerDiv() {
		// this.braincell--; // only works if the attribute is protected
		// this.setBraincell(this.getBraincell() - 1); // if the attribute is private
		System.out.println("Centering a div....... Doesn't work....");
		return this;
	}

	/// OOP CONVENTION: private attributes, constructors, getters/setters

}
