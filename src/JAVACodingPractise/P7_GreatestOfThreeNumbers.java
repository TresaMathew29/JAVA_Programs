package JAVACodingPractise;

import java.util.Scanner;

public class P7_GreatestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		System.out.println("Enter the third number");
		int num3=s.nextInt();
		
		
		if((num1>num2) && (num1>num3)) {
			System.out.println(num1+ " is the biggest number");
		}
		else if((num2>num1) && (num2>num3)){
			System.out.println(num2+ " is the biggest number");
		}
		else {
			System.out.println(num3+ " is the biggest number");
		}

	}

}
