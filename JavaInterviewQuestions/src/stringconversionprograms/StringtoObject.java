package stringconversionprograms;

public class StringtoObject {

	public static void main(String[] args) throws Exception {
		String s="aruna";
		Object obj=s;//string to object
		System.out.println(obj);

		
		//string to object class
		Class c=Class.forName("java.lang.String");
		
		System.out.println("class name is:"+c);
		System.out.println("classnameis:"+c.getSuperclass().getName());
	}

}
