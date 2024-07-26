package com.Day2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class ArrayareEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  First Array Size");
		int n=sc.nextInt();
//		System.out.println("Enter  First Array Size");
		int [] array=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter second array size ");
		int n1=sc.nextInt();
		int [] array1=new int[n1];
		System.out.println("Eneter Array elements");
		for(int i=0;i<n1;i++) {
			array1[i]=sc.nextInt();
		}
		if(n==n1) {
			System.out.println("Array are equal Size");
		}
		else {
			System.out.println("Array are not equal");
		}
		for(int i=0;i<n;i++) {
		if(array[i]==array1[i]) {
			System.out.println("array elements are equal");
		}
		}
		
			System.out.println("Elements are not equal");
		

	
	}

}
