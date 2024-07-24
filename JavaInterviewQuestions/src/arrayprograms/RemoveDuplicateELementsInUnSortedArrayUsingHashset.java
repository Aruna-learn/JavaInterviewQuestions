package arrayprograms;

import java.util.HashSet;

public class RemoveDuplicateELementsInUnSortedArrayUsingHashset {

	public static void main(String[] args) {
		int a[]={5,7,2,8,1,0,4,5,2};//unsorted Array
		
		//hashset will not allow the duplicate values to add
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for (Integer value : hs) { //iterate each element
			System.out.println(value);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
