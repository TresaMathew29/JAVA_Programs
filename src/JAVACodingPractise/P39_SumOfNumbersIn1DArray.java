package JAVACodingPractise;

public class P39_SumOfNumbersIn1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {0,1,2,3,4,5,6,7,8,9};
		int sum=0;
		int len=array.length;
		for(int i=0;i<len;i++) {
			sum=sum+array[i];
		}
		System.out.println(sum);
	}

}
