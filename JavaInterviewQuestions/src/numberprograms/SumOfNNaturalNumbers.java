package numberprograms;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter from number:");
		int n1=sc.nextInt();
		System.out.println("enter to number:");
		int n2=sc.nextInt();
		
		int sum=0,i;
		while(n1<=n2) {
			sum=sum+n1;
			n1++;
		}
		System.out.println("sum of the natural numbers:"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
