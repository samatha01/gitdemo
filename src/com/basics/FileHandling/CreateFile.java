package com.basics.FileHandling;
import java.io.File;                //import the file class
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		try {
			File myObj=new File("D:\\FileHandling\\File1.txt");  //creating a File
			if(myObj.createNewFile()) {
				System.out.println("File created :"+myObj.getName());
			}else {
				System.out.println("File already exists");
			}
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
