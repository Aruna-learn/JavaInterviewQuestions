package numberprograms;

import java.util.Scanner;

public class ArmStrongNumberScanner {

static boolean isArmstrong(int temp)   
{   
	int num;

	 num=temp;
	int sum=0;
	int reminder=0;
	
	
	

	while(num>0) {
		reminder=num%10;
		sum=sum+(reminder*reminder*reminder);
		num=num/10;
	}
	if(temp==sum) 
		return true;
	
	else return false;

}	
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num1=	sc.nextInt();

	if(isArmstrong(num1)) {

		System.out.println("Armstrong NUmber:"+num1);
	}
	else {
		System.out.println("Not armstrong number:"+num1);
	}

}









	
	
	
	
	
	
	
	
	
	
	
	

















}


