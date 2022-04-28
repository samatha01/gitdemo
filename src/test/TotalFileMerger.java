package test;
import java.io.*;
public class TotalFileMerger {

	public static void main(String[] args) throws Exception {
		System.out.println("welcome");
	PrintWriter pw=new PrintWriter("xyz.txt");
	File f=new File("C:\\Users\\kumar\\project\\Fileop");
    String[] s=f.list();
    for(String s1:s)
    {
    	File f1=new File(f,s1);
    	BufferedReader br=new BufferedReader(new FileReader(f1));
    	String line=br.readLine();
    	while((line!=null))
    	{
    		pw.println(line);
    		line=br.readLine();
    	}
    }
    pw.flush();
    
    pw.close();
	}

}
