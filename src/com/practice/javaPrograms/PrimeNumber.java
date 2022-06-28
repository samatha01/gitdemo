package com.practice.javaPrograms;

//  1 and itself factors. 
//19   -    1,19
public class PrimeNumber {

	public static void main(String[] args) {
		int num=19;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("not prime number");
			}
		}
		else {
			System.out.println("not prime number");
		}
	}

}
