package JAVACodingPractise;

public class P41_MissingNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,5};
		int sum=0;
		//Sum of all numbers in array
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);

		int sum1=0;
		//Sum of all numbers
		for(int j=1;j<=5;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		int missingNum=sum1-sum;
		System.out.println("The missing number is "+missingNum);
	}

}
