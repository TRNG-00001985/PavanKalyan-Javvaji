package com.Day1;
import java.util.*;
public class Arraysum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<5;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
