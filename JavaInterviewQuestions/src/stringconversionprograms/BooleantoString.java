package stringconversionprograms;

public class BooleantoString {

	public static void main(String[] args) {
		// using Boolean.toString()
		boolean b1=true;
		boolean b2=false;

		
		String s2=Boolean.toString(b2);
		
		//using String.valueof()
		String s=String.valueOf(b1);
		System.out.println(s);
		System.out.println(s2);

		
	}

}
