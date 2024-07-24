package stringconversionprograms;

public class StringtoFloat {

	public static void main(String[] args) {
		String s="23.89";
		Float f=Float.parseFloat(s);//string to float conversion //32bit float
	//	Float f=Float.valueOf(s);//string to float conversion

		System.out.println(s);
	}

}
