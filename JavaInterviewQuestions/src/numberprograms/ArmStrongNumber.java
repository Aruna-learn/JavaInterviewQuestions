package numberprograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
		//3 = 3^3
		//153=1^3+5^3+3^3=153 armstrong number
		//125=1^3+2^3+5^3=134 not armstrong number

		//check whether given number is armstring or not
		int num=1634;

		int sum=0;
		int reminder=0;
		int temp=num;

		while(num>0) {
			reminder=num%10;
			sum=sum+reminder*reminder*reminder;
			num=num/10;
		}
		System.out.println(sum);

		if(temp==sum) {
			System.out.println("Armstrong number:"+sum);
		}
		else
			System.out.println("not armstrong number:"+sum);
	}

}
