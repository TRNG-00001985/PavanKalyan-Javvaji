package com.Day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%100==0 && n%400==0 ) {
			System.out.println(" It is a Leap Year");
		}
		else if(n%100!=0 && n%4==0) {
			System.out.println(" It is a Leap Year");
		}
		else {
			System.out.println("It is not a Leap Year");
		}

	}

}
