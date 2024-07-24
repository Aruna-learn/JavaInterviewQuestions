package stringprograms;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingSequesnce {

	public static void main(String[] args) {

		String s="acbdfghyb";
		int i=0;

		int j=0;
		int mAxcoUntT=0;
		int len=s.length();

		Set<Character>	see=new HashSet<Character>();
		while(i<s.length()&&j<s.length())
		{
			if(!see.contains(s.charAt(i))) {
				see.add(s.charAt(i));
				j++;
				mAxcoUntT=Math.max(mAxcoUntT, j-1);

			}
			else {
				see.remove(s.charAt(i));
				i++;

			}
			System.out.println(len);

		}		

	}


}

















