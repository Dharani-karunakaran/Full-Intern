package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception7 {
	
	
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);

	while(in.hasNext())
	{
	int n=in.nextInt();
	int p=in.nextInt();
	MyCalculator my_calculator=new MyCalculator();
	try{
	System.out.println(my_calculator.power(n, p));
	}
	catch(InputMismatchException e){
	System.out.println(e);
	}
	}


	in.close();	
	}

}