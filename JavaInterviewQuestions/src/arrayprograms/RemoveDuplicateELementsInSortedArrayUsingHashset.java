package arrayprograms;

import java.util.HashSet;

public class RemoveDuplicateELementsInSortedArrayUsingHashset {

	public static void main(String[] args) {
		
		 int a[] = {1, 2, 2, 5,5, 6, 7};
		
		 HashSet<Integer> hs=new HashSet<Integer>();
			for(int i=0;i<a.length;i++) {
				hs.add(a[i]);
			}
			for (Integer value : hs) { //iterate each element
				System.out.println(value);
				
			}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

