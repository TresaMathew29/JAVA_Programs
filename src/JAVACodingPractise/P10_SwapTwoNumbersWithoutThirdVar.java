package JAVACodingPractise;

import java.util.Scanner;

public class P10_SwapTwoNumbersWithoutThirdVar {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		
		System.out.println("The numbers before swapping are");
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("The numbers before swapping are");
		System.out.println(num1);
		System.out.println(num2);
		

	}

}
