package stringprograms;

import java.util.Arrays;

public class TwoStringsAreAnagram {

	public static void main(String[] args) {
		
		
		
		//Two Strings are called the anagram if they contain the same characters. However, the order or sequence of the characters can be different.
		String s1="aruna";
		String s2="unaar";
		
		s1.toLowerCase();
		s2.toLowerCase();
		
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Both strings are not anagram");
		}
		
		else 
		{
			char[]	ch1=s1.toCharArray();
			char[]	ch2=s2.toCharArray();
					
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			
			if(Arrays.equals(ch1, ch2)==true)
			{
				System.out.println("Anagram");
			}
			else
				System.out.println("not anagram");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
