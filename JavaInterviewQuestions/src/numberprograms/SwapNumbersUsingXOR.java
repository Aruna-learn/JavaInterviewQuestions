package numberprograms;

import java.util.Scanner;

public class SwapNumbersUsingXOR {

	public static void main(String[] args) {
		//		int a=3;
		//		int b=5;
		//		System.out.println("Before swapping a is :"+a+" b is:"+b);
		//
		//		//XOR returns true or 1 when both bits are equal otherwise false
		//		a=a^b;//0110=0011^0101
		//		b=a^b;//0011=0110^0101
		//		a=a^b;//0101=0110^0011
		//
		//		System.out.println("After swapping a is :"+a+" b is:"+b);



		//using scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Before swapping a is :"+a+" b is:"+b);

		a=a^b;//0110=0011^0101
		b=a^b;//0011=0110^0101
		a=a^b;//0101=0110^0011

		System.out.println("After swapping a is :"+a+" b is:"+b);
	}

}
