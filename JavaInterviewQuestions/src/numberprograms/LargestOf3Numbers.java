package numberprograms;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		//logic 1 using hard coded numbers or using scanner and if else Condition
		//		int a=20;
		//		int b=70;// instead of hard coding we can use the scanner class also
		//		int c=30;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int a=sc.nextInt();

		System.out.println("Enter b number");
		int b=sc.nextInt();

		System.out.println("Enter c number");
		int c=sc.nextInt();

		//		if(a>b&&a>c)
		//		{
		//			System.out.println("a is largest:"+a);
		//		}
		//		else if(b>a&&b>c)
		//		{
		//			System.out.println("b is largest:"+b);
		//		}
		//		else {
		//			System.out.println("c is largest:"+c);
		//		}

		//logic 2 using ternary operator and scanner class

		//int max=(a>b)?a:b;//1st compare a and b and get the max number 

		//int nummax=(c>max)?c:max;//then compare the c with max number

		int maxi=c>(a>b?a:b)?c:(a>b)?a:b;//we can write in single statement

		System.out.println(maxi);











	}

}
