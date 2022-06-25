package com.practice.javaPrograms.StringOperations;
   //madam
import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String str=sc.next();
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
       if(str.equals(rev))
         {
    	   System.out.println( " is pallindrome");
       }
       else
       {
    	   System.out.println("  is not pallindrome");
       }
       sc.close();
	}

}
