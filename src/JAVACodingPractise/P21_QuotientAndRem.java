package JAVACodingPractise;

import java.util.Scanner;

public class P21_QuotientAndRem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		int quot=0;
		int rem=0;
		quot=num1/num2;
		rem=num1%num2;
		System.out.println("The quotient is "+quot);
		System.out.println("The quotient is "+rem);

	}

}
