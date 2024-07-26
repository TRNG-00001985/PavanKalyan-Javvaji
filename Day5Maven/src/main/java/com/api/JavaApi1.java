package com.api;

public class JavaApi1 {

	private  String Name="Pavan Kalyan";
	private int Id=10;
//	public String setName;
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public int getId() {
		return Id;
	
	}
	public void setId(int Id) {
		this.Id=Id;
	
	}
	public static void main(String [] args) {
		JavaApi1 name=new JavaApi1();
		System.out.println(name.Id);
		System.out.println(name.getName());
		name.Name="Kalyan";
		System.out.println(name.Name);
		name.Id=20;
		System.out.println(name.Id);
		
	}
	

}
