package com.basics.ioStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class NioExample {

	public static void main(String[] args) throws IOException {
		
       FileInputStream fin=new FileInputStream("D:\\FileHandling\\File1.txt");
       FileChannel readChannel=fin.getChannel();
       ByteBuffer readBuffer=ByteBuffer.allocate(1024);
       int result=readChannel.read(readBuffer);
       System.out.println("File read successfully "+result);
	
	    FileOutputStream fout=new FileOutputStream("D:\\FileHandling\\FileF1.txt");
	    FileChannel writeChannel=fout.getChannel();
	    ByteBuffer writeBuffer=ByteBuffer.allocate(1024);
	    String message="This is a text string";
	    writeBuffer.put(message.getBytes());
	    writeBuffer.flip();
	    writeChannel.write(writeBuffer);
	    System.out.println("File written successfully");
	}
}
