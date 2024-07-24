package basicprograms;


class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	
	
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ{
	void m1(int a) {//method overriding same method name and definition and change the implementation[implementation form ABC m1 method is overrided here]
		System.out.println(a*a);
	}
	
	
	
	void m2(int b, int a) {//method overloading same name difference in parameters
		System.out.println(b+a);
	}
}


public class OverloadingVSOverriding {

	public static void main(String[] args) {
		XYZ xyz=new XYZ();
		xyz.m1(10);
		xyz.m2(10, 80);
		
		ABC abc=new ABC();
		abc.m1(20);
		abc.m2(90);
		

	}

}
