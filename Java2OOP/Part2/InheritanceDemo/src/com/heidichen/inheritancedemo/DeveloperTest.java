package com.heidichen.inheritancedemo;

public class DeveloperTest {

	public static void main(String[] args) {
        Developer michael = new Developer("Michael", 2,200000 );
        michael.display();
        michael
            .goToBootcamp("html")
            .goToBootcamp("Python");
        michael.display();

        Developer dev1 = new Developer();
        dev1.display();
        
        FrontendDeveloper frontDev = new FrontendDeveloper();
        frontDev.display();
        
        frontDev.centerDiv().centerDiv().centerDiv().centerDiv().centerDiv();
        
        frontDev.display();
        
        BackendDeveloper backendDev = new BackendDeveloper();
        backendDev.display();
	}
}
