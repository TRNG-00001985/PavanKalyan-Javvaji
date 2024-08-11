package com.para;

import java.util.Stack;

class DailyTemp {
	
	public int[] DailyTemperature(int[] Temperature) {
		Stack<Integer> st=new Stack<>();
		int[] result=new int[Temperature.length];
		for(int i=0;i<Temperature.length;i++) {
			while(!st.isEmpty() && Temperature[i]>Temperature[st.peek()]) {
				int index=st.pop();
				result[index]=i-index;
			}
			st.push(i);
		}
		
		
		return result;
		
	}

	public static void main(String[] args) {
		DailyTemp Obj=new DailyTemp();
		int [] arr= {73,74,72,75,69,70,76,73};
		int[] result=Obj.DailyTemperature(arr);
		for(int Days:result)
		System.out.print(Days+" ");

	}

}
