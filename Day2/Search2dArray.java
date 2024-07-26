package com.Day2;

import java.util.Scanner;
public class Search2dArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]arr= {{2,1},{3,2},{5,8},{4,7}};
		int n=sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==n) {
				System.out.println("Element " + n + " found at position (" + i + ", " + j + ")");
				found=true;
				break;
				
			}
		}
		if(found) {
			break;
		}

	}
		if(!found) {
			System.out.println("Not Found");
			sc.close();
		}

}
}
