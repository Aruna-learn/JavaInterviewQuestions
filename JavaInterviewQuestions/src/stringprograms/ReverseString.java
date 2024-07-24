package stringprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//approach 1- using length(), charAt()
//		String s="Aruna reddy";
//			
//		String  reverse="";
//		
//		for(int i=s.length()-1;i>=0;i--) {//i=s.length()-1 and i-- decrease take each and every string from backward
//			
//			System.out.println(s.charAt(i));
//			reverse=reverse+s.charAt(i);

//			
//		}
//		System.out.println(reverse);
		
		
		
		
		//approach 2 using the chararray
		
//		String s="welcome";
//		String  rev="";
//		char c[]=s.toCharArray();//converting string to  char array
//		
//		for(int i=s.length()-1;i>=0;i--) {//i=s.length()-1 and i-- take each and every string from backward
//			System.out.println(c[i]);
//			rev=rev+c[i];
//		}
//		System.out.println("reversed string is:"+rev);
		
		// approach 3 using string  buffer class
		StringBuffer sb=new StringBuffer("selenium");
		System.out.println(sb.reverse());
		
		//approach4 using string builder class
		StringBuilder sd=new StringBuilder("jAVA");
		System.out.println(sd.reverse());
		
		
		
		
		
		

	}

}
