package multipleinheritanceusinginterface;


//we have 2interfaces and implements one class and then we can extends one class also like below

public class HybridInheritance extends Class3 implements Interface1,Interface2 {

	@Override
	public void m2() {
		System.out.println(x);

	}

	@Override
	public void m1() {
		System.out.println(y);

	}

	public static void main(String[] args) {
		HybridInheritance mii1=new  HybridInheritance();
		mii1.m1();
		mii1.m2();
		mii1.m3();
	}





}
