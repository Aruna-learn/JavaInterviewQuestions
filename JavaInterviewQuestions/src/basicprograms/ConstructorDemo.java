package basicprograms;

public class ConstructorDemo {

	int x,y;
	ConstructorDemo(){//default constructor
		x=100;
		y=80;
		
	}
	
	ConstructorDemo(int a, int b){//parameterized constructor
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		//ConstructorDemo cd=new ConstructorDemo();//default constructor
		ConstructorDemo cd=new ConstructorDemo(100,500);//parameterized constructor
		
		cd.sum();
	}
	
	
}
