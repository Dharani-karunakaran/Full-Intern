package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception8 {
	
	public static void main(String[] args)throws ArithmeticException
	{
	Scanner sc=new Scanner(System.in);
	try{
	try{

	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println(x/y);
	}
	catch(InputMismatchException e){
	System.out.println("java.util.InputMismatchException");
	}
	}
	
	catch(ArithmeticException e){
	System.out.println(e);
	}

	sc.close();
	}

	}
