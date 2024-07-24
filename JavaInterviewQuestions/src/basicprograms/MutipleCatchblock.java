package basicprograms;

import java.util.Scanner;

public class MutipleCatchblock {


	//if we don't know the which exception throws in the catch block we can use the multiple  exceptions in catch  block like this but the cons is code will increase and if the mentioned exception incatch is not supported or related then again throws the exception so instead of this we write the Exception in the catch block it is the super class of all exceptions

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the value");
		int value=sc.nextInt();
		try {
			System.out.println(100/value);
		}

		/*catch(NumberFormatException e)
		{
			System.out.println("catch block handle NumberFormatException");
			System.out.println(e.getMessage());
		}

		catch(NullPointerException e) {
			System.out.println("catch block handle NullPointerException");
			System.out.println(e.getMessage());
		}

		catch(ArithmeticException e) {
			System.out.println("catch block handle ArithmeticException");
			System.out.println(e.getMessage());
		}*/
		
		//if we don't know the which exception throws in the catch block we can use the multiple  exceptions in catch  block like this but the cons is code will increase and if the mentioned exception incatch is not supported or related then again throws the exception so instead of this we write the Exception in the catch block it is the super class of all exceptions

		catch(Exception e)
		{
			System.out.println("catch block handle");
			System.out.println(e.getMessage());
		}


		System.out.println("program completed");

	}

}
