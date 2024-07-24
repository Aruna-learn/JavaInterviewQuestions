package scanner;

import java.util.Scanner;

public class MulptipleInput {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);


		//we can giver multipke input via console window
		//		System.out.println("enter 1st number:");
		//		int n=	sc.nextInt();
		//		System.out.println(n);
		//
		//		System.out.println("enter 2nd number:");
		//		int n1=	sc.nextInt();
		//		System.out.println(n1);
		//
		//		System.out.println("addiion of two numbers:"+(n+n1));


		System.out.println("enter the name:");
		String name=sc.next();

		System.out.println("enter age");
		int age=sc.nextInt();


		System.out.println("unknown input");
		Object n=sc.next();//using object it converts any data to string
		System.out.println(n);








	}

}
