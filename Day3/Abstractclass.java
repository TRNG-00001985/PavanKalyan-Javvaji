package com.Day3;

 abstract class cars {
	 abstract void speed();
	 abstract void gear();
 }
  class maruthi extends cars{
	 void speed() {
		System.out.println("Go slow");
	 }
	 void gear() {
		 System.out.println("Go in first Gear only");
	 }
	 
 }
 public class Abstractclass{
	public static void main(String[] args) {	
		maruthi car=new maruthi();
		car.speed();
		car.gear();
       
	}

}
