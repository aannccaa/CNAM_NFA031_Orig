package Basic;

public class DataTypes {

	public static void main(String[] args) {
		boolean isTestsOK = true;

		isTestsOK = testImpartireIntreIntregi() && isTestsOK;
		isTestsOK = testImpartireCuVirgula() && isTestsOK;
		isTestsOK = testIsPar() && isTestsOK;
		isTestsOK = testIsMultiple() && isTestsOK;
		isTestsOK = testMultipliiMax() && isTestsOK;
		isTestsOK = testFillArray() && isTestsOK;
		isTestsOK = testSayHello() && isTestsOK;
		isTestsOK = testSplit() && isTestsOK;

		if (isTestsOK == true) {
			System.out.println("Tests OK");
		} else {
			System.out.println("Tests NOK");
		}

	}

	public static boolean testImpartireCuVirgula() {
		double x;
		double y;
		double expectedResult;
		boolean testsOK;
		x = 1.0;
		y = 2.0;
		expectedResult = 0.5;
		double currentResult = ImpartireCuVirgula(x, y);
		if (currentResult == expectedResult) {
			testsOK = true;
		} else {
			testsOK = false;
			System.out.format("OP:%f,%f,E:%f,R:%f\n", x, y, expectedResult, currentResult);
		}
		return testsOK;
	}

	public static double ImpartireCuVirgula(double x, double y) {
		double result = x / y;
		return result;
	}

	// inmultire intreg cu 1.0 ca sa fortez un rezultat double
	public static double ImpartireIntreIntregi(int i1, int i2) {
		double result = (i1 * 1.0) / i2;
		return result;
	}

	public static boolean testImpartireIntreIntregi() {
		int x;
		int y;
		double expectedResult;
		double currentResult;
		boolean isTestsOK = true;
		// test1
		x = 1;
		y = 2;
		expectedResult = 0.5;
		currentResult = ImpartireIntreIntregi(x, y);
		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d / %d ; Expected:%f ; Current:%f\n", x, y, expectedResult, currentResult);
		}

