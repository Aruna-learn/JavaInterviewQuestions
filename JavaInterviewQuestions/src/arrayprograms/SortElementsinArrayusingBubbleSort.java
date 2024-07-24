package arrayprograms;

import java.util.Arrays;

public class SortElementsinArrayusingBubbleSort {

	public static void main(String[] args) {
		
		int a[]={5,2,9,6,0,8,1};
			
		int n=a.length;//passess=n-1
		System.out.println("Before sorting:"+Arrays.toString(a));
		
		
		for(int i=0;i<n-1;i++) { //no of passess, 1st pass
			for(int j=0;j<n-1;j++) { //iterations In each Pass, 1st time iterate (for each pass 6iterations)
				if(a[j]>a[j+1]) { // ex.5>2 true swap
					int temp=a[j];//5=a[j]
					a[j]=a[j+1];//a[j]=2
					a[j+1]=temp;//a[j+1]=5 swapped now a[j] is 2 and a[j+1] is 5,
				}
			}
		}
		
		System.out.println("After sorting:"+Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
