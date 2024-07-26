package com.Day3;

 class car {
	public void Vehicle(){
		System.out.println("Pavan");
		
		
	}
}

	class Polymorphism extends car{
	public void Vehicle() {
		System.out.println("kalyan");
	}
	public void Vehicle(int a) {
		System.out.println(a);
	}


	public static void main(String[] args) {
		Polymorphism oops=new Polymorphism();
		car op=new car();
		oops.Vehicle();
		op.Vehicle();
	    oops.Vehicle(20);

	}

}
