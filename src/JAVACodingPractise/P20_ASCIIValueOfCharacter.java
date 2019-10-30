package JAVACodingPractise;

import java.util.Scanner;

public class P20_ASCIIValueOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the charcater");
		char c=s.next().charAt(0);
		int ascii=(int)c;
		System.out.println("The ASCII value is "+ascii);
		

	}

}
