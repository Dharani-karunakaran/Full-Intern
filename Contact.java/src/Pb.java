import java.util.HashMap;
import java.util.Scanner;

public class Pb {
    Scanner input = new Scanner(System.in);
    HashMap<String,Integer> phoneBook = new HashMap<String, Integer>();
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
                case 2: searchNumber();
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
 
    private void deleteNumber()
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
 
    private void searchNumber() {
        System.out.println("Enter The Name : ");
        String name = input.next();
        System.out.println(phoneBook.containsKey(name) ? "The Number of " + name + " is : " + phoneBook.get(name) : "The Number Not Present ");
    }
 
    private void showAll()
    {
        for (String name : phoneBook.keySet())
        {
            if(name!=null) {
                System.out.println(name+" "+phoneBook.get(name));
            }
            else System.out.println("No contact");
        }
    }
 
    private void addContact() 
    {
        System.out.print("Enter the Name : ");
        String name = input.next();
        System.out.print("Enter the number : ");
        double num = input.nextDouble();
        int number = (int) num;
        phoneBook.put(name,number);
        System.out.println("Number added to your contact");
    }
}