package test;
import java.io.*;
import java.util.Scanner;
public class FileCopyDynamically {

	public static void main(String[] args) throws FileNotFoundException,IOException {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter source file:");
      String srcFile=sc.nextLine();
      System.out.println("Enter destination file:");
      String destFile=sc.nextLine();
      FileInputStream fis=new FileInputStream(srcFile);
      FileOutputStream fos=new FileOutputStream(destFile);
      int data;
      while((data=fis.read())!=-1) {
    	  fos.write(data);
      }
      System.out.println("File copied");
      fis.close();
      fos.close();
      sc.close();
	}

}
