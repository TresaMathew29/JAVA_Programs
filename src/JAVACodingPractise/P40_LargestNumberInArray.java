package JAVACodingPractise;

import java.util.Scanner;

public class P40_LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the index of the array");
		int index=s.nextInt();
		int array[]=new int[index];
		
		for(int i=0;i<index;i++) {
			System.out.println("Enter the element");
			array[i]=s.nextInt();
		}
		
		int largest=0;
		for(int j=0;j<index;j++) {
			if(array[j]>largest) {
				largest=array[j];
			}
		}
		
		System.out.println(largest);

	}

}
