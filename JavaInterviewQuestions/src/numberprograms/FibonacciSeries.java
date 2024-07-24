package numberprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0; 
		int n2=1;
		int sum=0;

		// 0 1 1 2 3 5 8 13 21 34 - fibonacci number is sum of last 2 numbers

		System.out.print(n1+" "+n2);//n1 and n2 printed are 0 and 1

		for(int i=2;i<=10;i++)  //n1 and n2 printed so starts from 2 
		{

			sum=n1+n2;//sum=0+1 then sum is 1
			System.out.print(" "+sum);
			n1=n2;//assign n2 1 in n1 then n1 1
			n2=sum;//assign sum 1 in n2 then n2 1 the loop starts
		}



//		System.out.print(n1+" "+n2);//0 1
//
//		for(int i=2;i<=10;i++)  
//		{
//
//			sum=n1+n2;//sum=0+1 then sum is 1 2 3  5 8  13 21 34 55
//			System.out.print(" "+sum);
//			n1=n2;//assign n2 1 in n1 then n1 1 1  2 3 5  8 13  21 34 
//			n2=sum;//assign sum 1 in n2 then n2 1 the loop starts 2 3 5 8  13 21  34 55
//		}


















	}

}
