package com.practice.javaPrograms.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		//Approach1
		/*FileReader fr=new FileReader("D:\\Test123.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
       br.close();*/
		//Approach2   Using File and Scanner
		File file=new File("D:\\Test123.txt");
		Scanner sc=new Scanner(file);
	/*	while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}*/
		//Approach3 without loop
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
	}

}
