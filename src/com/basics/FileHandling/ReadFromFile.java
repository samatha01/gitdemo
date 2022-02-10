package com.basics.FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFromFile {

	public static void main(String[] args) {
		try {
			File myObj=new File("D:\\FileHandling\\File1.txt");
			Scanner myReader=new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
	}

}
