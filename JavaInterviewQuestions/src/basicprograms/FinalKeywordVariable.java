package basicprograms;

//variable can't change when using final


class ABCD{
	final int x=167;
	
}





public class FinalKeywordVariable {

	public static void main(String[] args) {
		
		ABCD ab=new ABCD();
		//ab.x=876;// wehave changed the value of x normally and after making the x as final variable we can't change
		System.out.println(ab.x);
	}

}
