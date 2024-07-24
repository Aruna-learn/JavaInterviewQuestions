package basicprograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritedataIntoTesxtfileusingFileWriterandBufferedWriter {

	public static void main(String[] args) throws IOException {
		File f=new File("./javalearn.txt");
		if(!f.exists()) {
			System.out.println(f.createNewFile());
		}
		
		
		
		
		
		FileWriter frw=new FileWriter("./javalearn.txt");
		BufferedWriter bw=new BufferedWriter(frw);
//		bw.write("arujdfs");
//		bw.write("weriuwp");
//		bw.write("gkjfpig");
//		bw.write("fporiw");
		
		frw.write("chinni");
		System.out.println("Fininished!!!!");
		
		
		bw.close();
		
		
		
		
		
		

	}

}
