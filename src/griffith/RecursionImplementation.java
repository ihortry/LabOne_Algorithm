package griffith;

public class RecursionImplementation {

	public static void main(String[] args) {
		 printBetween('a','f');

	}
	public static void printBetween(char first, char second) {
		if(first <= second) {
			System.out.print(first + " ");
			printBetween((char)(first+1), second);
		}
	}
}
