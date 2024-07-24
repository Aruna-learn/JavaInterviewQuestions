package stringprograms;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="Aruna";
		String s1="aruna";
		String s2="Selenium Automation";
		
		
		//String Methods
		//1.length()
		System.out.println(s.length());//using variable s
		System.out.println("Abhi".length());//using value Abhi
		
		
		//2.concat by default concat will do concat for only 2 strings
		System.out.println(s1+s2);
		System.out.println(s.concat(s2));
		System.out.println(s.concat(s1).concat(s2));
		System.out.println(s.concat(s1+s2));
		
		//we can aplly with values instead of variables also
		System.out.println("welcome"+"to java");
		System.out.println("aruna".concat("reddy"));
		
		
		//3.trim-remove left and right side spaces not middle spaces
		String s4="  Aruna Reddy";
		System.out.println("Before trim the string:"+s4.length());
		
		System.out.println("after trim the string:"+s4.trim().length());
		
		
		//4.charAt()-based on index it return the string and index starts with zero
		System.out.println(s2.charAt(0));
		System.out.println(s1.charAt(3));
		
		//5.Contains()- particular string part of the main string and return the boolean value
		System.out.println(s.contains("a"));
		System.out.println(s2.contains("U"));
		
		
		//6.equals and equalignorecase
		System.out.println(s.equals(s2));
		System.out.println(s2.equals(s1));//check the data 
		System.out.println(s==s1);//check the address
		System.out.println(s1.equalsIgnoreCase(s));
		
		
		//7.replace-replace single/multiple(sequence) char
		
		System.out.println(s.replace("n", "z"));
		System.out.println(s2.replace("Selenium", "java"));
		
		
		//8.substring -extract portion of string from main string
		//strting index start with zero
		//ending index starts with 1
		
		
		System.out.println(s1.substring(0, 4));
		System.out.println(s2.substring(3, 7));
		
		//if we want to get single char we can use the charat
		System.out.println(s2.charAt(5));
		
		//9.replace all
		System.out.println(s2.replaceAll("e", "x"));
		System.out.println(s2.replace("a", "f").replace("u", "b"));
		
		
		//10.touppercase and tolowercasse
		System.out.println(s2.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		
		
		String name="Aruna reddy";
		
		//Instead of using the equalignore case i have to get the output aruna as true
		
		
		System.out.println(name.toLowerCase().contains("aruna"));
		System.out.println(name.replace("A", "a").contains("aruna"));

	}

}
