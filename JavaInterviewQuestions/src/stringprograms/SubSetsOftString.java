package stringprograms;

public class SubSetsOftString {

	public static void main(String[] args) {
		//The subset of a string is the character or the group of characters that are present inside the string.

		//All the possible subsets for a string will be n(n+1)/2.

		//For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.


		String s="FUNny";

		
		int count=0;

		int len=s.length();


		//Total possible subsets for string of size n is n*(n+1)/2  
		String arr[] = new String[len*(len+1)/2];  


		//This loop maintains the starting character  
		for(int i=0;i<len;i++)
		{
			for(int j=1;j<len;j++) { //This loop adds the next character every iteration for the subset to form and add it to the array 
				arr[count]=s.substring(i, j+1);
				count++;
			}
		}

		System.out.println("All subsets for given string are: ");  
		for(int i=0;i<s.length();i++)
		{
			System.out.println(arr[i]);
		}












	}

}
