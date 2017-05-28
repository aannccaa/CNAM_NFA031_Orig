package Basic;

public class Stringuri {

	public static void main(String[] args) {
		boolean testsOK = true;
		testsOK = testPositieChar() && testsOK;
		testsOK = testCountChar() && testsOK;
		testsOK = testDistinctChars() && testsOK;
		testsOK = testExtractNb() && testsOK;
		testsOK = testAllignNumberToRight() && testsOK;

		if (testsOK) {
			System.out.println("Tests OK");
		} else {
			System.out.println("Tests NOK");
		}
		
		String result = printMatrix(10,10,1);
		System.out.println(result);
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
			// transforma un char in int prin scaderea cu '0', ce reprezinta
			// codul ascii al lui 0 = 48
			// int valChar = currentChar - '0';
			// int valChar = Character.getNumericValue(currentChar) -
			// Character.getNumericValue('0');
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

	public static boolean testAllignNumberToRight() {
		int nb;
		int width;
		String expected;
		String current;
		boolean testsOK = true;

		// test1
		nb = 301;
		width = 6;
		expected = "   301";
		current = allignNumberToRight(nb, width);

		if (!expected.equals(current)) {
			testsOK = false;
			System.out.format("E: '%s' ; C : '%s' ; nb: %d\n", expected, current, nb);

		}

		// test2
		nb = 30;
		width = 0;
		expected = "";
		current = allignNumberToRight(nb, width);

		if (!expected.equals(current)) {
			testsOK = false;
			System.out.format("E: '%s' ; C : '%s' ; nb: %d\n", expected, current, nb);

		}

		// test3
		nb = 301;
		width = 2;
		expected = "##";
		current = allignNumberToRight(nb, width);

		if (!expected.equals(current)) {
			testsOK = false;
			System.out.format("E: '%s' ; C : '%s' ; nb: %d\n", expected, current, nb);

		}
		return testsOK;
	}

	// umple un string cu un caracter dat, de n ori.
	public static String fill(char c, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + c;
		}

		return result;
	}

	// formateaza un numar intreg la dreapta, inserand spatii la stanga asa
	// incat latimea sa fie egala cu un parametru dat
	public static String allignNumberToRight(int nb, int width) {
		String nbAsString = "" + nb;
		int leftSpaces = width - nbAsString.length();
		String left = "";
		String result;

		// cand incape
		if (leftSpaces >= 0) {
			left = fill(' ', leftSpaces);
			// for (int i = 0; i < leftSpaces; i++) {
			// left = left + " ";
			// }
			result = left + nbAsString;

		} else {
			// cand nu incape, toata latimea width se umple cu #
			left = fill('#', width);
			// for (int i = 0; i < width; i++) {
			//
			// left = left + "#";
			// }
			result = left;

		}

		return result;
	}

	// Ecrivez un programme qui affiche un carre de 10 lignes et 10 colonnes o ´
	// u la premi ` ere cas contient 1 et `
	// ensuite chaque case contient 1 de plus que la precedente.
//	1 2 3 4 5 6 7 8 9 10
//	11 12 13 14 15 16 17 18 19 20
//	21 22 23 24 25 26 27 28 29 30
//	31 32 33 34 35 36 37 38 39 40
//	41 42 43 44 45 46 47 48 49 50
//	51 52 53 54 55 56 57 58 59 60
//	61 62 63 64 65 66 67 68 69 70
//	71 72 73 74 75 76 77 78 79 80
//	81 82 83 84 85 86 87 88 89 90
//	91 92 93 94 95 96 97 98 99 100

	

	public static String printMatrix (int nbLignes, int nbCol, int firstNb){
		String result="";
		//
	int maxNb = nbLignes*nbCol+firstNb-1;
	int maxNbWidth = (maxNb + "").length();
		
		for (int i=0; i<nbCol; i++){
			String separateur = "";
			for (int j=0; j<nbLignes; j++){
				result = result + separateur + allignNumberToRight(firstNb,maxNbWidth);
				separateur = " ";
				firstNb++;
			}
			result = result + "\n";
		}
		return result;
	}
	
/*	// Ecrivez un programme qui fasse un petit dessin de ce genre :
	****
	 **
	****
	 **
	****
	 **
	****
	Une ligne sur deux, il y a 4 etoiles, sur les autres lignes, il y en a deux, d ´ ecal ´ ees d’un espace. ´
	Dans le programme le nombre de lignes affichee est entr ´ e au clavier. Le dessin ci-dessus repr ´ esente le ´
	cas ou ce nombre vaut 7.
*/	
	
	
}
