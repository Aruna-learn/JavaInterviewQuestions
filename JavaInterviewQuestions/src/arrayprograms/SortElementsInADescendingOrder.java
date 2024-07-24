package arrayprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInADescendingOrder {

	public static void main(String[] args) {

		//Integer a[]= {10,50,45,87,23,765,243};

		//using built in method
		//		System.out.println("Before sorting:"+Arrays.toString(a));
		//		Arrays.sort(a,Collections.reverseOrder());
		//
		//		System.out.println("Before sorting:"+Arrays.toString(a));


		//using for loop 

		int a[]= {10,50,45,87,23,765,243};
		int temp=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			//System.out.print(""+a[i]+" ");
			//System.out.println("After sorting:"+a[i]);
		}

	










	}

}
