package stringprograms;

public class CountTheTotalNumberOfCharactersInString {

	public static void main(String[] args) {
		String s="Aruna reddy";

		System.out.println(s.length());//it gives length 11 includes space
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) !=' ' ) {
				count++;
			}
		}
		
		System.out.println("number of character in string is:"+count);//10
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
