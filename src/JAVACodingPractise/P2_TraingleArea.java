package JAVACodingPractise;
import java.util.Scanner;

public class P2_TraingleArea {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		int base=s.nextInt();
		System.out.println("Enter the height of the triangle");
		int height=s.nextInt();
		double triangleArea=.5*base*height;
		System.out.println("The area of the trianagle "+triangleArea);
	}

}
