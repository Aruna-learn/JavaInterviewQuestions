package arrayprograms;

import java.util.Scanner;

public class LeftRotateElement {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		System.out.println("Elements of an array before rotate left:");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number how many times to  left rotate the elements");
		int n=sc.nextInt();
		for(int i=0; i<n;i++) {
			
			int firstelement=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=firstelement;
		}
		System.out.println();
		System.out.println("Elements of an array after rotate left:");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
