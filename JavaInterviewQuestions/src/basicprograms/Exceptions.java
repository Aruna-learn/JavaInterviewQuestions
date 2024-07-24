package basicprograms;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//arrayindexoutofbound exception
		
		/*
		 * int a[]=new int[5];
		 * 
		 * //asking user to which position to enter the value
		 * System.out.println("enter position of the arrayay:(0-4)-"); int
		 * pos=sc.nextInt();
		 * 
		 * //asking user to which value enter System.out.println("enter the value"); int
		 * value=sc.nextInt();
		 * 
		 * a[pos]=value;//enter the value in specific position
		 * System.out.println(a[pos]);
		 */
		
		//numberformat exception
		/*
		 * String s="aerina"; Integer i=Integer.parseInt(s);
		 * System.out.println(i);//java.lang.NumberFormatException
		 */		
	
		
		//Arithmetic exception
		/*
		 * System.out.println("enter the number:"); int in=sc.nextInt();
		 * 
		 * System.out.println(100/in);//java.lang.ArithmeticException
		 * 
		 * System.out.println("program completed");
		 */
		
		
		//Null  pointer exception
		String s=null;
		System.out.println(s.length());//java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
		
	}

}
