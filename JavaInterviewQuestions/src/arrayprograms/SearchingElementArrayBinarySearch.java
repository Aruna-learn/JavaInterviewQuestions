package arrayprograms;

import java.util.Arrays;

public class SearchingElementArrayBinarySearch {

	public static void main(String[] args) {
		//array should be in sorted order for binary search

		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int key=6;//searching element
		int lower=0;
		int higher=a.length-1;

		boolean status=false;
		
		while(lower<=higher) {
			int mid=(lower+higher)/2;

			if(key==a[mid]) {
				System.out.println("element found");
				status=true;
				break;
			}
			if(key>a[mid]) {
				lower=mid+1;
			}

			if(key<a[mid]) {
				higher=mid-1;
			}

		}

		if(status==false) {
			System.out.println("element not found");
		}



//logic 2 using Arrays.binarysearch
		
System.out.println(Arrays.binarySearch(a, 8));//a is arrays name and 8 the number to find and it returns the position at which 8 found








	}

}
