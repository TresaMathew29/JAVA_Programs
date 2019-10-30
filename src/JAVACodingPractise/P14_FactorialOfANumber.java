package JAVACodingPractise;

import java.util.Scanner;

public class P14_FactorialOfANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		long fact=1;
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("The factorial of the number "+num+" is "+fact);
	}

}
