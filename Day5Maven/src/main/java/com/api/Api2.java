package com.api;

public class Api2 {

	public static void main(String[] args) {
		JavaApi1 cls=new JavaApi1();
		System.out.println(cls.getId());
		System.out.println(cls.getName());
		cls.setName("kalal");
		cls.setId(41);
		System.out.println(cls.getId());
		System.out.println(cls.getName());

	}

}
