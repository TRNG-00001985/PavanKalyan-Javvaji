package com.Day1;
import java.util.ArrayList;
public class StringsWork {

	public static void main(String[] args) {
//		Finding Length
		String str="Pavan";
		System.out.println(str.length());
//		Concatinating Strings
		System.out.println(str.concat(" Kalyan"));
//		Substrings
		String str1="Pavan Kalyan";
		System.out.println(str1.substring(5));
//		Subsequence string
		System.out.println(str1.subSequence(2, 6));
//		Spliting String
		String[] a=str1.split("a");
		for(String i:a) {
			System.out.print(i+" ");
			
		}
		
//		Triming String
		String str3="   Raghu ";
		System.out.println("\n"+str3.trim());
//		lowercase
		System.out.println(str1.toLowerCase());
//		uppercase
		System.out.println(str1.toUpperCase());
//		IndexOf string
		System.out.println(str1.indexOf("v"));
		System.out.println(str1.lastIndexOf("a"));
//		CharatIndex
		System.out.println(str1.charAt(4));
//		Replace
		System.out.println(str1.replace("n", "d"));
//		Replace All
		System.out.println(str1.replaceAll("Pavan", "Javvaji"));
		String str4="Pavan Kalyan Pavan Kalyan";
		System.out.println(str4.replaceFirst("Kalyan", "nAN"));
//		endswith
		System.out.println(str1.endsWith("a"));
//		StartsWith
		System.out.println(str1.startsWith("a"));
		
		
		
		
	}

}
