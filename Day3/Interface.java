package com.Day3;
import java.util.*;

 interface Shape {
	void area();
	void rectangle();
 }
 class Are implements Shape{
	 public void area() {
		
		 double r=4;
		double area1=3.14*r*r;
		 System.out.println(area1);
	 }
	 public void rectangle() {
		 int l=3;
		 int b=4;
		 int R=l*b;
		 System.out.println(R);
	 }
	 
 }

public class Interface {

	public static void main(String[] args) {
		Are ob=new Are();
		ob.area();
		ob.rectangle();

	}

}
