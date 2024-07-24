package stringprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		
		
		
//		String s="MADAM";
//		String origin_string=s;
//		String reverse="";
//		
//		
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.println(s.charAt(i));
//			reverse=reverse+s.charAt(i);
//		}
//		
//		//System.out.println(reverse);
//		
//		if(origin_string.equals(reverse)) {
//			System.out.println("palindrome:"+origin_string);
//		}
//		else 
//		{
//			System.out.println("not palindrome:"+origin_string);
//		}
//		
		
		//we can use the scanner class  and char array also
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		String original_string=s;
		String rev="";
		char a[]=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("string reversed:"+rev);
		
		
		if(original_string.equals(rev))
		{
			System.out.println("palindrome string:"+original_string);
		}
		
		else {
			System.out.println("not palindrome string:"+original_string);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
