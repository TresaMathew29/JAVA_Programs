package JAVACodingPractise;
import java.util.Scanner;

public class P3_RectangleArea {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		double length=s.nextDouble();
		System.out.println("Enter the base of the rectangle");
		double base=s.nextDouble();
		System.out.println("Enter the height of the rectangle");
		double height=s.nextDouble();
		double rectangleArea=length*base*height;
		System.out.println("The area of the rectangle with lenght as "+length+", base as "+base+" and height as "+height+" is "+rectangleArea);

	}

}
