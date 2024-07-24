package stringconversionprograms;

public class ChartoString {

	public static void main(String[] args) {
		char c='I';
		//using character.tostring()
		String s=Character.toString(c);
		
		//using String.valueof()
		String s1=String.valueOf(c);
		System.out.println("CHAR is:"+c);
	}

}
