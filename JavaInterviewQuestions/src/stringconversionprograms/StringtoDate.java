package stringconversionprograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDate {

	public static void main(String[] args) throws Exception {
//		String dt="11/06/2024";
//		Date d=new SimpleDateFormat("dd/MM/yyyy").parse(dt);
//		System.out.println(dt +"\t"+d );

		
		
		
		//another way to convert string to date
		String dt="11/06/2024";
		//String dt1="11-June-2024";
		String dt2="11 06 2024";
		String dt3="Tue,11 06 2024";
		String dt4="11/06/2024 11:09:00";
		String dt5="Thu,11 06 2024 12:36:34";
		String dt6="11-June-2024 12:12:34";
		
SimpleDateFormat format=new SimpleDateFormat("dd/MM/YYYY");
//SimpleDateFormat format1=new SimpleDateFormat("dd-MMM-yyyy");
SimpleDateFormat format2=new SimpleDateFormat("dd MM YYYY");
SimpleDateFormat format3=new SimpleDateFormat("E,dd MM YYYY");
SimpleDateFormat format4=new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
SimpleDateFormat format5=new SimpleDateFormat("E,dd MM YYYY HH:mm:ss");
SimpleDateFormat format6=new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
		
Date d=format.parse(dt);
//Date d1=format.parse(dt1);
Date d2=format.parse(dt2);
Date d3=format.parse(dt3);
Date d4=format.parse(dt4);
Date d5=format.parse(dt5);
Date d6=format.parse(dt6);
		
	System.out.println(dt+"\t"+d);
	//System.out.println(dt1+"\t"+d1);
	System.out.println(dt2+"\t"+d2);
	System.out.println(dt3+"\t"+d3);
	System.out.println(dt4+"\t"+d4);
	System.out.println(dt5+"\t"+d5);
	System.out.println(dt6+"\t"+d6);
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
