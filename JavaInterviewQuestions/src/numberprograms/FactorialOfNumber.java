package numberprograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		//5!=1*2*3*4*5=120

		//int num=5;
		int i=1;
		//long factorial=1;//using long becoz factorial is multiplying so it will be big value

		//		for(int i=1;i<=num;i++) 
		//		{
		//			factorial=factorial*i;//1 2 6 24 120
		//		}
		//		System.out.println(factorial);







		//5!=5*4*3*2*1=120 
		//			for(int i=num;i>=1;i--)
		//			{
		//				factorial=factorial*i;//5 20 60 120 120
		//			}
		//			System.out.println(factorial);
		//		


		//		while(i<=num) {
		//			factorial=factorial*i;
		//			i++;
		//		}
		//		System.out.println(factorial);




		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int fact=	sc.nextInt();

		
        int facto = 1;  

		while(i<=fact) {
			facto=facto*i;
			i++;
		}
		System.out.println(facto);

		
		


	}

}
