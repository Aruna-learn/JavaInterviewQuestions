package basicprograms;

public class MethodOverloadingAdding {

	int x=10, y=10;
	
	//method overloading
	void sum() {

		System.out.println(x+y);
	}

//methodsame name and different in paramenters
	void sum(int a, int b ) {

		System.out.println(a+b);
	}

	
	//methodsame name and different in type of data types
	void sum(int a, double b) {

		System.out.println(a+b);
	}

	
	//methodsame name and different in order of parameters
	void sum(double a, int b) {

		System.out.println(a+b);
	}







}
