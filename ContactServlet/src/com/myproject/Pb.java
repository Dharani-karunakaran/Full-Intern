package com.myproject;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Pb {

    String result = null;
    Scanner input = new Scanner(System.in);
    static HashMap<String,String> phoneBook = new HashMap<String, String>();
    public void menu(){
        while(true){
            System.out.println("Mobile contact");
            System.out.println("Choose your option ");
            System.out.println("1. Add New Contact "+"\n"+
                    "2. Search Number "+"\n" +
                    "3. Delete Number"+"\n" +
                    "4. Show All contact"+"\n" +
                    "5. Exit");
            int option=input.nextInt();
 
            switch (option)
            {
                case 1: addContact();
                    break;
            case 2: searchNumber(null);
                    break;
                case 3: deleteNumber();
                    break;
                case 4: showAll();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error");
                    break;
 
            }
        }
    }
 
    public void deleteNumber()
    {
        System.out.println("Enter The name to Delete : ");
        String name = input.next();
        if (phoneBook.containsKey(name)) 
        {
            phoneBook.remove(name);
            System.out.printf("The number of %s is Removed%n", name);
        }
        else {
            System.out.printf("The number of %s is not present%n", name);
        }
    }
 
    public String searchNumber(String name) {
 
        String n=name;
      Set s=phoneBook.keySet();
      Iterator itr=s.iterator();
      while(itr.hasNext()){
    	  String s2=(String) itr.next();
    	  boolean b=s2.contains(n);
    	  if(b){
    		String result= phoneBook.get(s2);
    		return result;
    		 
    	  }
   
      }
  
		//  System.out.println(phoneBook.containsKey(name) ? "The Number of " + name + " is : " + phoneBook.get(name) : "The Number Not Present ");
		return result;
    }
 
    public void showAll()
    {
        for (String name : phoneBook.keySet())
        {
            if(name!=null) {
                System.out.println(name+" "+phoneBook.get(name)+"");
            }
            else System.out.println("No contact");
        }
    }
 
    public boolean addContact()
    {   
        String name=PhoneBookServlet.pb.getName();
        Serializable number=PhoneBookServlet.pb.getPhoneno();
        
        if(name!=null&&number!=null)
        {
        	 phoneBook.put(name, (String) number);
             return true;
        }
        	return false;
    	}
}