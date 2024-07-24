package numberprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		//logic 1st we have to reverse number then check whether  reversed number is palindrome or not

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number:");
		int number=sc.nextInt();

		int  original_num=number;
		int rev=0; //store the reversed number

		while(number!=0)
		{
			rev=rev*10 + number%10;
			number=number/10;
		}

		if(original_num==rev) {     
			System.out.println("palindrome:"+original_num);
		}
		else {
			System.out.println("not palindrome:"+original_num);
		}
		System.out.println(rev);













	}

}
