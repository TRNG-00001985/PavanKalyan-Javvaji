package com.Day3;

class Inheritance {

	public static void main(String[] args) {
		Area j1=new Area();
		Rec obj2=new Rec();
		j1.first();
		obj2.second();

	}
}
	class Area extends Inheritance{
		public void first(){
		System.out.println("P");
	}
	}
	class Rec extends Inheritance{
		public void second() {
		System.out.println("5");
	}
	}

