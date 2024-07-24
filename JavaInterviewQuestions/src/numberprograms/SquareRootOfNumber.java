package numberprograms;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		// the square root of that number will be the number multiplied by itself.9 suqre root is 3=3*3

		int num=56;
		double temp;
		double sqr=num/2;//4
		
		do {
			temp=sqr;//4 3.125 3.00
			sqr=(temp+(num/temp))/2;//(4+(9/4))/2=4+2/2=3.125, 3.00
			
		} while ((temp-sqr)!=0);//(3.0-3.0)!=0 false then print the statement
		System.out.println("Square root of number is:"+sqr);
		
		
		//using built in mathod in  MathClass function
	double sqrt=Math.sqrt(15);
	System.out.println(sqrt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
