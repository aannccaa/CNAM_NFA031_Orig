/*
a) Ecrire un programme qui demande à un utilisateur de donner N caractères qui sont soit des chiffres, soit des lettres, 
N étant un entier fourni par l'utilisateur au début de l'exécution du programme. 
Ces caractères seront stockés dans un tableau 'tab'. 
b) Ecrire un code qui permet de compter le nombre nc de chiffres contenus dans ce tableau.
c) Soit nl le nombre de lettres contenues dans le tableau 'tab'. 
Ecrire un code pour recopier les données contenues dans 'tab' dans un tableau 'tabbis' selon la règle suivante: 
si nc ≥ nl, recopier les chiffres de 'tab' au début du tableau 'tabbis', et recopier les lettres dans la partie restante de 'tabbis' ; 
si nc < nl, ce sont les lettres qui devront être recopiées au début de 'tabbis', et les chiffres dans la partie restante.
Exemple: si 'tab' contient les caractères suivants: 
A, 1, 2, R, Y, 6, F, 9, 8, 7 , le tableau 'tabbis' devra contenir: 
1, 2, 6, 9, 8, 7, A, R, Y, F.

N.B: vous pouvez utiliser la méthode: Character.isDigit, qui prend en argument un caractère et
retourne ‘true’ si le caractère est un nombre et ‘false’ dans le cas contraire, 
ainsi que la méthode: Character.isLetter, qui joue le même rôle pour les lettres. 
 */

public class NFA031_Devoir2_2_cata {
	public static int LETTRE = 1;
	public static int CHIFFRE = 2;
	public static int EXCLAMATION = 3;
	public static int PUNCTUATION = 4;

	public static void main(String[] args) {
		int nombreCharacteres;
		int nombreLettres;
		int nombreChiffres;
		int nombreExclamation;
		int nombrePunctuation;
		char charIntroduit;
		String tableau;

		System.out.print("Donner le nombre de characteres : ");
		nombreCharacteres = Lire.i();

		char[] tab = remplirTableauCharacteres(nombreCharacteres);
		tableau = convertTableauEnString(tab);
		System.out.print("Le tableau de characteres est : ");

		System.out.println(tableau);

		nombreChiffres = calculerNombreChiffres(tab);
		nombreLettres = calculerNombreLettres(tab);
		nombreExclamation = calculerNombreExclamation(tab);
		nombrePunctuation = calculerNombrePunctuation(tab);
		System.out.println("Nb de chiffres : " + nombreChiffres);
		System.out.println("Nb de lettres : " + nombreLettres);
		System.out.println("Nb de exclamations : " + nombreExclamation);
		System.out.println("Nb de punctuations : " + nombrePunctuation);

	}

	// fonction pour remplir le tableau de characteres:
	public static char[] remplirTableauCharacteres(int nombreCharacteres) {
		char[] tableauCharacteres = new char[nombreCharacteres];
		for (int i = 0; i < tableauCharacteres.length; i++) {
			System.out.print("Donner un charactere (lettre ou chiffre) : ");
			char characterIntroduit = Lire.c();
			tableauCharacteres[i] = characterIntroduit;
		}
		return tableauCharacteres;
	}

	// fonction pour convertir le tableau de characteres en string:
	public static String convertTableauEnString(char[] tableau) {
		String result = "{";

		String separateur = "";
		for (int i = 0; i < tableau.length; i++) {
			result = result + separateur + tableau[i];
			separateur = ";";
		}
		result = result + "}";

		return result;
	}

	// fonction pour evaluer si un character est un chiffre
	// retourne vrai si c est chiffre sinon faux;
	public static boolean estChiffre(char c) {
		return Character.isDigit(c);
		// variante
		// return (c >= '0' && c <= '9');
	}

	// fonction pour evaluer si un character est une lettre
	public static boolean estLettre(char c) {
		return Character.isLetter(c);

	}

	// fonction pour calculer le nombre de chiffres contenus dans le tableau
	public static int calculerNombreChiffres(char[] tab) {
		int nombreChiffres = 0;

		for (int i = 0; i < tab.length; i++) {
			if (estChiffre(tab[i])) {
				nombreChiffres = nombreChiffres + 1;
			}
		}
		return nombreChiffres;
	}

	// fonction pour calculer le nombre de lettres contenues dans le tableau
	public static int calculerNombreLettres(char[] tab) {
		return calculerNombreParType(tab, LETTRE);
		/*
		 * int nombreLettres = 0;
		 * 
		 * for (int i = 0; i < tab.length; i++) { if (estLettre(tab[i])) {
		 * nombreLettres = nombreLettres + 1; } } return nombreLettres;
		 */ }

	public static int calculerNombreExclamation(char[] tab) {
		return calculerNombreParType(tab, EXCLAMATION);
	}
	
	public static int calculerNombrePunctuation(char[] tab) {
		return calculerNombreParType(tab, PUNCTUATION);
	}
	

	public static int calculerNombreParType(char[] tab, int type) {
		int nombreParType = 0;

		for (int i = 0; i < tab.length; i++) {
			if (characterEstDeTpe(tab[i], type)) {
				nombreParType = nombreParType + 1;
			}
		}
		return nombreParType;
	}

	public static boolean characterEstDeTpe(char c, int type) {
		if (type == LETTRE) {
			return estLettre(c);
		} else if (type == CHIFFRE) {
			return estChiffre(c);
		} else if (type == EXCLAMATION) {
			return c == '!';
		} else 
			if (type == PUNCTUATION) {
				return ((c == ';') || (c == '.'));
			} else 
		{// type inconnu
			return false;// cas impossible
		}
	}

}
