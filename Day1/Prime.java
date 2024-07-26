package com.Day1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int i=1;
		while(n>=i) { 
			if(n%i==0) {
			count++;
		}
			i++;
		}
		if(count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Composite");
		}
		
	}

}
