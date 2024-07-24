package stringconversionprograms;

public class BinarytoDecimal {

	public static void main(String[] args) {
		
	String 	binary ="1010";
	int Decimal=Integer.parseInt(binary, 2);
	System.out.println(Decimal);
		
	System.out.println(Integer.parseInt("10101", 2));	
	System.out.println(Integer.parseInt("101010", 2));	
	System.out.println(Integer.parseInt("101", 2));	
	System.out.println(Integer.parseInt("1010100", 2));	
	

	}

}
