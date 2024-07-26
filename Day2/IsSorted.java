package com.Day2;
import java.util.Scanner;
import java.util.Arrays;
public class IsSorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int [] arr= {2,1,6,7,9};
		boolean isSorted=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
				break;
			}
		}
		if(isSorted) {
		System.out.println("Array sorte");
		

	}
		else {
			System.out.println("Not Sorted");
		}

}
}
