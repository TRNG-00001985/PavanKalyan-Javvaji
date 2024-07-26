package com.Day1;

public class CombineString {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Pavan");
		System.out.println(str.append("Kalyan"));
		StringBuilder str1=new StringBuilder("Kalyan");
		System.out.println(str1.insert(2, "B"));

	}

}
