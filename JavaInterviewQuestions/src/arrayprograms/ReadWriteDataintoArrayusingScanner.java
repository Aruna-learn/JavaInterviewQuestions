package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReadWriteDataintoArrayusingScanner {

	public static void main(String[] args) {
		
		int a[]= new int[5];//create array with size of 5 and get thpse 5 number via console window and print
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the number in position:"+i+" ");
			a[i]=sc.nextInt();//using nextint get the numbers from user and store position in the index starts from 0 that is a[i]
		}
		
		System.out.println("user inputs:");
		
		//print all values using for each loop
		for(int values:a) {
			System.out.println(values);
		}
		
		//print all values using the Arrays.tostring method
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//we can sort the numbers also
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
