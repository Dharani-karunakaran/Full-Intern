package com.exception;

import java.io.IOException;





//If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.

class Exception4
{  
  void msg()
  {
	  System.out.println("parent");
  }  
}  
  
class ExceptionChild extends Exception4{  
  void msg()throws IOException
  {  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[])
  {  
   Exception4 ex=new ExceptionChild();  
   ex.msg();  
  }  
}  


//output: compile time error