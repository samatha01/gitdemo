package com.practice.javaPrograms;

import java.util.Scanner;

//153=1*1*1+5*5*5+3*3*3
  
public class ArmstrongNumber {

	public static void main(String[] args) {
		//int n=153;
         System.out.println("Enter a number");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int temp=n;
         int r,sum=0;
         while(n>0)
         {
        	 r=n%10;
        	 sum=sum+r*r*r;
        	 n=n/10;
         }
         if(temp==sum)
         {
        	 System.out.println("Armstrong Number");
        	 
         }
         else
         {
        	 System.out.println("Not Armstrong Number");
         }
         sc.close();
	}

}
