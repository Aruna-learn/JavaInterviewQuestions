package basicprograms;

public class ConstructortOverloading {
	double width,height, depth;

	ConstructortOverloading(){ //default constructor
		width=height= depth=0;
	}

	ConstructortOverloading(double w, double h, double d){ //parameterized with constructor and different parameters
		width=w;
		height= h;
		depth=d;
	}


	ConstructortOverloading(double len){ //parameterized with constructor with order of parameters should be different
		width=height= depth=len;
	}

	double data() {
		return (width*height*depth);

	}

}
