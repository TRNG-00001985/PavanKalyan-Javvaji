package com.para;

import java.util.Stack;

class ValidParentheses {
          
	public boolean isValid(String s) {
		Stack<Character> ch=new Stack<>();
		for(char c : s.toCharArray()) {
			if(c=='{') {
				ch.push('}');
			}
			else if(c=='[') {
				ch.push(']');
			}
			else if(c=='(') {
				ch.push(')');
			}
			else if(ch.isEmpty() || ch.pop() !=c) {
				return false;
			}
			
		}
		return ch.isEmpty();
		
	}
		public static void main(String[] args) {
			ValidParentheses str=new ValidParentheses();
		        String str1="[()]";
		        System.out.println(str.isValid(str1));
		

}
}
