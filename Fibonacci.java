package com.Day2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int n1=0;
	     int n2=1;
	     int n3=0;
	   for(int count=3;count<=n;count++) {
	    	 n3=n1+n2;
	    	 n1=n2;
	    	 n2=n3;
	
	     }
	     System.out.println(n3);
	     
	     
	   

	}

}
