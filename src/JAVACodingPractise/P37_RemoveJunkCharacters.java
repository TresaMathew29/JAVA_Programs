package JAVACodingPractise;

public class P37_RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using regular expression [a-zA-Z0-9]
		String s="#@!#!#@#@!#@! john 679898 #@%$#%$#%$#";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
