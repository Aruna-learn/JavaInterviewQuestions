package basicprograms;

import java.util.Scanner;

public class ASCIICcharacters {

	public static void main(String[] args) {
		//ascii character 0 to 255


		//print all ascii values
		
		//		for(int i=0;i<=255;i++) {
		//			System.out.println("The ASCII value of:"+(char)i+"="+i);
		//		}

		
		
		//print specific character ascii value
		int ch='a';
		System.out.println("ASCII value of:"+ch);

		//print specific character ascii value using int and char
		char ch1='a';
		int ascia=ch1;
		System.out.println("ASCII value of:"+ascia);

		
		//using scanner class get ascii value of char
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char:");

		char ch2=sc.next().charAt(0);
		int asci=ch2;
		System.out.println(asci);










	}

}



//97-122 a-z
//65-90 A-Z
//48-57- 0-9