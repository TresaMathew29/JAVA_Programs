package JAVACodingPractise;

import java.util.Scanner;

public class P32_EvenNumbersBetweenTwoLimits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int lowerlimit=s.nextInt();
		
		System.out.println("Enter the upper limit");
		int upperlimit=s.nextInt();
		
		for(int i=lowerlimit;i<upperlimit;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
