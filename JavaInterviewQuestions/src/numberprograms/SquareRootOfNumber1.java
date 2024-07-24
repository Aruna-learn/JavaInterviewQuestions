package numberprograms;

import java.util.Scanner;

public class SquareRootOfNumber1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int sqrt=0;
		
		//take 9 as num
		for(int i=1;i<=num;i++) {//1 1<=9, 2<=9,3<=9
			if(num%i==0) {//9%1==0, 9%2=1 false not proceed,9%3==0
				if(i*i==num) {//1*1==9,3*3==9
					sqrt=i;//3
				}
			}
			
		}
		System.out.println(sqrt+" square root");//3
		
	}
}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


