package com.Day2;

import java.util.Scanner;

public class Wordcount {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a Sentence or String to count the words");
		String str1=sc.nextLine();
		int wordcount=countwords(str1);
		System.out.println("No of words in a given sentence or String=" +" "+wordcount);
		

	}
	public static  int countwords(String str) {
		if(str==null || str.isEmpty()) {
			return 0;
		}
		String[] words=str.split("\\s+");
		return words.length;
			
		}
		
		
	}


