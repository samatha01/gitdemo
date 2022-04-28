package test;
import java.io.*;
public class FileCopy {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
     FileInputStream fis=new FileInputStream("aaa.txt");
     FileOutputStream fos=new FileOutputStream("bbb.txt");
     int data;
     while((data=fis.read())!=-1){
    	fos.write(data); 
     }
     System.out.println("File copied");
     fis.close();
     fos.close();
	}

}
