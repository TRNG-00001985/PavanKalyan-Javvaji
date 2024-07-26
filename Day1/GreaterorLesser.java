package com.Day1;

public class GreaterorLesser {

	public static void main(String[] args) {
		int a=3;
		int b=1;
		int c=6;
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if(b>c && b>a) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
		
		if(a<b && a<c) {
			System.out.println(a);
		}
		else if(b<c && b<a) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		

	}

}