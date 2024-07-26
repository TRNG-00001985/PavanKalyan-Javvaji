package com.api;

public class Reflection {

	private String productName;
	private int productId=4;
	public String getProductName() {
		return productName;
	}
	private void setProductName(String productName) {
		this.productName = productName;
	}
	private int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public static void main(String []args) {
		Reflection obj=new Reflection();
	    obj.productId=10;
		System.out.println(obj.productId);
		obj.productName="Pavan";
		System.out.println(obj.productName);
	}
}
