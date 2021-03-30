package codewars;

import java.util.Scanner;

public class pangram {
	public static void main(String[] args) {
		Scanner sen = new Scanner(System.in);
		String sentence = sen.nextLine();
		sen.close();
		boolean deno = sentence.toLowerCase().replaceAll("[^a-z]", "").replaceAll("(.)(?=.*\\1)", "").length() == 26;
		System.out.println(deno);
	}
}
