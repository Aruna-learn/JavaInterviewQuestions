package basicprograms;



class Animal{
	String color="red";
	void eat() {
		System.out.println("Anila eating....");
	}
	
}

class Dog extends Animal{
	String color="white";
	void colorn() {
		System.out.println(super.color);//using super keyword we will get the parent color
	}
	
	void eat() {
		System.out.println("Dog eating....");//overriding
		super.eat();//super class method invoiking
	}
	
}







public class SuperKeyword {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.colorn();
		d.eat();
		
		
		
		
		
	}

}
