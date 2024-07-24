package basicprograms;

//method overriding have the parent and child class has same method name and we can change the implementation of the method but method definition shouldbe same

//method definition double rateofinterest() must be same for child class also
//return 12.6;  implementation we can change as per the bank becoz differnet banks have different interest rates

class Bank{
	double rateofinterest() {
		return 0;
	}
}

class ICICI extends Bank{
	double rateofinterest() {
		return 12.6;
	}
}

class SBI extends Bank{
	double rateofinterest() {
		return 12;
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		SBI sb=new SBI();
		System.out.println(sb.rateofinterest());

		ICICI ic=new ICICI();
		System.out.println(ic.rateofinterest());



	}

}
