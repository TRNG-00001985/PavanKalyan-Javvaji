package com.Day3;


//Default constructor
class Race{
  Race(){
	System.out.println("Default Constructor");
 }
}
class bike{
	 bike(String str) {
//		String str="Parametarized constructor ";
		System.out.println(str);
	}
}
class Constructors{
	public static void main(String[] args) {
		Race veh=new Race();
	
        bike b=new bike("23");
       
	}

}
