package com.exception;

import java.util.InputMismatchException;

public class MyCalculator {

public int power(int n,int p)throws InputMismatchException
{
if(n<0 || p<0)
{
throw new InputMismatchException();
}

return (int) Math.pow(n, p);


}

}

