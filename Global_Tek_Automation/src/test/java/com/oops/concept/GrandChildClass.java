package com.oops.concept;

public class GrandChildClass extends ChildClass{
	
	public static void main(String[] args) {
		GrandChildClass obj = new GrandChildClass();
		obj.get_toy();
		obj.get_house();
		obj.get_mortgage();
		obj.get_vehicle();
	}
	
	void get_toy(){
		System.out.println("I am playing with my car toy.");
	}
	
	
}
