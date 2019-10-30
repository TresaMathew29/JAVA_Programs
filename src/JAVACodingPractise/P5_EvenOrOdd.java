package JAVACodingPractise;

import java.util.Scanner;

public class P5_EvenOrOdd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		//logic for even or odd
		if(num==0) {
			System.out.println(num+" is zero");
		}
		else if(num%2==0) {
			System.out.println(num+" is an even number");
		}
		else {
			System.out.println(num+" is an odd number");
		}
		
	}

}
