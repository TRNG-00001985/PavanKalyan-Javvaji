package com.Day2;

import java.util.Scanner;
import java.util.Arrays;
public class Subarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        int arr[]= {2,3,5,1,7,8,9,10};
        int start=3;
        int end=7;
        int[] subarray=Arrays.copyOfRange(arr, start, end);
        System.out.println(Arrays.toString(subarray));
	}

}
