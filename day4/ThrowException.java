package com.day4;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowException {
	

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter Age");
			int age=sc.nextInt();
			checkAge(age);
			
		}
		catch(Exception e) {
			System.out.println("Exception" + e.getMessage());
		}
	}
	
	public static void checkAge(int age) throws Exception{
		if(age<18) {
			throw new Exception("Age is not Valid");
		}
		else {
			System.out.println("Age is Valid");
		}
	}

}
