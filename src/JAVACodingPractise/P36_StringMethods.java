package JAVACodingPractise;

import java.util.Scanner;

public class P36_StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=================================================");
		String string2="John";
		String newstring1="  Kevin  ";
	
		//1.Length of the string
		String string1="John";
		int length=string1.length();
		System.out.println(length);
		
		System.out.println("=================================================");
		//2.Character at a particular location
		char a=string1.charAt(0);
		System.out.println(a);
		
		System.out.println("=================================================");
		//3.compare two strings
		String string3="John";
		String string4="John";
		boolean b=string3.equals(string4);
		System.out.println(b);
		
		System.out.println("=================================================");
		//4.Concat two strings
		String concatString=string3.concat(string4);
		System.out.println(concatString);
		
		System.out.println("=================================================");
		//5.Trim the leading and trailing spaces
		String string5="  Alexa ";
		String string6=string5.trim();
		System.out.println(string5);
		System.out.println(string6);
		
		System.out.println("=================================================");
		//6.check if a character is present or not
		String string7="Apple";
		boolean c=string7.contains("pp");//return true
		boolean d=string7.contains("po");//return false
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("=================================================");
		String string8="Orange";
		String string9="oRANGE";
		boolean e=string8.equalsIgnoreCase(string9);
		System.out.println(e);//print true
		
		System.out.println("=================================================");
		String string10="orange";
		System.out.println(string10.toUpperCase());
		
		System.out.println("=================================================");
		String string11="APPLE";
		System.out.println(string11.toLowerCase());
		
		System.out.println("=================================================");
		String string12="APPLE";
		String string13=string12.replace("PP", "OO");
		System.out.println(string13);
		
		System.out.println("=================================================");
		String string14="Malayalam";
		String string15=string14.substring(5);
		String string16= string14.substring(2, 4);
		System.out.println(string15);
		System.out.println(string16);
	}

}
