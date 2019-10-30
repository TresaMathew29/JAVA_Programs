package JAVACodingPractise;

import java.util.Scanner;

public class P29_PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println(" prime number");
		}
		else {
			System.out.println("Is not a prime number");
		}
	}

}
