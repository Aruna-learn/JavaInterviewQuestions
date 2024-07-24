package numberprograms;

import java.util.Scanner;

public class SwapNumbersUsingMultiplicationAndDivision {

	public static void main(String[] args) {
//		int a=20;
//		int b=10;
//		System.out.println("Before swapping a is :"+a+" b is:"+b);
//
//		
//		a=a*b;//200=20*10
//		b=a/b;//20 =200/10
//		a=a/b;//10=200/20
//
//		System.out.println("After swapping a is :"+a+" b is:"+b);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Before swapping a is :"+a+" b is:"+b);

		a=a*b;
		b=a/b;
		a=a/b;

		System.out.println("After swapping a is :"+a+" b is:"+b);
	}
		
		
		
		
		
		
		
		
		

	}


