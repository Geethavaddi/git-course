package Arrays2;

public class CharSeq {
	public static void charactersAfter(char[] array, char target) {
		boolean found = false;
		for (char ch : array) {
			if (found) {
				System.out.print(ch + " ");
			}
			if (ch == target) {
				found = true;
			}
		}
	}

	public static void main(String[] args) {
		char[] charArray = { 'a', 'b', 'c', 'd', 'a', 'e', 'f', 'g' };
		char targetChar = 'a';
		System.out.println("Characters after '" + targetChar + "': ");
		charactersAfter(charArray, targetChar);
	}
}
