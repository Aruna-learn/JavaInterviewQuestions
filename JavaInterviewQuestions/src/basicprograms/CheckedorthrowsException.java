package basicprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedorthrowsException {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.out.println("Program started.........");
		System.out.println("Program  in progress....................");
		
		
		Thread.sleep(3777);
		
		FileInputStream fis=new FileInputStream("\\.text");
		/*
		 * try { Thread.sleep(4000); } catch (InterruptedException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		
		
		
		
		
		System.out.println("Program completed.........");
		
		
		
		
		

	}

}
