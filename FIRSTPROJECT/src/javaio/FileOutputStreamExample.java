package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){  
    		
    	//open output file and write on it
           try{    
             FileOutputStream fout=new FileOutputStream("F:\\testout.txt"); 
             String s = "hello world";
             byte b[]=s.getBytes();
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
           
           
         //open fil take it as input and the print content 
           try{    
               FileInputStream fin=new FileInputStream("F:\\testout.txt");    
               int i=0;    
               while((i=fin.read())!=-1){    
                System.out.print((char)i);    
               }    
               fin.close();    
             }catch(Exception e){System.out.println(e);}  
           
           
           
      }    
}  