package numberprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter number which need to be reverse:");
		int num=sc.nextInt();//taking number from user which we want to reverse
		
		
		//logic 1 using algorithm
		
		//int rev=0;//to store the reverse number
		
		//% gives remainder (last digit) and / gives quotient removes the last digit
		
		
//		while(num!=0) {
//			rev=rev*10 + num%10;
//			num=num/10;
//		}
//		
//		System.out.println("Revered number is:"+rev);
		
		
		
//		//1st iteration
//		while(36409!=0) 
//		{
//			9=0*10+36409%10;//0+9=9
//			36409=36409/10;//3640
//		}
//		
//		//2nd iteration
//		while(3640!=0)
//		{
//			90=9*10+3640%10;//0+9=9  90+0=90
//			3640=3640/10;//3640 364
//		}
//		
//		
//		//3rd iteration
//		while(364!=0)
//		{
//			904=90*10+364%10;//0+9=9  90+0=90 900+4=904
//			364=364/10;//3640 364 36
//		}
//		
//		//4th iteration
//		while(36!=0)
//		{
//			9046=904*10+36%10;//0+9=9  90+0=90 900+4=904 9040+6=9046
//			36=36 /10;//3640 364 36 3
//		}
//		
//		//5th iteration
//		while(3!=0)
//		{
//			90463=9046*10+3%10;//0+9=9  90+0=90 900+4=904 9040+6=9046 90460+3=90463
//			3=3 /10;//3640 364 36 3 0
//		}
//		
//		//last iteration
//		while(0!=0)
//		{
//			
//		}
//		exists  while loop
//		
		
		
		//logic 2 using StringBuilder class
//		StringBuilder sbl=new StringBuilder();
//		sbl.append(num);
//		StringBuilder rev=sbl.reverse();
		
		
		

		//logic 3 using StringBuffer class
		StringBuffer sb=new StringBuffer(String.valueOf(num));//String.valueOf(num) convert the num to string format
		
		StringBuffer rev=sb.reverse();
		
		
		
		
		
		
		
		
		System.out.println("reversed number is :"+rev);
		
		
		
		
		
		
		
		
	}

}
