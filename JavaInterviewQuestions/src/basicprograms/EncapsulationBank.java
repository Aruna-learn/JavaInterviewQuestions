package basicprograms;

public class EncapsulationBank {

	//in encapsulation all variable should be private and every variable  create 2methods are getter and setter and opearate those variable through methods and having methods are get and setter

	private int accno;
	private String name;
	private double amount;


	void setAcnnum(int accno) {
		this.accno=accno;
	}

	int getacno() {
		return accno;
	}

	void setname(String name) {
		this.name=name;
	}
	String getname() {
		return name;
	}


	void setamount(double amount) {
		this.amount=amount;
	}

	double getamount() {
		return amount;
	}
}


