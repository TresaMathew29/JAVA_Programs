package JAVACodingPractise;

import java.util.Scanner;

public class P35_StringPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String string=s.nextLine();
		String orginal=string;
		String rev="";
		int length=string.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+string.charAt(i);
		}
		
		if(orginal.equals(rev)) {
			System.out.println(orginal+" is a palindrome");
			
		}
		else {
			System.out.println(orginal+" is a not palindrome");
		}

	}

}
