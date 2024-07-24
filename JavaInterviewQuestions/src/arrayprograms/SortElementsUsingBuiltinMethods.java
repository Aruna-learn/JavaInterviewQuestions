package arrayprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsUsingBuiltinMethods {

	public static void main(String[] args) {


//		int a[]= {34,98,556,23,12,98,890,3578,2309};

		//approach 1 using sort method
//		System.out.println("Using sort Before Sorting:"+Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Using sort After Sorting:"+Arrays.toString(a));


		//approach 2 using parallel sort method
//
//		System.out.println("Using parallel Before Sorting:"+Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("Using Parallel After Sorting:"+Arrays.toString(a));

		
		
//approach 3 sort elements inreverse order using collections.reverseorder

		
		Integer a[]= {34,98,556,23,12,98,890,3578,2309};
		System.out.println("elements before reverse order:"+Arrays.toString(a));

		Arrays.sort(a,Collections.reverseOrder());

		System.out.println("elements after reverse order:"+Arrays.toString(a));
		


	}

}
