package stringconversionprograms;

public class IntegertoString {

	public static void main(String[] args) {
		//int to string using string.valueof(i)
		int i=400;
		String s=String.valueOf(i);
		System.out.println(s);

		//int to string using Integer.toString(i)
		int z=800;
		String ss=Integer.toString(z);
		System.out.println(ss);
		
		System.out.println(z+7000);
		System.out.println(ss+7000);
		
		////using String.format()
		int x=900;
		String sx=String.format("%d",x);  		
		System.out.println(sx);
		
	}

}
