package numberprograms;

import java.util.Scanner;
public class ArmStrongNumberScannerLimit {

	static boolean isArmstrong(int temp)   
	{   
		int num;

		num=temp;
		int sum=0;
		int reminder=0;

		while(num>0) {
			reminder=num%10;
			sum=sum+reminder*reminder*reminder;
			num=num/10;
		}
		if(temp==sum) 
			return true;

		else return false;

	}	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int num1=	sc.nextInt();

		System.out.println("Arumstrong number upto:"+num1);
		for(int i=0;i<=num1;i++) {
			if(isArmstrong(i)) {

				System.out.print(i+",");
			}


		}
	}
}





