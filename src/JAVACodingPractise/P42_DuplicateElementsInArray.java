package JAVACodingPractise;

public class P42_DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[]= {"Java","Javascript","Ruby","Ruby","C","Java"};
		
		//Comapre each element
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate element "+names[i]);
				}
			}
		}
		
		

	}

}
