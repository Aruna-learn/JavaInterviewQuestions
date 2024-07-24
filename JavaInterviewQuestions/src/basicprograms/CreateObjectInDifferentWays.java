package basicprograms;

import java.lang.reflect.Constructor;

public class CreateObjectInDifferentWays {

	public static void main(String[] args) throws ClassNotFoundException, ReflectiveOperationException, IllegalAccessException {
		
		//using new keyword
		//CreateObjectInDifferentWays co=new CreateObjectInDifferentWays();
		
		
		//using newInstanceMethod() in Class class
		
		Class cls=Class.forName("CreateObjectInDifferentWays");
		CreateObjectInDifferentWays co=(CreateObjectInDifferentWays)cls.newInstance();
		
		
		//using newInstanceMethod() of Constructor class
		
//		Constructor<CreateObjectInDifferentWays>[] con=CreateObjectInDifferentWays.class.getDeclaredConstructors();
//		CreateObjectInDifferentWays co=con.newInstance();
//		
		
		
		

	}

}
