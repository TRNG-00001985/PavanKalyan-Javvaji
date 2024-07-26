package com.api;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApi {
	

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
	Reflection obj=new Reflection();
		//Reflection Api
	//field
    Field [] fields=Reflection.class.getDeclaredFields();
  
    for(Field feild:fields) {
    	System.out.println(feild.getName()); 
    	}
    Field productId=Reflection.class.getDeclaredField("productId");
    Field productName=Reflection.class.getDeclaredField("productName");

    productId.setAccessible(true);
    System.out.println(productId.get(obj));
    productId.set(obj, 6);
    System.out.println(productId.get(obj));
    
    //Invoke Methods
    productName.setAccessible(true);
    productName.set(obj,"PocoX4");    
    Method [] methods=Reflection.class.getDeclaredMethods();
    for(Method method:methods) {
    	System.out.println(method.getName());
    }
    
    Method getProductName=Reflection.class.getMethod("getProductName");
    getProductName.setAccessible(true);
   
    
    System.out.println(getProductName.invoke(obj));
	}

}
