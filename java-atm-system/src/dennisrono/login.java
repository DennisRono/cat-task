package dennisrono;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class login{
	int balance = 0;
	Scanner input = new Scanner(System.in);
	public void log() {
		System.out.println("Are you new or a member?\n");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int o1 = input.nextInt();
		input.nextLine();
		switch(o1) {
		case 1:
			newAccount();
			break;
		case 2:
			enter();
			break;
		default:
				System.out.println("\nInvalid option!");
		}
	}

	private void enter() {
		System.out.println("\tLOGIN\n");
		System.out.println("Enter your username: ");
		String username = input.nextLine();
		System.out.println("Enter your Pin: ");
		int pin = input.nextInt();
		Integer ii = pin;
		String access = username + "-" + ii.toString();
		if(pin == 0 || pin > 9999 || pin <1000) {
			System.out.println("Invalid pin type!");
		} else if (username == "") {
			System.out.println("Username cannot be empty!");
		} else {
			try {
		          File myObj = new File("db.txt");
		          Scanner myReader = new Scanner(myObj);
		          String[] adddb = {"0-admin-3434"};    
		          while (myReader.hasNextLine()) {
		            String data = myReader.nextLine();
		            ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(adddb));
		            arrayList.add(data);
		            adddb = arrayList.toArray(adddb);
		          }
		          String alldb = String.join(",", adddb);
		          if (alldb.contains(access)) {
		            	System.out.println("Acces Granted!");
		            	atm goin = new atm();
		            	goin.mainArea();
		            } else {
		            	System.out.println("Check your username or password!");
		            	enter();
		            }
		          myReader.close();
		        } catch (FileNotFoundException e) {
		          System.out.println("An error occurred.");
		          e.printStackTrace();
		        }
		}
		
	}

	private void newAccount() {
		System.out.println("\tREGISTER\n");
		int id;
		id = 0;
		id = id++;
		System.out.println("Enter your username: ");
		String username = input.nextLine();
		System.out.println("Enter your Pin: ");
		int pin = input.nextInt();
		System.out.println("Confirm your Pin: ");
		int cpin = input.nextInt();
		if (pin != cpin) {
			System.out.println("Not matching!");
			newAccount();
		} else if(pin == 0 || pin > 9999 || pin <1000) {
			System.out.println("Invalid pin type!");
		} else if (username == "") {
			System.out.println("Username cannot be empty!");
		} else {
			try {
			      FileWriter myWriter = new FileWriter("db.txt", true);
			      BufferedWriter out = new BufferedWriter(myWriter);
			      out.write(id +"-"+ username + "-" + pin + balance +"\n");
			      out.close();
			      System.out.println("Sucess!");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}
		
	}
}