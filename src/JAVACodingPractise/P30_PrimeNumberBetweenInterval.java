package JAVACodingPractise;
import java.util.Scanner;

public class P30_PrimeNumberBetweenInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first limit");
		int limit1=s.nextInt();
		System.out.println("Enter the second limit");
		int limit2=s.nextInt();
		
		for(int i=limit1;i<=limit2;i++) {
			boolean flag=false;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
				if(flag==false) {
					System.out.println(i);	
		}
				
		}
	}	

}


