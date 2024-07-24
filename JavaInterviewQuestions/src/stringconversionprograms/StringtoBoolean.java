package stringconversionprograms;

public class StringtoBoolean {

	public static void main(String[] args) {
		//String to boolean using Boolean.parseboolean(string)
		String s1="true";
		String s2="pooroi";
		String s3="	true";
		String s4="madhu";

		Boolean b1=Boolean.parseBoolean(s1);
		Boolean b2=Boolean.parseBoolean(s2);
		Boolean b3=Boolean.parseBoolean(s3);
		Boolean b4=Boolean.parseBoolean(s4);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		//To get boolean true, string must contain "true". Here, case is ignored. So, "true" or "TRUE" will return boolean true. Any other string value except "true" returns boolean false.
		
		
		//String to boolean object using Boolean.valueof(string)
		
		String s11="aruna";
		String s22="pooroi";
		String s33="true";
		String s44="madhu";

		Boolean b11=Boolean.valueOf(s11);
		Boolean b22=Boolean.valueOf(s22);
		Boolean b33=Boolean.valueOf(s33);
		Boolean b44=Boolean.valueOf(s44);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		
		
	}

}
