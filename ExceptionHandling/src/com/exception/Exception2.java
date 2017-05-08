package com.exception;

public class Exception2 {
public static void main(String[] args) {
	try
	{
		
		System.out.println(10/0);
		
	}
	catch(ArithmeticException ne)
	{
	System.out.println("catch");
	}
	finally {
		System.out.println("finally block");
	}
	
}
}