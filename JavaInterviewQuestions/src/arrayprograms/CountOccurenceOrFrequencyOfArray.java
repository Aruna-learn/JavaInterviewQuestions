package arrayprograms;

import java.util.Arrays;

public class CountOccurenceOrFrequencyOfArray {

	public static void main(String[] args) {
		
		int  a[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};  
		Arrays.sort(a);
		System.out.println("after sorting:"+Arrays.toString(a));
		
		//[1, 1, 2, 2, 2, 2, 3, 5, 8]
		for(int i=0;i<a.length;i++) {//0
			int count =1;
			if(i!=a.length-1) {
			     for(int j=i+1;i<a.length;j++) {
				      if(a[i]==a[j]) 
					     count++;
					     else
					     break;
				
				
			}
			
		}
		
			System.out.println(a[i]+"->"+count);
			i+=(count-1);//1 is 2 times repeated so count is 2 and 2-1=1 and in the top 1 is increamented by 1 so now is starts from 2
		
		}
		
		
		
		
		
		

	}

}
