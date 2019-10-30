package JAVACodingPractise;

import java.util.Scanner;

public class P24_MultiplyTwoFloatNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first float number");
		float num1=s.nextFloat();
		System.out.println("Enter the second float number");
		float num2=s.nextFloat();
		
		float product=num1*num2;
		System.out.println("The product of two float numbers "+num1+" and "+num2+" is "+product);
		
		
	}

}
