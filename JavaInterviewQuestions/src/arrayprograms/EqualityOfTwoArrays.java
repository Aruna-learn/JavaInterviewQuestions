package arrayprograms;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {

		int a1[]= {1,2,6,9,4};
		int a2[]= {1,2,6,90,4};

		//Approach 1 using arrays equal method

		//		boolean status=Arrays.equals(a1, a2);
		//		System.out.println(status);
		//		
		//		if(status==true)
		//		{
		//			System.out.println("arrays are equal");
		//		}
		//		else
		//		
		//			System.out.println("arrays are  not equal");

		//Approach 2	 logic

		boolean status=true;

		if(a1.length==a2.length) {
			for(int i=0;i<=a1.length-1;i++) {
				if(a1[i]!=a2[i]) {
					status=false;
				}
			}


		}


		else {
			status=false;
		}
		if(status==true)
		{
			System.out.println("arrays are equal");
		}
		else
			System.out.println("not euqal");
	}

}
