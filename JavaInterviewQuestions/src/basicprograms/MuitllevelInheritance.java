package basicprograms;

//multilevelinheritance 
class X {
	int a;
	void display() {
		System.out.println(a);
	}
}

//x is parent and y is child [having the  x methods and variables and y methods annd variables]
class Y extends X{
	int b;
	void show() {
		System.out.println(b);
	}
}

//y is parent and x is child[having the x,y methods and variables and z methods annd variables]
class Z extends Y{
	int c;
	void print() {
		System.out.println(c);
	}
}

//m is parent and z is child[having the x,y,z methods and variables and m methods annd variables]
class M extends Z{
	int d;
	void vedic() {
		System.out.println(d);
	}
}

public class MuitllevelInheritance {

	public static void main(String[] args) {
		M mm=new M();
		mm.a=122;
		mm.b=12;
		mm.c=22;
		mm.d=102;
		
		mm.display();
		mm.show();
		mm.vedic();
		mm.print();
		
		
		
		
		
		
		
		
		
	}
















}
