package stringconversionprograms;

public class StringtointandInteger {

	public static void main(String[] args) {
//		//String to int(primitive data type)
//		String s="200";
//		int i=Integer.parseInt(s);
//		System.out.println(s);
		
		
		
		
		//String to Integer(wrapper data type)
		//Declaring String variable  
				String s="200";
				//converting String into Integer using Integer.valueOf() method  
				int i=Integer.valueOf(s);
				System.out.println(s);
		System.out.println(s+100);//200100, because "200"+100, here + is a string concatenation operator  
		System.out.println(i+100);//300 here i and + is binalry plus operators
		
		//If you don't have numbers in string literal, calling Integer.parseInt() or Integer.valueOf() methods throw NumberFormatException.
		//e.g String s="aruna";
				
		
		
		
		
		
		
	}

}
