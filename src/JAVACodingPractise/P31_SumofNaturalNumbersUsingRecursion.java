package JAVACodingPractise;

import java.util.Scanner;

public class P31_SumofNaturalNumbersUsingRecursion {
	
	public static int sumOfNumbers(int limit) {
		int sum;
		if(limit==0) {
			return 0;
		}
		else {
			sum=limit+sumOfNumbers(limit-1);
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=s.nextInt();
		int sum=sumOfNumbers(limit);
		System.out.println(sum);

	}

}