		// test2
		x = 2;
		y = 2;
		expectedResult = 1.0000;
		currentResult = ImpartireIntreIntregi(x, y);

		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d / %d ; Expected:%f ; Current:%f\n", x, y, expectedResult, currentResult);
		}

		// test3
		x = 2;
		y = 0;
		expectedResult = Double.POSITIVE_INFINITY;
		currentResult = ImpartireIntreIntregi(x, y);

		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d / %d ; Expected:%f ; Current:%f\n", x, y, expectedResult, currentResult);
		}
		return isTestsOK;
	}

	// un numar este par? prin impartire modulo
	public static boolean isPar(int n) {
		int result;
		result = n % 2;
		if (result == 0) {
			return true;
		} else {
			return false;
		}
	}

	// un numar este impar? prin negatia rezultatului functiei isPar
	public static boolean isImpar(int n) {
		boolean result = !isPar(n);
		return result;
	}

	// un numar este par? prin function isMultiple
	public static boolean isPar2(int n) {
		boolean result;
		result = isMultiplu(n, 2);
		return result;
	}

	public static boolean testIsPar() {
		int x;
		boolean expectedResult;
		boolean currentResult;
		boolean isTestsOK = true;
		// test1
		x = 1;
		expectedResult = false;
		currentResult = isPar(x);
		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d; Expected:%b ; Current:%b\n", x, expectedResult, currentResult);
		}
		currentResult = isPar2(x);
		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d; Expected:%b ; Current:%b\n", x, expectedResult, currentResult);
		}

		// test2
		x = 2;
		expectedResult = true;
		currentResult = isPar(x);
		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d; Expected:%b ; Current:%b\n", x, expectedResult, currentResult);
		}
		currentResult = isPar2(x);
		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d; Expected:%b ; Current:%b\n", x, expectedResult, currentResult);
		}

		return isTestsOK;
	}

	// este un numar multiplul altui numar?

	public static boolean isMultiplu(int x, int y) {

		if (y == 0) {
			return (x == 0);
		} else {
			return (x % y == 0);
		}
	}

	public static boolean testIsMultiple() {
		int x;
		int y;
		boolean expectedResult;
		boolean currentResult;
		boolean isTestsOK = true;
		// test1
		x = 11;
		y = 3;
		expectedResult = false;
		currentResult = isMultiplu(x, y);
		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d %d; Expected:%b ; Current:%b\n", x, y, expectedResult, currentResult);
		}

		// test2
		x = 12;
		y = 3;
		expectedResult = true;
		currentResult = isMultiplu(x, y);
		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d %d; Expected:%b ; Current:%b\n", x, y, expectedResult, currentResult);
		}
		// test3
		x = 0;
		y = 0;
		expectedResult = true;
		currentResult = isMultiplu(x, y);
		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d %d; Expected:%b ; Current:%b\n", x, y, expectedResult, currentResult);
		}

		// test4
		x = 1;
		y = 0;
		expectedResult = false;
		currentResult = isMultiplu(x, y);
		if (currentResult != expectedResult) {
			isTestsOK = false;
			System.out.format("OP:%d %d; Expected:%b ; Current:%b\n", x, y, expectedResult, currentResult);
		}

		return isTestsOK;
	}

	// constrieste un string cu toti multiplii de n <= max, prin functia
	// isMUltiplu;
	public static String multipliiMax(int n, int max) {
		String result = "";
		String separateur = "";
		for (int i = n; i <= max; i++) {
			if (isMultiplu(i, n)) {
				result = result + separateur + i;
				separateur = ";";
			}
		}
		return result;

	}

	// constrieste un string cu toti multiplii de n <= max, prin adaugarea lui n
	// la el insusi;
	public static String multipliiMax2(int n, int max) {
		String result = "";
		String separateur = "";
		for (int i = n; i <= max; i = i + n) {
			result = result + separateur + i;
			separateur = ";";
		}
		return result;

	}

	public static String multipliiMax3(int n, int max) {
		String result = "";
		String separateur = "";
		int multiplu = n;
		for (int i = 1; multiplu <= max; i++) {
			multiplu = i * n;
			if (multiplu <= max) {
				result = result + separateur + multiplu;
				separateur = ";";
			}
		}
		return result;

	}

	public static boolean testMultipliiMax() {
		int n;
		int max;
		String expectedResult;
		String currentResult;
		boolean isTestsOK = true;
		// test1
		n = 3;
		max = 9;
		expectedResult = "3;6;9";
		currentResult = multipliiMax3(n, max);
		if (!currentResult.equals(expectedResult)) {
			isTestsOK = false;
			System.out.format("OP:%d %d; Expected '%s' ; Current:'%s'\n", n, max, expectedResult, currentResult);
		}
		// test2
		n = 2;
		max = 11;
		expectedResult = "2;4;6;8;10";
		currentResult = multipliiMax3(n, max);
		if (!currentResult.equals(expectedResult)) {
			isTestsOK = false;
			System.out.format("OP:%d %d; Expected '%s' ; Current:'%s'\n", n, max, expectedResult, currentResult);
		}
		// test2
		n = 64;
		max = 3;
		expectedResult = "";
		currentResult = multipliiMax3(n, max);
		if (!currentResult.equals(expectedResult)) {
			isTestsOK = false;
			System.out.format("OP:%d %d; Expected '%s' ; Current:'%s'\n", n, max, expectedResult, currentResult);
		}
		return isTestsOK;

	}

	// remplir un tableau d'entiers, de 1 à un numéro donné (en ordre
	// croissante/decroissante):
	public static int[] fillArray(int lungime, boolean isCrescator) {

		int[] tab = new int[lungime];
		for (int i = 0; i < lungime; i++) {
			if (isCrescator) {
				tab[i] = i + 1;
			} else {
				tab[i] = lungime - i;
			}
		}
		return tab;

	}

	public static boolean testFillArray() {
		boolean isTestsOk = true;

		// test1
		int lungimeTablou = 5;
		int[] currentResult = fillArray(lungimeTablou, true);
		int[] expectedResult = { 1, 2, 3, 4, 5 };
		if (currentResult.length != expectedResult.length) {
			isTestsOk = false;
			System.out.println("Lengths not equals");
		}
		for (int i = 0; i < currentResult.length; i++) {
			if (expectedResult[i] != currentResult[i]) {
				isTestsOk = false;
				System.out.println("Elements not equals");
			}
		}

		// test2
		lungimeTablou = 6;
		currentResult = fillArray(lungimeTablou, true);
		int[] expectedResult2 = { 1, 2, 3, 4, 5, 6 };
		if (currentResult.length != expectedResult2.length) {
			isTestsOk = false;
			System.out.println("Lengths not equals");
		}
		for (int i = 0; i < currentResult.length; i++) {
			if (expectedResult2[i] != currentResult[i]) {
				isTestsOk = false;
				System.out.println("Elements not equals");
			}
		}

		// test3
		lungimeTablou = 6;
		currentResult = fillArray(lungimeTablou, false);
		int[] expectedResult3 = { 6, 5, 4, 3, 2, 1 };
		if (currentResult.length != expectedResult3.length) {
			isTestsOk = false;
			System.out.println("Lengths not equals");
		}
		for (int i = 0; i < currentResult.length; i++) {
			if (expectedResult3[i] != currentResult[i]) {
				isTestsOk = false;
				System.out.println("Elements not equals");
			}
		}
		return isTestsOk;

	}

	// functie ce intoarce un string differit in functie de val unui param de
	// intrare

	public static String sayHello(int messageSelector, String nume) {
		String messageFormat;

		if (messageSelector == 1) {
			messageFormat = "Buna dimineata %s";
		} else if (messageSelector == 2) {
			messageFormat = "%s! Buna ziua!";
		} else if (messageSelector == 3) {
			messageFormat = "Buna seara %s";
		} else {
			messageFormat = "Pa";
		}
		return String.format(messageFormat, nume);
	}

	public static boolean testSayHello() {

		String expected;
		String current;
		boolean isTestsOK = true;
		int messageSelector;
		String nume;

		// test1
		nume = "Anca";
		messageSelector = 1;
		current = sayHello(messageSelector, nume);
		expected = "Buna dimineata Anca";

		if (!current.equals(expected)) {
			isTestsOK = false;
			System.out.format("Expected : '%s' / Current : '%s' \n", expected, current);
		}

		// test2
		nume = "Cata";
		messageSelector = 2;
		current = sayHello(messageSelector, nume);
		expected = "Cata! Buna ziua!";

		if (!current.equals(expected)) {
			isTestsOK = false;
			System.out.format("Expected : '%s' / Current : '%s' \n", expected, current);
		}

		// test3
		nume = "Anca";
		messageSelector = 3;
		current = sayHello(messageSelector, nume);
		expected = "Buna seara Anca";

		if (!current.equals(expected)) {
			isTestsOK = false;
			System.out.format("Expected : '%s' / Current : '%s' \n", expected, current);
		}

		// test4
		nume = "Toto";
		messageSelector = 55;
		current = sayHello(messageSelector, nume);
		expected = "Pa";

		if (!current.equals(expected)) {
			isTestsOK = false;
			System.out.format("Expected : '%s' / Current : '%s' \n", expected, current);
		}

		return isTestsOK;
	}

	public static String[] split(char sep, String s) {
		String[] result;
		int compteur = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == sep) {
				compteur++;
			}
		}
		int nobmreFragments = compteur + 1;
		result = new String[nobmreFragments];

		String mot;
		int start = 0;
		int positionLibre = 0;
		for (int i = 0; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) == sep) {
				int positionSeparateur = i;
				mot = s.substring(start, positionSeparateur);
				result[positionLibre] = mot;
				positionLibre++;
				start = positionSeparateur + 1;

			}
		}
		return result;
	}

	public static boolean testSplit() {

		boolean isTestsOK = true;
		String s;
		String[] expected;
		String[] current;
		char sep = '/';

		// test1
		s = "Anca/face/prostii";
		expected = new String[3];
		expected[0] = "Anca";
		expected[1] = "face";
		expected[2] = "prostii";

		current = split(sep, s);

		if (!stringArrayEquals(expected, current)) {
			isTestsOK = false;
			printStringArray(current);
			printStringArray(expected);
		}

		// test2
		s = "Anca/nu stie/";
		expected = new String[3];
		expected[0] = "Anca";
		expected[1] = "nu stie";
		expected[2] = "";
		
		current = split(sep, s);

		if (!stringArrayEquals(expected, current)) {
			isTestsOK = false;
			printStringArray(current);
			printStringArray(expected);
		}

		return isTestsOK;
	}

	public static boolean stringArrayEquals(String[] t1, String[] t2) {
		boolean isArrayEquals = true;
		if (t1.length == t2.length) {
			for (int i = 0; i < t1.length; i++) {
				if (!t1[i].equals(t2[i])) {
					isArrayEquals = false;
					break;
				}

			}
		} else {
			isArrayEquals = false;
		}
		return isArrayEquals;
	}

	public static void printStringArray(String[] tab) {
		System.out.print("{");
		String sep = "";
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");

	}

}
