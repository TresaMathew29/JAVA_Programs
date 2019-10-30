package JAVACodingPractise;

import java.util.Scanner;

public class P17_PalindromeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		int digit=0;
		while(num>0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println(temp+" is a palindrome");
		}
		else {
			System.out.println(temp+" is not a palindrome");
		}
		
	}

}
