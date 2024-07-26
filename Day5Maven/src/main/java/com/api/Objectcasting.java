package com.api;


public class Objectcasting extends child1 {
	


	public static void main(String[] args) {
//		 upcasting
		child1 ob=new Objectcasting();
		float a=ob.b;
		System.out.println(a);
		//downcasting
		Objectcasting oh=(Objectcasting) ob;
		short d=(short) oh.c;
		System.out.println(d);
		
	}

}
class child1 {
int b=16;
int c=19;
}