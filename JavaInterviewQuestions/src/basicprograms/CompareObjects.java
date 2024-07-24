package basicprograms;

public class CompareObjects {

	public static void main(String[] args) {
		//we can compare the objects in 3ways is using equal()method and == and using hashcode
		
		String s1= new String("Aruna");
		String s2= new String("Aruna");
		String s3= new String("aruna");
		
		//equal() method check the data in object
	System.out.println(s1.equals(s2));//true
	System.out.println(s1.equals(s3));//false
	System.out.println(s2.equals(s3));//false
	
	//==  check the address of the object 
	System.out.println(s1==s2);//false
	System.out.println(s1==s3);//false
	System.out.println(s2==s3);//false
		
	
	//using hashcode
	
		int a=s2.hashCode();
		int b=s2.hashCode();
		int c=s3.hashCode();
		
		System.out.println("hashcode of s1:"+a);
		System.out.println("hashcode of s2:"+b);
		System.out.println("hashcode of s3:"+c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
