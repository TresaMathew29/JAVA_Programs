package JAVACodingPractise;

import java.util.Scanner;

public class P16_ReverseANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int rev=0;
		int digit=0;
		while(num>0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;	
		}
		System.out.println("The revrsed number is "+rev);
	}

}
