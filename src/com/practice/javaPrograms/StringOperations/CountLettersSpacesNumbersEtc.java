
/* count the letters,spaces,numbers and other characters of a string
 * given string Aa kiu, I swd skieo 236587.GH kiu: sieo?? 25.33
 */

package com.practice.javaPrograms.StringOperations;

public class CountLettersSpacesNumbersEtc {

	public static void main(String[] args) {
		String test="Aa kiu, I swd skieo 236587.GH kiu: sieo?? 25.33";
		count(test);
		
	}

	public static void count(String x) {
		char[] ch=x.toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		for(int i=0;i<x.length();i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else if(Character.isSpaceChar(ch[i])){
				space++;
			}
				else {
					other++;
				}
				}
		System.out.println("The string is:Aa kiu, I swd skieo 236587.GH kiu: sieo?? 25.33");
		System.out.println("letter:" +letter);
		System.out.println("space:" +space);
		System.out.println("numbers" +num);
		System.out.println("others:" +other);
				
			}
		
			}


