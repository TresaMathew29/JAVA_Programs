package JAVACodingPractise;
import java.util.Scanner;

public class P1_SumOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		int sum=num1+num2;
		System.out.println("The sum of two integer numbers "+num1+" and "+num2+" is "+sum);
	}

}
