package dennisrono;

import java.util.Scanner;

public class atm{
	public static void main(String[] args) {
		createdb database = new createdb();
		database.createDatabase();
		System.out.println("/tWelcome to our ATM!\n");
		login a = new login();
		a.log();
	}
	public void mainArea() {
		Scanner op1 = new Scanner(System.in);
		System.out.println("What do you want to do?");
		System.out.println("1. Deposit Cash");
		System.out.println("2. Withdraw Cash");
		System.out.println("3. Check Balance");
		int o2 = op1.nextInt();
		switch(o2) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid option!");
		}
	}
}