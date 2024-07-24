package stringprograms;

public class RemoveOrReplaceCharInString {

	public static void main(String[] args) {
		
		String s="This is Aruna Reddy Poololla";
		
		
		System.out.println(s.replace("dy", "an"));//replace old char wiith new char
		
		System.out.println(s.replaceFirst("is", "an"));//replace  char wiith replacement
		
		System.out.println(s.replaceAll("[a-z]", ""));//replace regular expression with replacement
		
		
		System.out.println(s.substring(0, s.length()-1));//remove the last character using length
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
