package basicprograms;

interface Shape {

	int length=10;//by default final and static
	int width=19;// by default final static

	void circle();//abstract/unimplemented method


	//implemented methods after 1.7 it.e in 1.8
	default void square() {
		System.out.println("implemented  default square method");
	}
	static void rectangle() {
		System.out.println("implemented  static rectangle method");
	}

}







