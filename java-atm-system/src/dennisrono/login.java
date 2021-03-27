package dennisrono;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class login {
	
	public String log() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int pin;
		String user;
		System.out.println("Enter your username:");
		user = input.nextLine();
		System.out.println(user);
		System.out.println("Enter your Pin:");
		pin = input.nextInt();
		System.out.println(pin);
		String s = String.valueOf(pin);
		System.out.println(s);
		if (user.length() > 15) {
			user = "";
			System.out.println("Username cannot exceed 15 characters!");
		} else if (s.length() != 4) {
			pin = 0;
			System.out.println("PIN must be four numbers!");
		} else {
			System.out.println("Success!");
			String details=user.concat(s);
			System.out.println(details);
			fil(details);
		}
//		details = s + user;
//		String details=user.concat(s);
//		System.out.println(details);
		return details; 
	}
	public String details;
	String value = log();
	public String info() {
		System.out.println(value);
		String r1  = value;
		return r1; 
	}
	
	 public void fil(String details) {
		    try {
		      File myObj = new File("userdetails.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		        write(details);
		      } else {
		        System.out.println("File already exists.");
		        write(details);
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    
		    
		  }
		  public String write(String details) {
			  System.out.println(details);
			  try {
			        FileWriter myWriter = new FileWriter("userdetails.txt");
			        myWriter.write(details);
			        myWriter.close();
			        System.out.println("Username and PIN saved successfully!!");
			      } catch (IOException e) {
			        System.out.println("An error occurred.");
			        e.printStackTrace();
			      }
			return null;	  
		  }
}
