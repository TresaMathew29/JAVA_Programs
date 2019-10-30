package JAVACodingPractise;

import java.util.Scanner;

public class P15_FactorialOfANumberUsingRecursion {
	
	public  static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			int fact=1;
			fact=num*factorial(num-1);
			return fact;
			} 	
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int fact1=factorial(num);
		System.out.println(fact1);
		
	}

}
