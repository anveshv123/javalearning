package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfromfiletofile {
 public static void main(String args[]) throws IOException
 {
	 FileOutputStream fout=new FileOutputStream("F:\\destination.txt");
	try {
		FileInputStream fin=new FileInputStream("F:\\testout.txt");
	    int i=0;
		while((i=fin.read())!=-1){    
			 fout.write(i); 
           } 
		fin.close();

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	fout.close();
	
    
}
}