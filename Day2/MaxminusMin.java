package com.Day2;

import java.util.Scanner;

public class MaxminusMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter array size");
				int n=sc.nextInt();
				int[] arr=new int[n];
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				int max=arr[0];
				int min=arr[0];
				for(int i=1;i<n;i++) {
					if(arr[i]>max) {
						max=arr[i];
						
					}
					if(arr[i]<min) {
						min=arr[i];
						
					}
					
				}
				System.out.println("Difference Between Max and Min"+" "+(max-min));
//				System.out.println(min);
				

	}

}
