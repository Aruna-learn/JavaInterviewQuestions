package stringconversionprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetoString {

	public static void main(String[] args) {
		Date d=new Date();
		
		//using DateFomater class
		String std=DateFormat.getInstance().format(d);
		System.out.println(std);
		
		//using simpledateformat class
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyy:HH:mm:ss:ms");
		String ss=sdf.format(d);
		System.out.println(ss);
		
		
		
		

	}

}
