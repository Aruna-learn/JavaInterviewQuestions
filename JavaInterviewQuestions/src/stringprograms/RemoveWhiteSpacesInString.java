package stringprograms;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		
		
		String s="Selenium   automation     testng    java     learning";
		
		System.out.println("Before whitespace removea:"+s);
		
		
		String str=s.replaceAll("\\s", "");//wherever the space occured \\s it replaces with nothing
		
		
		System.out.println("After whitespace removal:"+str);
		
		
		
		
		
		
		
		
		
		

	}

}
