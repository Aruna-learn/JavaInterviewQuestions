package numberprograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {


		//approach1 -using Random class-java.util

		Random ran=new Random();

		int random_int=ran.nextInt(100000);//from 0 to 9 and when we executes everytime generate new random number an max limit is 1000
		System.out.println(random_int);


		//for double and float range is 0.0 to less than 1.0
		double d=ran.nextDouble();
		System.out.println(d);

		float f=ran.nextFloat();
		System.out.println(f);


		//approach 2 usin Math class java.lang.math

		double dm=Math.random();//for double range is 0.0 to less than 1.0

		System.out.println(dm);

		//approaach 3 using ThreadLocalRandom class java.util.concurrent

		int a =ThreadLocalRandom.current().nextInt();
		System.out.println(a);

		double b =ThreadLocalRandom.current().nextDouble();
		System.out.println(b);

		float ff =ThreadLocalRandom.current().nextFloat();
		System.out.println(f);

		//approach 4 using Apache commons lang api
		String rn= RandomStringUtils.randomNumeric(5);//5 gives 5 digit random number and number is converted to string and gives result
		System.out.println(rn);

		String rns= RandomStringUtils.randomAlphanumeric(9);//9 gives 5 characters random string 
		System.out.println(rns);

	}

}
