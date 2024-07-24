package numberprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		//swap two numbers means interchange the values into variables
		//ex int  a=10, b=20 after swap a=20, b=10

		int a=10;
		int b=20;

		//logic 1-using third variable
		System.out.println("Before swaping numbers a is "+a+" b is:"+b);

		//		int t=a;//10 in a assign to t now t is 10
		//		a=b;//a 20
		//		b=t;//b is 10





		//logic 2 using + and -

		//a=a+b;//10+20=30
		//b=a-b;//30-20=10
		//a=a-b;//30-10=20

		//logic 3 using * and /
		//a=a*b;//10*20=200
		//b=a/b;//200/20=10
		//a=a/b;//200/10=20


		//logic 4 using XOR (^)
		a=a^b;
		b=a^b;
		a=a^b;

		//logic 5 single statement
		b=a+b-(a=b);//execution starts from right to left
		//a=b;//a is 20
		//a+b;//30
		a=b;//20
		b=30-20;//10



		System.out.println("After swaping numbers a is "+a+" b is:"+b);
	}

}
