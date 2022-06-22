package com.practice.javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s="Welcome";
		StringBuffer rev=new StringBuffer(s);
		System.out.println(rev.reverse());
        /* String rev=" ";
         int l;
         l=s.length();//length of string
         for(int i=l-1;i>=0;i--)
         {
        	 rev=rev+s.charAt(i);
         }
         System.out.println(rev);*/
	}

}
