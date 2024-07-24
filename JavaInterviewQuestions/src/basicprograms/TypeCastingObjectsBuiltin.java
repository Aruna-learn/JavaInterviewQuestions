package basicprograms;

public class TypeCastingObjectsBuiltin {

	public static void main(String[] args) {

		//syntax for the typecastobjects A b=(c) d;

		//example 1
		Object o=new String("aruna");//upcasting lower string to object becoz object is the super class of all class data types
		//StringBuffer sb=(StringBuffer)o;//rule1 pass, rule2 pass, rule 3 fail


		//example 2
		//Object o=new String("aruna");
		//String s=(String)o;//rule 1 pass, rule2 pass, rule 3pass


		//example 3
		//String s=new String("Aruna");
		//StringBuffer sb=(StringBuffer)s;//rule1 fail


		//example 4
		//Object o=new String("aryubna");
		//StringBuffer sb=(String)o;//rule 1 pass, 2fail


		//example 5

		//	String s=new String("Aruna");
		//	StringBuffer sb=(String)s;//rule1 pass, rule2 fail








	}

}
