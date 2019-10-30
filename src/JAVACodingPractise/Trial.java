package JAVACodingPractise;

import java.util.Scanner;

public class Trial {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("limit1");
		int limit1=s.nextInt();
		System.out.println("limit2");
		int limit2=s.nextInt();
		

		for (int j=limit1;j<=limit2;j++) {
			boolean flag=false;
			for(int i=2;i<=j/2;i++) {
				
				if(j%i==0) {
					flag=true;
					break;
				}
				
			}
			if(flag==false) {
				System.out.println(j);
			}
			
			
			
		}
		
		
		
		
		
		

		}

}
