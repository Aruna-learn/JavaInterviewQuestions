package stringconversionprograms;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetoTimestamp {

	public static void main(String[] args) {
		Date d=new Date();
		Timestamp ts=new Timestamp(d.getTime());
		System.out.println(ts);

		//we can use simpledate format also
		SimpleDateFormat sdt=new SimpleDateFormat("dd/MMM/yyyy");
		String s=sdt.format(d);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
	}

}
