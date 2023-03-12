package global.la.login;

public class Basic_Java_Test {
	
	static void add(int a ,int b) {
		int sum = a+b;
		System.out.println("Your sum: "+sum);
	}
	
	static void substract(int a ,int b) {
		int difference = a-b;
		System.out.println("Your difference: "+difference);
	}
	
	public static void main(String[] args) {
		int wage = 10000;
		int tax = 2000;
		add(wage,tax);
		substract(wage,tax);
	}
	//123
}