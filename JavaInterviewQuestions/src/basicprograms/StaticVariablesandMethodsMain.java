package basicprograms;

public class StaticVariablesandMethodsMain {

	
		public static void main(String[] args) { 
			//we can access static variable and methods in main static method  directly without creating object
			
			System.out.println(StaticVariablesandMethods.y);
			 StaticVariablesandMethods.m2();
			
			//if we want to access non static varibale and methods in the main method we need to create object
			StaticVariablesandMethods sd=new StaticVariablesandMethods();
			System.out.println(sd.x);
			sd.m1();
			
			
			//calling non static method having non static data methods
			sd.m3();
			System.out.println(sd.x);
			
		}

	

}
