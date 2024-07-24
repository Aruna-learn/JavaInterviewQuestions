package basicprograms;

public class ThisKeyword {

	int x,y;//class or instance variables


	/*
	 * ThisKeyword(int x, int y){ x=x; y=y; }local and class variable ar same so method or constructor will confuse  between local and class variables so by default it wiil gve zero even if we asisgn this value so to overcome we use ths this keyword
	 */

	/*
	 * ThisKeyword(int x, int y){//using constructor this.x=x; this.y=y; }
	 */

	void thisk(int x, int y) {//using method
		this.x=x;
		this.y=y;
	}
	
	
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		//ThisKeyword t=new ThisKeyword(100,200);
		ThisKeyword t=new ThisKeyword();
		t.thisk(10, 100);
		t.display();
		
	}
}