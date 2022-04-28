package test.FileInfo;
import java.io.*;
public class BufferedWriterDemo {
public static void main(String[] args) throws IOException
{
	FileWriter fw=new FileWriter("abc.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(100);
	bw.newLine();
	char[] ch= {'a','b','c','d'};
	bw.write(ch);
	bw.newLine();
	bw.write("Durga");
	bw.newLine();
	bw.write("Software Solutions");
	bw.write("100");
	bw.newLine();
	bw.write("true");
	bw.flush();
	bw.close();
}
}
