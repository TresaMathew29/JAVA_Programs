package JAVACodingPractise;

import java.util.Scanner;

public class P26_PowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		System.out.println("Enter the power");
		int power=s.nextInt();
		int pwr=1;
		
		for(int i=0;i<power;i++) {
			pwr=pwr*num;
			
		}
		System.out.println("The power of the number is "+pwr);
		

	}

}
