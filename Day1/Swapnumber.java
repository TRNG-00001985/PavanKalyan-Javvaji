package com.Day1;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println("After Swapping");
		System.out.println("a=" + a);
		System.out.println("b="+ b);

	}

}
