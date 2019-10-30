package JAVACodingPractise;

import java.util.Scanner;

public class P11_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		//String value
		System.out.println("Enter your name");
		String name=s.next();
		
		//Integer value
		System.out.println("Enter your age");
		int age=s.nextInt();
		
		//Char value
		System.out.println("Enter your gender");
		char gender=s.next().charAt(0);
		
		//long number
		System.out.println("Enter your telephone number");
		long teleno=s.nextLong();
		
		System.out.println("The details entered are");
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(teleno);
	}

}
