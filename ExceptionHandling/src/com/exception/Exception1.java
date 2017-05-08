package com.exception;
import java.util.Scanner;

import org.omg.CORBA.DynAnyPackage.Invalid;

public class Exception1
{
	public static void method() throws Invalid
	{
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		
		
		if(age<18)
		{
			throw new Invalid("sorry ur not eligible");
			
		}
		
		
		}
	
	public static void main(String[] args) {
		try
		{
			method();
			
		}
		catch(Invalid e)
		{
			System.out.println("enter age");
		}
	}
	
}
