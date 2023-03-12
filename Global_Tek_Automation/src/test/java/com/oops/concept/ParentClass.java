package com.oops.concept;

public class ParentClass {

	public void get_house() {
		System.out.println
		("This is my Parent's House.");
	}
	
	protected void get_mortgage() {
		System.out.println
		("Mortgage = $500,000.");
	}
	
	public static void main(String[] args) {
		ParentClass obj = new ParentClass();
		obj.get_house();
		obj.get_mortgage();
		
	}
}
