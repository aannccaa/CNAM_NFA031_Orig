/*
 Le responsable du parking d'une entreprise veut créer un programme pour
archiver les codes d'accès au parking qu'il délivre aux salariés .
Un code d'accès est composé de deux lettres majuscules , suivies de 9 chiffres et
est terminé par une lettre majuscule .
a) Rédiger une méthode pour vérifier qu'un code est , ou non , au bon format .
b) Ecrire un code pour enregistrer dix codes dans un tableau 'Tab' , avec vérification
du format de chaque code .
c) Le responsable décide d'ajouter une clé à chaque code d'accès , constituée de la
somme des chiffres du code modulo 11 . Compléter le programme pour qu'il rajoute
à la fin de chaque code d'accès sa clé et pour que les codes d'accès ainsi complétés
soient stockés dans un tableau 'Tabbis' .
Remarque : pour obtenir la valeur numérique d'un caractère c représentant un chiffre , vous
pouvez utiliser la syntaxe : Character.getNumericValue(c) .
 */

public class NFA031_Exam1_2017_Ex5 {

	//public static String FORMAT = "XX000000000X";
	public static String FORMAT = "XX00X";
	public static String MSG_FORMAT = "2 majuscules, 9 chiffres, 1 majuscule";

	public static void main(String[] args) {
		int nbCodes = 2;
		String[] tab = creerTab(nbCodes);
		String[] tabbis = creerTabbis(tab);

		System.out.print("Voici tab : ");
		afficherTab(tab);

		System.out.print("Voici tabbis : ");
		afficherTab(tabbis);
	}

	// introduire le code
	public static String introduireCode() {
		String code;
		boolean isCodeOK;

		do {
			System.out.print("Donner un code composé de " + MSG_FORMAT + "  : ");
			code = Lire.S();
			isCodeOK = verifierCode(code);
			if (!isCodeOK) {
				System.out.println("Code incorrect !");
			}
		} while (!isCodeOK);

		return code;
	}

	public static String introduireCodeClef() {
		String code;
		boolean isCodeOK;

		do {
			System.out.print("Donner un code " + MSG_FORMAT + "  : ");
			code = Lire.S();

			isCodeOK = verifierCode(code);
			if (!isCodeOK) {
				System.out.println("Code incorrect !");
			}
		} while (!isCodeOK);

		return code;
	}

	// a) vérifier code
	public static boolean verifierCode(String code) {
		int formatLen = FORMAT.length();
		if (code.length() != formatLen) {
			return false;
		}
		for (int i = 0; i < formatLen; i++) {
			char current = code.charAt(i);
			char currentFormat = FORMAT.charAt(i);
			switch (currentFormat) {
			case 'X':
				if (!Character.isAlphabetic(current) || !Character.isUpperCase(current)) {
					return false;
				}
				break;
			case '0':
				if (!Character.isDigit(current)) {
					return false;
				}
				break;
			default:
				System.out.println("Invalid format");
				return false;
			}
		}
		return true;
	}

	public static boolean verifierCode2(String code) {
		boolean isCodeOK = false;
		char c;
		if ((code.length() == 5) && (code.equals(code.toUpperCase()))) {
			isCodeOK = true;
		}
		if (isCodeOK) {
			for (int i = 0; i < 2; i++) {
				c = code.charAt(i);
				isCodeOK = isCodeOK && Character.isLetter(c);
			}
		}

		if (isCodeOK) {
			for (int i = 2; i < 11; i++) {
				c = code.charAt(i);
				isCodeOK = isCodeOK && Character.isDigit(c);
			}
		}
		if (isCodeOK) {
			for (int i = 11; i < 12; i++) {
				c = code.charAt(i);
				isCodeOK = isCodeOK && Character.isLetter(c);
			}
		}

		return isCodeOK;

	}

	// b) creer tab
	public static String[] creerTab(int nbCodes) {
		String[] tab = new String[nbCodes];

		for (int i = 0; i < nbCodes; i++) {
			tab[i] = introduireCode();
		}
		return tab;
	}

	// afficher tab
	public static void afficherTab(String[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = "; ";
		}
		System.out.println("}");
	}

	// calculer clef
	public static int calculerClef(String code) {
		int sommeChiffresCode = 0;
		int clef;
		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);
			if (Character.isDigit(c)) {
				sommeChiffresCode = sommeChiffresCode + Character.getNumericValue(c);
			}
		}
		clef = sommeChiffresCode % 11;
		return clef;
	}

	// c) créer tabbis
	public static String[] creerTabbis(String[] tab) {

		String[] tabbis = new String[tab.length];

		for (int i = 0; i < tabbis.length; i++) {
			tabbis[i] = tab[i] + calculerClef(tab[i]);
		}

		return tabbis;
	}

}
