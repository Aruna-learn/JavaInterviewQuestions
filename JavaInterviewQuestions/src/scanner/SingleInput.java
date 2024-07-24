package scanner;

import java.util.Scanner;

public class SingleInput {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);



		System.out.println("Provide int number:");
		int num=sc.nextInt(); // if we give decimal number instaed of int in console window it thorws the input mismatch exception[int can't accepts decimal number]
		System.out.println("provided number is:"+num);



		System.out.println("Provide double number:");
		double num1=sc.nextDouble(); // if we give int number 10 in console number instead of decimal it accepts and provides as 10.0[decimal accepts int number]
		System.out.println("provided number is:"+num1);



		System.out.println("Provide  string:");
		String s=sc.next(); //for string we have to use the next method
		System.out.println("provided string is:"+s);









	}

}
