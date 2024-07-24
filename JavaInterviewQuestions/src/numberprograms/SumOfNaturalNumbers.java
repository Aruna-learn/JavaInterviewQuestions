package numberprograms;

public class SumOfNaturalNumbers {

	//3we can use the formula also n=n*(n+1)/2
	
	static int sumnatural(int n) {
		return n*(n+1)/2;
	}
	
	public static void main(String[] args) {
		
		int num=100; int sum=0;
		
		//1.using for loop
//		for(int i=0; i<=num;i++)
//		{
//			System.out.println(i);
//			sum=sum+i;
//		}
//		System.out.println("Sum of First 100 Natural Numbers is = " + sum);  
		
		//2.using while loop
//		int i=1;
//		while(i<=num) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println("Sum of First 100 Natural Numbers is = " + sum);  
		
		//we can use the formula also n=n*(n+1)/2
		System.out.println("sum of natural numbers:"+sumnatural(5));
		
		
		
	}
	
	
}
