package basicprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaddatafromTesxtfileusingFileReaderandBufferReader {

	public static void main(String[] args) throws Exception {
		
		
	//approach1 using filereader and bufferedreader
		File f=new File("./Java.txt");
		
		if(!f.exists()) {
			System.out.println(f.createNewFile());
		}
		FileReader fr=new FileReader("./Java.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String line;
		//Reads each line    
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
		
		//approach2 using scanner and file class
		
//		File f=new File("./Java.txt");
//		Scanner sc=new Scanner(f);
		
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		//instead of using while loop we can use the delimiter also
//		sc.useDelimiter("\\Z");
//		System.out.println(sc.next());
		
		
		
		

	}

}
