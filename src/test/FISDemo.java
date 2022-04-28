package test;
import java.io.*;
public class FISDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileInputStream fis=new FileInputStream("abcde.txt");
	int data;
	while((data=fis.read())!=-1) {
		System.out.println("data: " +data +"\t"+ (char)data);
	}
		fis.close();
	}

}
