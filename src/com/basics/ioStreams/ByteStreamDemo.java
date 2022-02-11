package com.basics.ioStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		
       FileInputStream inStream=null;
       FileOutputStream outStream=null;
       try {
    	   inStream=new FileInputStream("D:\\FileHandling\\File1.txt");
    	   outStream=new FileOutputStream("D:\\FileHandling\\Filef1.txt");
    	   int content;
    	   while((content=inStream.read())!=-1){
    		   outStream.write((byte)content);
    		   
    	   }
       }finally {
    	   if(inStream!=null) {
    		   inStream.close();
    	   }
    	   if(outStream!=null) {
    		   outStream.close();
    	   }
       }
	}

}
