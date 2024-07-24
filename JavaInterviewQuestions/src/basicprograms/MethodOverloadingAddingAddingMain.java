package basicprograms;

public class MethodOverloadingAddingAddingMain {

	public static void main(String[] args) {
		MethodOverloadingAdding ad=new MethodOverloadingAdding();
		ad.sum();
		
		ad.sum(122, 122);
		ad.sum(20, 20.9);
		
		ad.sum(40.0, 707);
		
	}

}
