package com.Day2;

import java.util.Arrays;

public class MatricTranspose {

	public static void main(String[] args) {
		int[][] a= {{1,2},{4,5}};
		int[][] b= new int[2][2];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				b[j][i]=a[i][j];
			}
		}
       System.out.println(Arrays.toString(b[0])+Arrays.toString(b[1]));
	}

}
