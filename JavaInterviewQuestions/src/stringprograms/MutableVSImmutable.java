package stringprograms;

import java.util.Arrays;

public class MutableVSImmutable {

	public static void main(String[] args) {
		
		
		//mutable can change
//		int a[]= {3,8,5,3,67,19,4,10,1,0};
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);//mutable can change we can change the  original value of the variable
//		System.out.println(Arrays.toString(a));
		
		
		//immutable can't change
		
		String s="aruna";
		System.out.println(s);
		//s.concat("reddy");//immutable didn't change 
		//System.out.println(s);
		
		//so in string method  we can't change the original value of the variable
		// to overcome we have to store the concatenation variable then it will concatenate
		
		String concatenation=s.concat("reddy");
				System.out.println(concatenation);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
