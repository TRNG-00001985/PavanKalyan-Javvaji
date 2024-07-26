package com.Day2;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
	  int [][] a= {{1,2},{2,3}};
	  int [][] b= {{1,2},{2,3}};

	  int [][] c= new int[2][2];
	  for(int i=0;i<a.length;i++) {
		  for(int j=0;j<b[0].length;j++) {
			  for(int k=0;k<a[0].length;k++)
			  c[i][j]+=a[i][k]*b[k][j];
		  }
	  }

	  System.out.println(Arrays.toString(c[0]) + Arrays.toString(c[1]));
	}

}
