package com.Day2;

import java.util.Scanner;

public class Hardcoded {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Username="PavanKalyan";
		String Password="kalyan";
		System.out.println("Enter Username");
		String n=sc.nextLine();
		System.out.println("Enter Password");
		String n1=sc.nextLine();
		if(n.equals(Username) && n1.equals(n1) ) {
			System.out.println("Successfull logid In");
			
		}
		else {
			System.out.println("Invalid Credintials");
		}

	}

}
