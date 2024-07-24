package arrayprograms;

import java.util.Scanner;

public class RightRotateElement {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,0,6,1,6,7};
		System.out.println("Elements of an array before rotate left:");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number how many times to  left rotate the elements");
		int n=sc.nextInt();
		for(int i=0; i<n;i++) {
			
			int  last=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println();
		System.out.println("Elements of an array after rotate left:");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
