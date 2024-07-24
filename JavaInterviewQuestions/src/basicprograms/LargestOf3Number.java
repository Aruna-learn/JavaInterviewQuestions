package basicprograms;

public class LargestOf3Number {

	public static void main(String[] args) {
		int a=1009, b=60, c=45;
		//we can use the scanner class and ternary operator
		if(a>b&&a>c) {
			System.out.println("a is largest:"+a);
		}
		else if(b>a&&b>c){
			
		System.out.println("b is largest:"+b);
		}
		else
			System.out.println("c is largest:"+c);
		
		
		
	}

}
