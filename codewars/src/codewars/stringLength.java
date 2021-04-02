package codewars;
import java.util.Arrays;

public class stringLength {
	public static void main(String[] args) {
		String s = "this is an example of a string";
		System.out.println(Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt());
		int x = Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();	
		System.out.println(x);
	}
}
