package unit_tests;

public class Palindromes {

	public boolean isPalindrome(String string) {
		String s = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.substring(i, i + 1).equals(" ")) {
			} else if (string.substring(i, i + 1).equals(".")) {
			} else if (string.substring(i, i + 1).equals(",")) {
			} else if (string.substring(i, i + 1).equals("!")) {
			} else {
				s += string.substring(i, i + 1);
			}

			// System.out.println(s);
		}
		s = s.toLowerCase();

		int x = s.length() / 2;
		int y = s.length() % 2;
		// if (y == 1) {
		// x += 1;
		// System.out.println(x);
		// }
		boolean a = true;
		for (int i = 0; i < x; i++) {
			// if (s.substring(i, i + 1).equalsIgnoreCase(s.substring((s.length() - i),
			// (s.length() - (i - 1))))) {
			if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
				a = false;
			}

		}
		return a;
	}
	// TODO Auto-generated method stub;

}
