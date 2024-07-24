package basicprograms;

public class StaticVariablesandMethods {

	int x=10;//class or instance variable\
	
	static  int y=20;//static variable
	
	
	// non-static method
	void m1() { 
		System.out.println(x);
	}
	
	// static method
	static void m2() {
		System.out.println(y);
	}
	
	
	
	//we can acces non static variable and method in the non static method and then call  the method in main method using the object
	void m3() {  
		System.out.println(x);
		m1();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public static void main(String[] args) { //we can use the main method in the
	 * same class or we can use in the another class also StaticVariablesandMethodsMain.java //we can access static
	 * variable and methods in main static method directly without creating object
	 * 
	 * System.out.println(y); m2();
	 * 
	 * //if we want to access non static varibale and methods in the main method we
	 * need to create object StaticVariablesandMethods sd=new
	 * StaticVariablesandMethods(); System.out.println(sd.x); sd.m1();
	 * 
	 * 
	 * //calling non static method having non static data methods sd.m3();
	 * System.out.println(sd.x);
	 * 
	 * }
	 */
	
	
	
}
