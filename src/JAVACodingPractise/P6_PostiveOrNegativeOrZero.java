package JAVACodingPractise;

import java.util.Scanner;

public class P6_PostiveOrNegativeOrZero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		if(num<0) {
			System.out.println(num+ " is a negative number");
		}
		else if (num==0){
			System.out.println(num+ " is zero");
		}
		else
		{
			System.out.println(num+ " is a positive number");
		}

	}

}
