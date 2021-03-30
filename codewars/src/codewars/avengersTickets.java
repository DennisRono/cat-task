package codewars;

public class avengersTickets {
	
	public static void main(String[] args) {
		int[] peopleInLine = {22, 25, 50};
		int sum = 0;
		for(int i=0; i<peopleInLine.length; i++){
	         sum = sum + peopleInLine[i];
	      }
		System.out.println(sum);
		if (sum%25 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
