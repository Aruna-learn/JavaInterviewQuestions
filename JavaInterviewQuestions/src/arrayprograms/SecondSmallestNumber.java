package arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		
		int a[]= {40,60,20,70,30,80,90,10};
		
		
		//using array sort
//		Arrays.sort(a);
//		System.out.println(a[1]);//for second element index is zero
		
		//using collections
		
//		Integer b[]= {30,67,45,20,87,40};
//		List<Integer> li=Arrays.asList(b);
//		Collections.sort(li);
//		Integer mini=li.get(1);
//		System.out.println(mini);
		
		
		//
		
		int temp=0;
		for(int i=0;i<=a.length-1;i++)//at 0 index 
		{
			for(int j=i+1;j<=a.length-1;j++) {//1<=length-1 true
				
				if(a[i]>a[j]) {
					temp=a[i];//temp=5
					a[i]=a[j];//a[i]=3
					a[j]=temp;
				}
				
				
				
		}
			System.out.print(a[1]);
			//System.out.print(""+a[i]+" ");
			//System.out.println("After sorting:"+a[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
