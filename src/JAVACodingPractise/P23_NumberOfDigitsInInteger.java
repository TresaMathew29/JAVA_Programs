package JAVACodingPractise;

import java.util.Scanner;

public class P23_NumberOfDigitsInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int temp=num;
		int count=0;
		int digit=0;
		while(num>0) {
			digit=num%10;
			count++;
			num=num/10;
			
		}
		System.out.println("The number of digits in "+temp+" is "+count);
		

	}

}
