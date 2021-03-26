package bennrono;

import java.util.Scanner;

public class bennrono {

	public static void main(String[] args) {

		System.out.println("What is your name?");
		Scanner name = new Scanner(System.in);
		String myName = name.nextLine();
		System.out.println("My name is " + myName);
		System.out.println("How old are you?");
		Scanner age = new Scanner(System.in);
		int myAge = age.nextInt();
		System.out.println("I am  "+ myAge +" years old");
		System.out.println("Welcome to the world of programming!");

	}

}
