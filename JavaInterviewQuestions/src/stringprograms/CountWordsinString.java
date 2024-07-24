package stringprograms;

import java.util.Scanner;

public class CountWordsinString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();

		int count=1;

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') { //take char from index  0 once 1st word done then space came so space ' ' is equal to char[i] and for next char starting is i+1 and it should be char not space so use the !
				count++;
			}
		}
		System.out.println("number of words in the string:"+count);






	}

}
