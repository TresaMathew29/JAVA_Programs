package JAVACodingPractise;

import java.util.Scanner;

public class P33_ArmstrongNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int temp=num;
		int sumOfCubes=0;
		int digit=0;
		while(num>0) {
			digit=num%10;
			sumOfCubes=sumOfCubes+digit*digit*digit;
			num=num/10;
		}
		
		if(temp==sumOfCubes) {
			System.out.println(temp+" is a Palindrome");
		}
		else {
			System.out.println(temp+" is not a Palindrome");
		}
	}

}
