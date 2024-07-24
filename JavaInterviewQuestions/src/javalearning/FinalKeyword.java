package javalearning;

//public class FinalKeyword {
	/*
	 * final int speed=5000;//final variable void run() { speed=530;//we can't
	 * overlap the final variable, final variable once assigned a value can never be changed. }
	 * 
	 * public static void main(String[] args) { FinalKeyword fk=new FinalKeyword();
	 * fk.run();
	 * 
	 * }
	 */
	
	/*
	 * final void run() { System.out.println("final method");
	 * 
	 * } class finalkd extends FinalKeyword{ void run() { //If you make any method
	 * as final, you cannot override it.
	 * 
	 * 
	 * System.out.println("final method"); } public static void main(String[] args)
	 * { finalkd fk=new finalkd(); fk.run(); } }
	 */
	
	/*
	 * final class Aruna { }
	 * 
	 * class Anji extends Aruna{ //If you make any class as final, you cannot extend
	 * it.
	 * 
	 * 
	 * void run() { System.out.println("final class");
	 * 
	 * 
	 * } public static void main(String[] args) { Anji an=new Anji(); an.run(); } }
	 */
