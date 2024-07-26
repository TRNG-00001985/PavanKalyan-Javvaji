package com.Day2;

public class StringPalindrome {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("madam");
//				StringBuilder str1=str;
//				System.out.println(str.reverse());
				StringBuilder str1= new StringBuilder(str.reverse());
				if(str1.equals(str1)) {
					System.out.println("String Palindrome");
				}
				else {
					System.out.println("Not A string Palindrome");
				}
		
	}

}
