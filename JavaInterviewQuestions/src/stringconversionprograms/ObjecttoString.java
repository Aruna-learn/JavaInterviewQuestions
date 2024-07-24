package stringconversionprograms;

public class ObjecttoString {

	public static void main(String[] args) {
		// we can convert any objects either userdefined  class and string builder class objects
		//using string() and String.valueof(object)
		
		ObjecttoString otos=new ObjecttoString();//userdefined class objects
		
		String s=String.valueOf(otos);
		
		String s1=otos.toString();
		
		System.out.println("userdefined  class value of is:"+s);
		System.out.println("userdefined  class toString is:"+s1);
		
//string builder class objects
		
		String st ="aruna";
		StringBuilder sb=new StringBuilder(st);
		String s2=String.valueOf(sb);
		String s3=sb.toString();
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}

}
