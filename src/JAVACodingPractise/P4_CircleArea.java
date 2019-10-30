package JAVACodingPractise;

import java.util.Scanner;

public class P4_CircleArea {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the readius of the circle");
		double radius= s.nextDouble();
		double circleArea= 3.14*radius*radius;
		System.out.println("The area of the circle is "+circleArea);
	}

}
