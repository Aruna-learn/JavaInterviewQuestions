package numberprograms;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		//when we multiply two same numbers together, then the product that we get is called the perfect square.2*2=4
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		//int num=4;//we can normal int num without scanner class also
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
			if(i*i==num)
				System.out.println(i+ "perfect square");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
