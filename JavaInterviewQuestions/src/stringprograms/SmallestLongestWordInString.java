package stringprograms;

import java.util.Scanner;

public class SmallestLongestWordInString {


	static void smalllongeststring(String s) {
		String smallest=""; 

		String longest="";
		String[] words=s.split(" ");

		for(int i=0;i<words.length;i++) {
			if(i==0) {
				smallest=longest=words[0];
			}
			else if(words[i].length()<smallest.length())
				smallest=words[i];
			else if(words[i].length()>longest.length())
				longest=words[i];


		}
		System.out.println("smallest word:"+smallest);

		System.out.println("longest word:"+longest);

	}

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		System.out.println("enter the string ");
		String s=sc.nextLine();

		if(s.length()==0) {
			System.out.println("enter valid string");
		}
		else
			smalllongeststring(s);


































	}


}
























