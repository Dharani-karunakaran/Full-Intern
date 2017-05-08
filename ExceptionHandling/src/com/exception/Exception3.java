package com.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3
{
public static void main(String[] args) throws ArithmeticException
{
Scanner sc=new Scanner(System.in);
try{
try{
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println(x/y);
}

catch(InputMismatchException ime){
System.out.println("java.util.InputMismatchException");
}
}

finally{
System.out.println("-----------");
}

sc.close();
}

}
