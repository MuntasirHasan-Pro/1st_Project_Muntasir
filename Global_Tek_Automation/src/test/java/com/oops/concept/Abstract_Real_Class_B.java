package com.oops.concept;

public class Abstract_Real_Class_B extends Abstract_Class_A{

	@Override
	void get_job() {
		System.out.println("My job is QA");
	}
	
	public static void main(String[] args) {
		Abstract_Real_Class_B obj = new Abstract_Real_Class_B();
		obj.get_job();
		System.out.println(obj.get_food());
		
	}

}
