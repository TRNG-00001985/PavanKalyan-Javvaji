package com.para;

import java.util.Arrays;

public class Anagrams {
         public  boolean Anag(String s,String t) {
        	 char[] sCharacter=s.toCharArray();
        	 char[] tCharacter=t.toCharArray();
        	 
        	 Arrays.sort(sCharacter);
        	 Arrays.sort(tCharacter);
        	 
        	 return Arrays.equals(sCharacter, tCharacter);
         }
	public static void main(String[] args) {
		
              Anagrams obj=new Anagrams();
              String str="Car";
              String str1="Cat";
              System.out.println(obj.Anag(str, str1));
              
	}

}
