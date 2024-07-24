package basicprograms;

public class InterfaceDemo implements Shape {

	@Override
	public void circle() {  //method  interface should be public we can't use default because it reduce the scope and visibility but in class method by default it  will be default method
		System.out.println("implemeted abstract method in class");

	}
	void traingle() {
		System.out.println("implemeted user defined method in class");//we can't access this in interface thorough interface variable but aces sin class object
	}


	public static void main(String[] args) {

		//scenario1
		//using object class creation

		InterfaceDemo id=new InterfaceDemo(); 
		id.circle();//abstract method
		id.square();//default method
		id.traingle();// user defined method

		//for static method no need of object we can directly access using the

		Shape.rectangle();//static method directly access from interface

		System.out.println(id.length*id.width);


		//scenario2
		//object create for class and variable type is interface , create object reference for instance variable  but we cannot instantiate the interface

		Shape s=new InterfaceDemo();
		s.circle();
		s.square();

		Shape.rectangle();//static method directly access from interface

		//s.triangle();//user defined method we can't access it vecoz it is class method not method in interface
		System.out.println(s.length*s.width);
	}
}

