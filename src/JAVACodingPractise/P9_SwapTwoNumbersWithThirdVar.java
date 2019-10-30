package JAVACodingPractise;

import java.util.Scanner;

public class P9_SwapTwoNumbersWithThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		
		System.out.println("The numbers before swapping are");
		System.out.println(num1);
		System.out.println(num2);
		
		int temp;
		temp=num1;
		num1=num2;//swapped first number
		num2=temp;//swapped second number
		
		System.out.println("The numbers after swapping are");
		System.out.println(num1);
		System.out.println(num2);
	}

}
