package stringconversionprograms;

public class InttoLong {

	public static void main(String[] args) {
		int i=800;
		long l=i;//using implicit lower to higher
		System.out.println(l);

		//we can  convert int value to long object by instantialing the Long class  or long.valueof
		Long l1=new Long(900);
		System.out.println(l1);
		Long l2=Long.valueOf(l1);//	Long.valueof
		
		
	}

}
