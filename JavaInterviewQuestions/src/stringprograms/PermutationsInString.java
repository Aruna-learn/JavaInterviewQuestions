package stringprograms;

import java.util.Scanner;

public class PermutationsInString {

	static char temp;
	static void swap(char[] ar, int i, int fi) { //fi is fixed index
		char temp =ar[i];
		ar[i]=ar[fi];
		ar[fi]=temp;
	}

	static void permutations(char[] ar, int fi) {

		if(fi==ar.length) {
			System.out.println(ar);
			return;
		}


		for(int i=fi;i<ar.length;i++) { //traverse through array and swap
			swap(ar,i,fi);
			permutations(ar,fi+1);
			swap(ar,i,fi);//if swap reback
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.next();
		permutations(s.toCharArray(), 0);

	}

















}
