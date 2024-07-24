package stringprograms;

public class SwapStrings {

	public static void main(String[] args) {
		String s1="aruna";
		String s2="reddygfh";
		
		System.out.println("Beforeswaping s1:"+s1+", s2="+s2);
		
		
//		String swp;
//		
//		// Swapping two strings using third variable swp. 
//			swp=s1;
//			s1=s2;
//			s2=swp;
//		
//			System.out.println("Afterswaping s1:"+s1+", s2="+s2);
		
		
		
		//another approach using string concatenation
		s1=s1+s2;
		System.out.println(s1);
		
		s2=s1.substring(0, (s1.length()-s2.length()));
		
		System.out.println(s2);
		s1=s1.substring(s2.length());
		System.out.println("Afterswaping s1:"+s1+", s2="+s2);
		
		
		
		
		
		
		
		
		
		

	}

}
