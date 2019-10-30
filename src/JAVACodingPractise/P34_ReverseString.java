package JAVACodingPractise;

import java.util.Scanner;

public class P34_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String string=s.nextLine();
		System.out.println(string);
		String rev="";
		int length=string.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+string.charAt(i);
		}
		System.out.println(rev);
	}

}
