package com.para;

public class Twosum {
	 public  int[] twoSum(int[] num,int target) {
		int n=num.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(num[i]+num[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
		 
	 }
	
   
	public static void main(String[] args) {
		Twosum obj=new Twosum();
		int [] arr= {12,2,3,2};
		int target= 15;
		int[] re=obj.twoSum(arr, target);
		if(re.length==0) {
			System.out.println("Not Found");
		}
		else {
			System.out.println(re[0]+","+re[1]);
		}

	}

}
