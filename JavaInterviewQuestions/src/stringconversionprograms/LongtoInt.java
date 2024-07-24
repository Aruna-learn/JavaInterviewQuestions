package stringconversionprograms;

public class LongtoInt {

	public static void main(String[] args) {
		long l=8000;
		int i=(int)l;//explicit typecasting higher to lower
		System.out.println(i);
		
		Long l1=new Long(789);//convert long to int object using class
		int i1=l1.intValue();//using value of
		System.out.println(i1);
	

	}

}
