package basicprograms;


public class MainMethodOverloading{
	//we camn overload the main method having same name and different in paramenters and access those overloaded main methods in actual main method with object creation

	void main(int x) {
		System.out.println(x);
	}

	void main(String name){
		System.out.println(name);
	}

	void main(String s1, String s2) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		MainMethodOverloading mmo=new MainMethodOverloading();
		mmo.main(45);
		mmo.main("aruna");
		mmo.main("arubna", "reddy");
	}





}
