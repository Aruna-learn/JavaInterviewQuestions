package basicprograms;

public class PassParameterstoMainMethod {

	public static void main(String[] args) {
		System.out.println(args.length);

		for (String string : args) {
			System.out.println(string);
		}


//rightclick-runconfiguration=arguments then run



	}

}
