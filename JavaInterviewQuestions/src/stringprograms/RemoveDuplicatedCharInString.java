package stringprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatedCharInString {

	public static void main(String[] args) {

		String s="coconut";



		//		//approach 1
		//		//set will not allow to add duplicate characters so no need to remove
		//		Set<Character> rep=new LinkedHashSet<Character>();
		//
		//		for(int i=0;i<s.length();i++)
		//		{
		//			rep.add(s.charAt(i));
		//		}
		//
		//		StringBuffer sb=new StringBuffer();
		//		for(char c:rep) {
		//			sb.append(c);//if char not present we are adding into sb
		//		}
		//
		//
		//		System.out.println("After removing duplicate char:"+sb);



		//approach 2
		StringBuilder sbl=new StringBuilder();
		for(int i=0;i<s.length();i++) { //traverse array
			char c=s.charAt(i); //store every character in c
			int Idx=s.indexOf(c, i+1);//index of gives the first occurence in c and using c we compare with all the character
			if(Idx==-1){ //-1 represents char not present
				sbl.append(c);// so we are adding here
			}
		}
		System.out.println(sbl);

//using char array
		char[] ch=s.toCharArray();
		StringBuilder sbl2=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			boolean repeated=false;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					repeated=true;//if it finds one repeats character it stops 
					break;
				}
			}
			if(!repeated) {
				sbl2.append(ch[i]);
			}
		}

		System.out.println(sbl2);



	}

}
