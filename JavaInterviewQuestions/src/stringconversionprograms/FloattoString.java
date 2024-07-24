package stringconversionprograms;

public class FloattoString {

	public static void main(String[] args) {
		// using Float.toString()
		Float f=456.98f;
		String s=Float.toString(f);
		System.out.println(s);


		//using String.valueof()
		Float f1=678903.0864f;
		String s1=String.valueOf(f1);
		System.out.println(s1);




	}

}
