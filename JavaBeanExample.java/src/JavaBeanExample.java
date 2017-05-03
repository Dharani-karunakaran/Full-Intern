import java.util.*;

public class JavaBeanExample
{
 
private static String Name;
  private static int Id;
  private static String Email;
  private static String Location;


  public JavaBeanExample()
  {

  }

  public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
  }

  public Integer getId() {
    return Id;
  }

  public void setId(int id) {
    this.Id = id;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    this.Email = email;
  }

  public String getLocation() {
    return Location;
  }

  public void setAddress(String location) {
    this.Location = location;
  }

  public String toString() {
		String
		result = " Name: " + getName() + "\n";
		result += "ID: " + getId() + "\n";
		result += "Email : " + getEmail() + "\n";
		result += "Location: " + getLocation() + "\n";
		return result;
	}


public static void main(String ar[])
{
  JavaBeanExample jbx=new JavaBeanExample();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter name :");
    Name = sc.nextLine();
  jbx.setName(Name);

  System.out.println("Enter ID:");
  
 jbx.setId(Id);

  System.out.println("Enter Email:");
  Email = sc.nextLine();
  jbx.setEmail(Email);

  System.out.println("Enter Location:");
  Location = sc.nextLine();
  jbx.setLocation(Location);

  System.out.println(jbx);
}

private void setLocation(String location2) {
	// TODO Auto-generated method stub
	
}


}

