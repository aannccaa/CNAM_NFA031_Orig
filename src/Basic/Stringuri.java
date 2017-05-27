package Basic;

public class Stringuri {

	public static void main(String[] args) {
		boolean testsOK = true;
		testsOK = testPositieChar() && testsOK;
		testsOK = testCountChar() && testsOK;
		testsOK = testDistinctChars() && testsOK;
		testsOK = testExtractNb() && testsOK;

		if (testsOK) {
			System.out.println("Tests OK");
		} else {
			System.out.println("Tests NOK");
		}
	}

	// pt un string dat, gaseste positia unui character, Returneaza -1 daca nu
	// gaseste.
	public static int pos(char c, String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}

	public static boolean testPositieChar() {
		String s;
		char c;
		int expected;
		int current;
		boolean testsOK = true;

		// test1
		s = "abc1n";
		c = 'b';
		expected = 1;
		current = pos(c, s);

		if (expected != current) {
			testsOK = false;
			System.out.format("E: %d ; C : %d ; s: %s, c: %c \n", expected, current, s, c);

		}

		// test2
		s = "axc1n";
		c = 'b';
		expected = -1;
		current = pos(c, s);

		if (expected != current) {
			testsOK = false;
			System.out.format("E: %d ; C : %d ; s: %s, c: %c \n", expected, current, s, c);

		}

		return testsOK;
	}

	// numara de cate ori apare un character dat intr-un string

	public static int countChar(char c, String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	public static boolean testCountChar() {
		String s;
		char c;
		int expected;
		int current;
		boolean testsOK = true;

		// test1
		s = "abc1n";
		c = 'b';
		expected = 1;
		current = countChar(c, s);

		if (expected != current) {
			testsOK = false;
			System.out.format("E: %d ; C : %d ; s: %s, c: %c \n", expected, current, s, c);

		}

		// test2
		s = "aabc1na";
		c = 'a';
		expected = 3;
		current = countChar(c, s);

		if (expected != current) {
			testsOK = false;
			System.out.format("E: %d ; C : %d ; s: %s, c: %c \n", expected, current, s, c);

		}

		// test3
		s = "aabc1na";
		c = 'x';
		expected = 0;
		current = countChar(c, s);

		if (expected != current) {
			testsOK = false;
			System.out.format("E: %d ; C : %d ; s: %s, c: %c \n", expected, current, s, c);

		}
		return testsOK;
	}

	// dintr-un string s1 dat, formeaza alt string s2 din caracterele distincte
	// ale lui s1

	public static String distinctChars(String s) {
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (pos(currentChar, s2) < 0) {
				s2 = s2 + currentChar;
			}
		}
		return s2;
	}

	public static boolean testDistinctChars() {
		String s;
		String expected;
		String current;
		boolean testsOK = true;

		// test1
		s = "abc1n";
		expected = "abc1n";
		current = distinctChars(s);

		if (!expected.equals(current)) {
			testsOK = false;
			System.out.format("E: %s ; C : %s ; s: %s\n", expected, current, s);

		}

		// test2
		s = "aba1a";
		expected = "ab1";
		current = distinctChars(s);

		if (!expected.equals(current)) {
			testsOK = false;
			System.out.format("E: %s ; C : %s ; s: %s\n", expected, current, s);

		}

		// test3
		s = "2bc2b";
		expected = "2bc";
		current = distinctChars(s);

		if (!expected.equals(current)) {
			testsOK = false;
			System.out.format("E: %s ; C : %s ; s: %s\n", expected, current, s);

		}
		return testsOK;
	}

	// pentru un string dat, gasete o methoda care scoate toate cifrele si
	// returneaza un intreg format din concatenarea cifrelor

	public static String extractDigits(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (Character.isDigit(currentChar)) {
				result = result + currentChar;
			}
		}
		return result;
	}

	public static int power(int x, int y) {
		int result = 1;
		for (int i = 0; i < y; i++) {
			result = result * x;
		}
		return result;
	}

	public static int convertDigits(String s) {
		int result = 0;
		if (s.length() == 0) {
			return -1;
		}

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			// transforma un char in int prin scaderea cu '0', ce reprezinta codul ascii al lui 0 = 48
			//int valChar = currentChar - '0';
			//int valChar = Character.getNumericValue(currentChar) - Character.getNumericValue('0');
			int valChar = Character.digit(currentChar, 10);
			int exponent = s.length() - 1 - i;
			result = result + valChar * power(10, exponent);

		}
		return result;
	}

	public static int extractNb(String s) {
		String digits = extractDigits(s);
		int nb = convertDigits(digits);

		return nb;
	}

	public static boolean testExtractNb() {
		String s;
		int expected;
		int current;
		boolean testsOK = true;

		// test1
		s = "abc1n2";
		expected = 12;
		current = extractNb(s);

		if (expected != current) {
			testsOK = false;
			System.out.format("E: %d ; C : %d ; s: %s\n", expected, current, s);

		}

		// test2
		s = "0abc1n1";
		expected = 11;
		current = extractNb(s);

		if (expected != current) {
			testsOK = false;
			System.out.format("E: %d ; C : %d ; s: %s\n", expected, current, s);

		}

		// test3
		s = "abc";
		expected = -1;
		current = extractNb(s);

		if (expected != current) {
			testsOK = false;
			System.out.format("E: %d ; C : %d ; s: %s\n", expected, current, s);

		}
		return testsOK;
	}

}
