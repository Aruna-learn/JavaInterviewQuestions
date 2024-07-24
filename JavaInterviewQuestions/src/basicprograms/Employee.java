package basicprograms;

public class Employee {

	//class methods and objects in the same class and we can write  the classes separately and main method and main class in separate class and create he object and access 
	
	
	//variables
		int eid;
		String ename;
		String job;
		int salary;

	//methods
	void display() {
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee emp=new Employee();//object the cop[y the class level variables and we can't acces the class level variables directly so we use the object in main method and acess
		emp.eid=101;
		emp.ename="aruna";
        emp.job="Software Tester";
        emp.salary=67000;
		emp.display();
	}
}
