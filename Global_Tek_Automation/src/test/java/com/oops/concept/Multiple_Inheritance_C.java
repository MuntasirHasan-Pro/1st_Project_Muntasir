package com.oops.concept;

public class Multiple_Inheritance_C implements Multiple_Inheritance_A,Multiple_Inheritance_B{

	public void get_salary() {
		int salary = 10000;
		System.out.println("My salary: " + salary);
	}

	public void get_info() {
		System.out.println("My name is Muntasir");
	}
	
	public static void main(String[] args) {
		Multiple_Inheritance_C obj = new Multiple_Inheritance_C();
		obj.get_salary();
		obj.get_info();
	}

}
