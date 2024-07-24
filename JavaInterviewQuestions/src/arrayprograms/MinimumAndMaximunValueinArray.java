package arrayprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAndMaximunValueinArray {

	public static void main(String[] args) {

		int a[]= {30,67,45,23,87,40};

		
		//we can get min value using sort and get the value on 0 index
		Arrays.sort(a);
		System.out.println(a[0]);
		
		
		//using collections
		Integer b[]= {30,67,45,20,87,40};
		List<Integer> li=Arrays.asList(b);
		Collections.sort(li);
		Integer mini=li.get(0);
		System.out.println(mini);
		
		
		
		//max value largest element
		int max=a[0];//assuming a[0] value is 30 as max value temporarily

		for(int i=1;i<a.length;i++)//i=1 becoz we take a[0] already
		{
			if(a[i]>max) { //67>30=true then 67 stores in max,45>67 false so no need to store in max value, 23>67 false, 87>67 true store in max as 87 then, 40>87 false 
				max=a[i];//a[i]>max=true then only programme came to this step if false not execute
			}
		}

		//System.out.println(max);



		//min value smallest element
		int min =a[0];//assuming a[0] value is 30 as max value temporarily
		for(int i=1; i<a.length;i++)//i=1 becoz we take a[0] already

		{
			if(a[i]<min) {  //67<30=false then,45<67 true so store in min value, 23<45 true stores in min, 87<23 false, 40<23 false 
				min=a[i];//a[i]<min=true then only programme came to this step if false not execute
			}
		}

		//System.out.println(min);










	}

}
