package basicprograms;


//typecasting primitive
class Parenttype{
	String name="aruna";
	void m1() {
		System.out.println("Parent typecasting");
	}

}

class Childtype extends Parenttype{
	int id=77;
	void m2() {
		System.out.println("child tYpecasting");
	}
}



public class TypeCasting {

	public static void main(String[] args) {

		//child class object
				//Childtype c=new Childtype();
				
//				//child class variables and methods
//				System.out.println(c.id);
//				c.m2();
//				
//				//parEnt class variables and methods
//				System.out.println(c.name);
//				c.m1();



		//parent class object
		//		Parenttype p=new Parenttype();
		//		p.m1();
		//		System.out.println(p.name);
		//		

		//child class object(new Childtype()) to parent class reference variable(Parenttype p) variable is p
		//wE can access like this also it is called upcasting
		//Parenttype p=new Childtype();

		//upcasting we can access the parent class variables and methods but not child class
		//p.m1();
		//System.out.println(p.name);


		//upcasting we can't access the child class variables and methods 

		//		p.m2();
		//		System.out.println(p.id);


		
		//downcasting[parent object to child class reference variable]no errors in compile time or when writing code but in run time get the class cast exception
		Childtype c=(Childtype) new Parenttype();

		//child class variables and methods
		System.out.println(c.id);
		c.m2();
		
		//parEnt class variables and methods
		System.out.println(c.name);
		c.m1();


	}
















}
