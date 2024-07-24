package numberprograms;

import java.util.Scanner;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {

		//		int a =15;
		//		int b=89;
		//		int c=86;

		//using ternary operator
		//int min=a<b?a:b;
		//int minimum=(c<min)?c:min;
		//int valuemin=c<(a<b?a:b)?c:((a<b)?a:b);
		//System.out.println(valuemin);


		//using if elseif condition

		//		if(a<b&&a<c)
		//			System.out.println("smallest number is:"+a);
		//		else if(b<c&&b<a)
		//			System.out.println("smallest number is:"+b);
		//
		//		else
		//			System.out.println("smallest number is:"+c);


		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		System.out.println("enter c value:");
		int c=sc.nextInt();

		int largest=c<(a<b?a:b)?c:((a<b)?a:b);

		System.out.println(largest);





	}

}
