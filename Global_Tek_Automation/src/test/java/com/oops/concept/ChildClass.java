package com.oops.concept;

public class ChildClass extends ParentClass{
	
	public static void main(String[] args) {
		//ParentClass obj = new ParentClass();
		//obj.get_house();
		//obj.get_mortgage();
		
		ChildClass obj2 = new ChildClass();
		obj2.get_vehicle();
		obj2.get_house();
		obj2.get_mortgage();
	}
	
	protected void get_vehicle(){
		System.out.println("I drive Hudson Hornet 51");
	}
}
