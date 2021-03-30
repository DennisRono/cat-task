package codewars;

public class codingkatas {
	public static void main(String[] args) {
		createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
	}
	public static String createPhoneNumber(int[] numbers) {
		String strArray[] = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++)
            strArray[i] = String.valueOf(numbers[i]);
		String alldb = String.join("", strArray);
		alldb = addCharToString(alldb,"(",0);
		alldb = addCharToString(alldb,")",4);
		alldb = addCharToString(alldb," ",5);
		alldb = addCharToString(alldb,"-",9);
		System.out.println(alldb);
	    return alldb;
	  }
	public static String addCharToString(String str, String string, int pos) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.insert(pos, string);
        return stringBuilder.toString();
    }
}
