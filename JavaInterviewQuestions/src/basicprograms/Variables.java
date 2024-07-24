package basicprograms;

public class Variables {

	int sid;
	String sname;
	
	 void strudata() {
		 System.out.println(sid+" "+sname);
	 }
	
	 //using method
	 void setdata(int id,String name)//local variables
	 {
		 sid=id;
		 sname=name;
	 }
	
	 
	//using constructor parameterized
	 Variables(int id,String name)
		 {
			 sid=id;
			 sname=name;
		 }
	 
	 
	 
	 
	 
	 
	
}
