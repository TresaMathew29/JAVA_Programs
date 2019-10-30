package JAVACodingPractise;

import java.util.Scanner;

public class P22_AlphabetVowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char alpa=s.next().charAt(0);
		if (alpa=='a' || alpa=='e'||alpa=='i' ||alpa=='o'||alpa=='u') {
			System.out.println(alpa+ " is an Vowel");
		}
		else {
			System.out.println(alpa+ " is a Consonant");
		}
		

	}

}
