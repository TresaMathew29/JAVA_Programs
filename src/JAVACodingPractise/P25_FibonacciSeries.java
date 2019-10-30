package JAVACodingPractise;

import java.util.Scanner;

public class P25_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=s.nextInt();
		int t1=0,t2=1;
		int fibsum=0;
		for(int i=1;i<=limit;i++) {
			System.out.print(t1+"+");
			fibsum=t1+t2;
			t1=t2;
			t2=fibsum;
		}
	}

}
