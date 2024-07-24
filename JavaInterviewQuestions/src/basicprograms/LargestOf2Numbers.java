package basicprograms;

public class LargestOf2Numbers {

	public static void main(String[] args) {
		int a=78, b=34;
		
		//using ternary operator
		a=(a>b)?a:b;
		System.out.println(a);

		if(a>b)//using if else
			System.out.println("a is largest");
		else
			System.out.println("b is largest");
		
		
		
		
	}

}
