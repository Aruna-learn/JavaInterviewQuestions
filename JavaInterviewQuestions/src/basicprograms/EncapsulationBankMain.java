package basicprograms;

public class EncapsulationBankMain {

	public static void main(String[] args) {
		EncapsulationBank en=new EncapsulationBank();
		
		en.setAcnnum(19589);
		en.setname("aruna");
		en.setamount(57846);
		
		
		System.out.println(en.getacno()+" "+ en.getname()+" "+ en.getamount());
		
		
	}

}
