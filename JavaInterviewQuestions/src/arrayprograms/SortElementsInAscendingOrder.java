package arrayprograms;

import java.util.Arrays;

public class SortElementsInAscendingOrder {

	public static void main(String[] args) {
		
		int a[]= {5,3,1,8,2,0,7};
		
		//approach1 using sort method
		System.out.println("before sorting:"+Arrays.toString(a));//if we write a inplace of Arrays.to string we will get the address of array not elements
		Arrays.sort(a);
		System.out.println("AfterSort:"+Arrays.toString(a));
		
		
		//uisng for loop or bubble sort
		int temp=0;
		for(int i=0;i<=a.length-1;i++)//at 0 index value is 5 //select the element
		{
			for(int j=i+1;j<=a.length-1;j++) {//1<=length-1 true //compare the selected element with rest of the elements
				
				if(a[i]>a[j]) {//5>3
					temp=a[i];//temp=5
					a[i]=a[j];//a[i]=3
					a[j]=temp;//a[j]=5 swapped and then increment j value and compare the element is 0 index with all elements and swap the same process repeats until ascending all ements
				}
				
				
				
		}
			
			
		}
		
		//System.out.print(a[6]);//get largest element based on index
		//System.out.print(""+a[6]+" ");
		for(int i=0;i<=a.length-1;i++)
		{
			
		System.out.println("After sorting:"+a[i]);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
