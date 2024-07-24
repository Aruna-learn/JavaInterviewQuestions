package stringconversionprograms;

public class StringtoLong {

	public static void main(String[] args) {
		String s="236801356";
		//long l=Long.parseLong(s);//string to long converting primitive
		long l=Long.valueOf(s);//string to long converting wrapper class
		System.out.println(s);
	}

}
