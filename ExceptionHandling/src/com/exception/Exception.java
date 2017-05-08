package com.exception;
class Exception
{
   
   public static int Excptn()
   {
      try {
    
       
    	  return 112;
    	 
          
      
      }
      finally {
    	 
        System.out.println("Finally block");
        System.out.println("Executed");
       
      }
   }
      public static void main(String args[])
      {
         System.out.println(Exception.Excptn());
         
      }
   
}
