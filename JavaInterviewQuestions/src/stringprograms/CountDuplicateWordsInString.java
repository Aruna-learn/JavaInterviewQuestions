package stringprograms;

import java.util.Arrays;

public class CountDuplicateWordsInString {

	public static void main(String[] args) {
		String s="Aruna reddy Aruna";
		int count;
		s=	s.toLowerCase();

		String words[]=s.split(" ");
		System.out.println("Duplicate Words in a given string");

		
		for(int i=0;i<words.length;i++) {
			count=1;
			if(!words[i].equals("0")) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					 //words[j]="0";// Set words[j] to "0" to avoid counting the word again
				}
			}
			
			if (count > 1) {
                System.out.println(words[i] + ": " + count);
            }

			
		}

		}


















	}

}
