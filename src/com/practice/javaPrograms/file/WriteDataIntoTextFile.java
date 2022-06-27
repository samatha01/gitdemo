package com.practice.javaPrograms.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("D:\\Test123.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Welcome to java \n");
		bw.write("java developers \n");
		bw.write("finished");
		System.out.println("finished!!!!!!");
		bw.flush();
        bw.close();
	}

}
