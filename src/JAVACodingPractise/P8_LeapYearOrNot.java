package JAVACodingPractise;

import java.util.Scanner;

public class P8_LeapYearOrNot {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		boolean flag;
		
		//Logic for leap year
		/*Every year that is exactly divisible by four is a leap year, 
		 * except for years that are exactly divisible by 100, 
		 * but these centurial years are leap years if they are exactly divisible by 400
		 */
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {//year divisible by 4 and divisible by 100 and 400-->LEAP Year
					flag=true;
				}
				else {//year divisible by 4 and not divisible by 100 and 400-->NOT LEAP Year
					flag=false;
				}
				
			}
			else {//year divisible by 4 and not divisible by 100-->LEAP Year
				flag=true;
			}
			
		}
		else {//year not divisible by 4-->NOT LEAP Year
			flag=false;
		}
		
		if(flag==true) {
			System.out.println(year+" is an leap year");		
		}
		else {
			System.out.println(year+" is not leap year");	
		}

	}

}
