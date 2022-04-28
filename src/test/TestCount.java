package test;
import java.io.*;
public class TestCount {

	public static void main(String[] args) throws Exception{
		System.out.println("welcome");
	int count=0;
	File f=new File("C:\\Users\\kumar\\project\\Fileop");
	String[] s=f.list();
	for(String s1:s)
	{
		count++;
		System.out.println(s1);
	}
    System.out.println("The total number:" +count);
	}

}
