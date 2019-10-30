package JAVACodingPractise;

import java.util.Scanner;

public class P12_Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		System.out.println("Enter the operation to be done:+,-,*,/");
		String operator=s.next();
		int result;
		
		switch(operator) {
		case "+":result=num1+num2;
				System.out.println("The sum is "+result);
				break;
				
		case "-":result=num1-num2;
				System.out.println("The diff is "+result);
				break;
				
		case "*":result=num1*num2;
				System.out.println("The product is "+result);
				break;
				
		case "/":result=num1/num2;
				System.out.println("The division is "+result);
				break;
				
		}
		

	}

}
