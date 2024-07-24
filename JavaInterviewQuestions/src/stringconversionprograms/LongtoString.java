package stringconversionprograms;

public class LongtoString {

	public static void main(String[] args) {
		//using Long.toString()
		Long l=1235589L;
		String s=Long.toString(l);
		System.out.println(s);

		
		//using String.valueof()
		Long ll=189346785L;
		String ss=String.valueOf(ll);
		System.out.println(ss);
		
	}

}
