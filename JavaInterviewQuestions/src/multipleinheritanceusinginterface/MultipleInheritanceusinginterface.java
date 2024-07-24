package multipleinheritanceusinginterface;

public class MultipleInheritanceusinginterface implements Interface1,Interface2 {



	@Override
	public void m2() {
		System.out.println(x);

	}

	@Override
	public void m1() {
		System.out.println(y);

	}

	public static void main(String[] args) {
		MultipleInheritanceusinginterface mii=new  MultipleInheritanceusinginterface();
		mii.m1();
		mii.m2();

	}

}
