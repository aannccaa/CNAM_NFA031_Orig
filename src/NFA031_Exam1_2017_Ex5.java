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

	public static void main(String[] args) {

		String code = introduireCode();
		afficherEtatCode(code);

		String[] tab = creerTab(code);

		afficherTab(tab);
	}

	// introduire le code
	public static String introduireCode() {
		String code;
		System.out.print("Donner un code: 2 majuscule, 9 chiffres, 1 majuscule : ");
		code = Lire.S();

		return code;
	}

	public static boolean verifierCode(String code) {
		boolean isCodeOK;

		if ((code.length() == 12) && (code.equals(code.toUpperCase())) && (Character.isLetter(code.charAt(0)))
				&& (Character.isLetter(code.charAt(1))) && (Character.isDigit(code.charAt(2)))
				&& (Character.isDigit(code.charAt(3))) && (Character.isDigit(code.charAt(4)))
				&& (Character.isDigit(code.charAt(5))) && (Character.isDigit(code.charAt(6)))
				&& (Character.isDigit(code.charAt(7))) && (Character.isDigit(code.charAt(8)))
				&& (Character.isDigit(code.charAt(9))) && (Character.isDigit(code.charAt(10)))
				&& (Character.isLetter(code.charAt(11)))) {
			isCodeOK = true;
		} else {
			isCodeOK = false;
		}

		return isCodeOK;
	}

	public static void afficherEtatCode(String code) {
		if (verifierCode(code) == true) {
			System.out.println("Le code introduit est OK");
		} else {
			System.out.println("Le code introduit est NOK");
		}

	}

	// creer tab
	public static String[] creerTab(String code) {
		int nbCodes = 2;
		String[] tab = new String[nbCodes];

		while (verifierCode(code) == true) {
			for (int i = 0; i < nbCodes; i++) {
				tab[i] = code;
			}
		}
		return tab;
	}

	// afficher tab
	public static void afficherTab(String[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < 9; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.print("}");
	}

}
