package basicprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

	//public static void main(String[] args) throws FileNotFoundException {
		//throw exception used for check and unchked and using this ew can change the exception message and generate custom exceptions
		
		//for checked exceptions
		/*
		 * FileInputStream fis=new FileInputStream("\\.text.txt");
		 * System.out.println("aruna"); throw new
		 * FileNotFoundException("file not found");
		 */
		
		
		//for uncheckd 
	public static void validate(int age) {
		
		if(age<18) {
		//	System.out.println("not eligible for vote");
			throw new ArithmeticException("not eligible");
		}
		else {
			System.out.println("eligible for vote");
	}
	}

	public static void main(String[] args) {
		validate(10);
		 System.out.println("rest of the code...");    
	}
	
}
