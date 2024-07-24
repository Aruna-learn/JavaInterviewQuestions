package javalearning;

import java.lang.reflect.Constructor;

public class Student {

	int id;
	String name;
	int rollno;
	Student(int i, String n,int r)
	{
		id=i;
		 name=n;
		rollno=r;
	}
	void display() {
		System.out.println(id+" "+name+" "+rollno);
	}

	public static void main(String[] args) {
		
		Student s=new Student(111,"aruhnja",67);
		
		s.display();

	}

}
	
	
	
	
	
