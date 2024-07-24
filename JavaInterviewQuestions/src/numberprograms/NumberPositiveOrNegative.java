package numberprograms;

import java.util.Scanner;

public class NumberPositiveOrNegative {

	public static void main(String[] args) {
		//1 using relational opeartor > =
		//		int num=-45;
		//		if(num>0) 
		//			System.out.println("number is positive");
		//		else if(num<0)
		//			System.out.println("number is negative");
		//		else
		//			System.out.println("number is zero");


		//using scanner and Math.signum()
//		0.0: if the argument is 0.
//		1.0: if the argument>0.
//		-1.0: if the argument<0.
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to chekc positver or negative or zero");
//		double num=sc.nextDouble();//double value
//		double 	result=Math.signum(num);
//		System.out.println(result);

//		float num1=sc.nextFloat();//float value
//		float 	result1=(float) Math.signum(num1);
//		System.out.println(result1);


//using Integer.signum(int i)
//		0: if the argument is 0.
//		1: if the argument>0.
//		-1: if the argument<0.
		
		
		int num2=sc.nextInt();	
		int result2=Integer.signum(num2);
		System.out.println(result2);









	}

}
