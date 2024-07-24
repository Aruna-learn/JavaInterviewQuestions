package stringprograms;

import java.util.Scanner;

public class ReverseStringUsingLoops {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String rev=sc.nextLine();   
		System.out.print("After reverse string is:");  
//		for(int i=rev.length();i>=0;i--)
//		{
//			System.out.println(rev.charAt(i-1));//print the character from last index is i-1 to first
//		}

		
	int 	i=rev.length();
		while(i>0)
		{
			System.out.println(rev.charAt(i-1));//print the character from last index is i-1 to first
			i--;
		}
		
		
		
		
		
		
		
	}	
		
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


