package stringconversionprograms;

public class ChartoInt {

	public static void main(String[] args) {
		char c='u';
		int a=c;//we can directly assigbn 
		System.out.println(a);

		
		
		int x=Character.getNumericValue(c);//using numeric value
		System.out.println(x);
		
		
		int z=90;
		int y=	Integer.parseInt(String.valueOf(z));//using valueof
		System.out.println(y);
		
		
	}

}
