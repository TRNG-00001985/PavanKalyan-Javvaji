package com.Day2;

import java.util.Arrays;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] a= {{1,2},{4,5}};
		int[][] b= {{2,5},{3,5}};
		int[][] c= new int[3][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		System.out.println(Arrays.toString(c[0])+Arrays.toString(c[1]));
	}

}
