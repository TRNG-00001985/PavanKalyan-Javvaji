package com.day4;

public class ArrayException {
	public static void main(String []args) {
		int arr[]= new int[4];
		int i=arr[4];
		try {
//			 i=arr[2];
	System.out.println(i);
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

}
}
