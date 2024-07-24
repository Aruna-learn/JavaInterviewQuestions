package basicprograms;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the value");
		int value=sc.nextInt();
		
		try {
			System.out.println(100/value);
		}
		
		catch(ArithmeticException e)
		//catch(NullPointerException e)
		{
			System.out.println("invalid data");
			System.out.println(e.getMessage());
			System.exit(0);////stops here didn't execute finally block
		}
		
		
		
		//Exception occured, catch block handled finally block will execute
		//Exception occured, catch block  not handled finally block will execute(here arithmetic exception in catch but if we write the numberformat exception then catch block will not handle)
		//Exception does not occured, catch block ignored finally block will execute
		

		finally {
			System.out.println("program completed");
		}
		
		
		
	}

}
