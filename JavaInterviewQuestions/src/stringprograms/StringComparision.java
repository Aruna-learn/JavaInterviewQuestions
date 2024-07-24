package stringprograms;

public class StringComparision {

	public static void main(String[] args) {


		/*//case1 string literal
		String s1="aruna";
		String s2="aruna";
		String s3="Aruna";

		//==  check the address /objects
		//equals check the data or value of objects[it considers the case sensitive of letters][s1 and s2 having same data so it maps to same string literal address memory in string constant pool]
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true

		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//false

		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//false
		 */

		/*//case2 using string object
		String s1=new String("aruna");
		String s2=new String("aruna");

		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		 */



		//case 3 combination of literal and objects

		/*
		 * String s1="aruna"; String s2=new String ("aruna");
		 * 
		 * System.out.println(s1==s2);//false System.out.println(s1.equals(s2));//true
		 */



		//case4
		
		String s1="aruna";
		String s2=new String ("aruna");
		String s3=s2;
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true

		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s2==s3);//true
		System.out.println(s2.equals(s3));//true



	}

}
