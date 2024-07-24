package stringprograms;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		//split the string into multiple parts based on the delimiter[whitespace, @, ,]


		String s="abc@gmail.com";
		String a[]=	s.split("@");//split returns array so we use the array and type is string[using ddelimiteR @]
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));



		String s1="abc,123@xyz";
		String arr[]=s1.split(",");//using delimiter ,
		System.out.println(Arrays.toString(arr));//[abc 123@xyz]

		String arr2[]=arr[1].split("@");
		System.out.println(Arrays.toString(arr2));//123 xyz

		System.out.println(arr[0]);//abc
		System.out.println(arr[1]);//123@XYZ
		System.out.println(arr2[0]);//123
		System.out.println(arr2[1]);//xyz



		String s3="aruna reddy tester";//using whitespcase

		String s2[]=s3.split(" ");
		System.out.println(Arrays.toString(s2));









		//% * ^ ( ) - we can't use these delimiters










	}

}
