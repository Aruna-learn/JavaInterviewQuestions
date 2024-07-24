package basicprograms;

import java.util.Scanner;

public class TryCatchblockException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the value");
		int value=sc.nextInt();
		
		try {
			System.out.println(100/value);
		}
		
		
		
		
		
		catch(ArithmeticException e)
		{
			System.out.println("invalid data");
		}
		
		System.out.println("program completed");
		
		
		
		
	}

}
