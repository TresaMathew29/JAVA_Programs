package JAVACodingPractise;

import java.util.Scanner;

public class P27_GCDOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		int gcd=1;
		
		for(int i=1;i<num1 && i< num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		
		System.out.println("The GCD is "+gcd);

	}

}
