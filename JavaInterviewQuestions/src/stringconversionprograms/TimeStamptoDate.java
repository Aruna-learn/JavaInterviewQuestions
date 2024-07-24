package stringconversionprograms;

import java.sql.Timestamp;
import java.util.Date;

public class TimeStamptoDate {

	public static void main(String[] args) {
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		Date d=new Date(ts.getTime());
		System.out.println(d);
		
		Timestamp ts1=new Timestamp(System.currentTimeMillis());
		Date d1=ts1;//The Timestamp class extends Date class. So, you can directly assign instance of Timestamp class into Date
		System.out.println(d1);
		
		
		
	}

}
