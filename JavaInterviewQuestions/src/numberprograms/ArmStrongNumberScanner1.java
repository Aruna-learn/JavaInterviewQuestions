package numberprograms;

import java.util.Scanner;

public class ArmStrongNumberScanner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int reminder;
	int temp=num;
		while(num>0) {
			reminder=num%10;
			sum=sum+reminder*reminder*reminder;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong number:"+sum);
		}
		else{
			System.out.println("not Armstrong number:"+sum);
		}
		

	}

}
