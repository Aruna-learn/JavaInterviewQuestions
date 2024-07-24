package stringconversionprograms;

public class StringtoChar {

	public static void main(String[] args) {
//		String s="aruna";
//		char c=s.charAt(0);
//		System.out.println(c);//for return one character

		
		
		
//		String s="aruna";
//		
//		for(int i=0;i<s.length();i++) {//return all elements
//			char c=s.charAt(i);
//			System.out.println(c);
//		}
		
		
		
		String s="chini";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println("char at" +i+" index is:"+ch[i]);
	}

}
}
