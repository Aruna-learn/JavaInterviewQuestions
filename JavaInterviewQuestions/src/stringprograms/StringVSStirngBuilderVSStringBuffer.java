package stringprograms;

public class StringVSStirngBuilderVSStringBuffer {

	public static void main(String[] args) {
		
		//String immutable
		/*
		 * String S="WELCOME"; S.concat("to java"); System.out.println(S);//not change
		 * didn't change the original value of variable
		 */
		
		//String Buffer mutable
		StringBuffer b=new StringBuffer("aruna");
		b.append("reddy");
		System.out.println(b);//can change the original value of the variable
		
		
		
		//String Builder mutable
				StringBuilder bb=new StringBuilder("aruna");
				bb.append("reddy");
				System.out.println(bb);//can change the orignal value of variable
				
		
		
		
		
		
		
		
		
		
		
	}

}
