package test;
import java.io.*;
public class FileMerger {

	public static void main(String[] args) throws Exception{
		
        PrintWriter pw=new PrintWriter("xyz.txt");
        BufferedReader br1=new BufferedReader(new FileReader("aaa.txt"));
        String line=br1.readLine();
        while(line!=null)
        {
        	pw.println(line);
        	line=br1.readLine();
        }
       BufferedReader br2=new BufferedReader(new FileReader("bbb.txt"));
        line=br2.readLine();
        while(line!=null) {
        	pw.println(line);
        	line=br2.readLine();
        }
        pw.flush();
        br1.close();
        br2.close();
        pw.close();
	}

}
