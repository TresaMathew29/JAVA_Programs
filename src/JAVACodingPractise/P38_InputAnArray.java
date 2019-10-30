package JAVACodingPractise;

import java.util.Scanner;

public class P38_InputAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the index of the arraay");
		int index=s.nextInt();
		
		System.out.println("============Entering values to the array=============");
		int array[]=new int[index];
		for(int i=0;i<index;i++) {
			System.out.println("enter the element");
			array[i]=s.nextInt();
		}
		
		System.out.println("============ Outputting the user input array=============");
		int len=array.length;
		for(int j=0;j<len;j++) {
			System.out.println(array[j]);
		}

	}

}
