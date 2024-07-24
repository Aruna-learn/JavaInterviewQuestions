package basicprograms;


//tyoecasting userdefined objects
class Animall{}
class Dogg extends Animall{}
class Cat extends Animall{}

//userdefined objects typecasting
public class TypeCastingObjects {

	public static void main(String[] args) {
		
		// synaax for typecast objects   A b=(c) d ;		
		//rule 1 conversion
//		Animall an=new Animall();
//		Cat c=(Cat)an;//[c and d have c=either child to parent and parent to  child relationship]
		
		
		//rule 2 after conversion storing
//		Animall an=new Dogg();
//		Cat c=(Cat)an;//c must be  either same or child of c
		
		
		//rule 3 underlying object of d  is an=new Dog(); here d is an must bhe either same of child of c
		//Animall an=new Dogg();
		//Cat c=(Cat)an;//invalid
		
		//if rule 1 an fail we get compile time error and rule3 fails get runtime exception

		Animall an=new Dogg();
		Dogg d=(Dogg)an;// valid for all 3 rules
		
		
	}
















}
