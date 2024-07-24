package stringprograms;

import java.util.Scanner;

public class DivideStringInNEqualParts {

	public static void main(String[] args) {
		
		
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to divide");
		String s=sc.nextLine();
		
		
		System.out.println("enter the number to divide");
		int n=sc.nextInt();
		
		int len=s.length();
		
		int chars = len/n; 
		String[] equalpart=new String[n];
		
		if(len%n!=0) {
			System.out.println("soryy we cant divide the divide");
		}
		
		else {
			for(int i=0;i<n;i++)
			{
				equalpart[i] =s.substring( i*chars,(i+1)*chars);
				
				
			}
			for (String part : equalpart) {
                System.out.println(part);
            }
		}
		
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
