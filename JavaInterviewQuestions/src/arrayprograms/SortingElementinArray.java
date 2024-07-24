package arrayprograms;

import java.util.Arrays;

public class SortingElementinArray {

	public static void main(String[] args) {
		int a[]= {56,23,76,27,59,17,12};
		
		
		
		//we can use he for/foreach loop to print all elements in an array and instead of using it we can use the built in method Array.toSTRING it will return the sety of values[]
		for(int value:a) {
			System.out.println(value);
		}
		
		System.out.println("Before Sorting...");
		System.out.println(Arrays.toString(a));//using this method it print all elements in any array in form of set
		
		Arrays.sort(a);//using this method it sort the elemnents in an array

		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(a));//using this method it print all elements in any array in form of set
		
		
	}

}
