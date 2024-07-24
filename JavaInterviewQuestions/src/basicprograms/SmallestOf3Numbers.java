package basicprograms;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
		int a=67, b=23, c=12;
		if(a<b&&a<c)
			System.out.println(" a smallest is:"+a);
		else if(b<a&&b<c)
			System.out.println(" b smallest is:"+b);
		else 
			System.out.println(" c is smallest: "+c);
		
		
		
		
		//using ternary operator
		a=(a<b&&a<c)?a:b;
				System.out.println("a is small");
	}

}
