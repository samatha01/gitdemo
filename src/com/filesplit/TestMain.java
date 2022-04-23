package com.filesplit;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestMain {

	public static void main(String[] args) throws IOException {
		TestFile file=new TestFile();
		File f=new File("D://FileHandling/File1.txt");
		List<File> m=file.splitFile(f, 10);
		System.out.println(m);

	}

}
