package com.day4;

public class Exeptions {
	

	public static void main(String[] args) {
		int a=10;
		int b=0;
		String str=null;
//		System.out.println(str.length());
		try
		{		
//			System.out.println(a%b);
			System.out.println(str.length());
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
