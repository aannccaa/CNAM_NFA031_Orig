e/* 
 * Exercice 2:
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

public class NFA031_Devoir2_2 {

	public static void main(String[] args) {
		int nombreCharacteres; // nc
		int nombreLettres; // nl
		int nombreChiffres; // N
		String tableau;

		System.out.print("Donner le nombre de characteres: ");
		nombreCharacteres = Lire.i();

		char[] tab = remplirTableauCharacteres(nombreCharacteres);
		tableau = convertTableauEnString(tab);
		System.out.print("Le tableau de characteres introduites est: ");
		System.out.println(tableau);

		nombreChiffres = calculerNombreChiffres(tab);
		nombreLettres = calculerNombreLettres(tab);

		System.out.println("Nombre de chiffres: " + nombreChiffres);
		System.out.println("Nombre de lettres: " + nombreLettres);

		char[] tabbis = creerTabbis(tab, nombreChiffres, nombreLettres);
		System.out.print("Le tableau tabbis est: ");
		System.out.println(convertTableauEnString(tabbis));

	}

	// fonction pour remplir le tableau de characteres:
	public static char[] remplirTableauCharacteres(int nombreCharacteres) {
		char[] tableauCharacteres = new char[nombreCharacteres];
		for (int i = 0; i < tableauCharacteres.length; i++) {
			System.out.print("Donner un charactere (lettre ou chiffre): ");
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
	// retourne vrai si c est chiffre, sinon faux;
	public static boolean estChiffre(char c) {
		return Character.isDigit(c);

		// variante
		// return (c >= '0' && c <= '9');
	}

	// fonction pour evaluer si un character est une lettre
	// retourne vrai si c est lettre, sinon faux;
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
		int nombreLettres = 0;
		for (int i = 0; i < tab.length; i++) {
			if (estLettre(tab[i])) {
				nombreLettres = nombreLettres + 1;
			}
		}
		return nombreLettres;
	}

	// concatenner 2 tableaux, en copiant un a un tous les éléments du tab1,
	// puis du tab2
	public static char[] concatTableaux(char[] tab1, char[] tab2) {
		char[] tab = new char[tab1.length + tab2.length];
		int positionLibreTab = 0;
		for (int i = 0; i < tab1.length; i++) {
			tab[positionLibreTab] = tab1[i];
			positionLibreTab++;
		}
		for (int i = 0; i < tab2.length; i++) {

			tab[positionLibreTab] = tab2[i];
			positionLibreTab++;
		}

		return tab;
	}

	// fonction pour créer le tableau tabbis
	public static char[] creerTabbis(char[] tab, int nombreChiffres, int nombreLettres) {
		// créer un tableau de chiffres
		char[] tabChiffres = new char[nombreChiffres];
		// créer un tableau de lettres
		char[] tabLettres = new char[nombreLettres];
		// parcourir tab et remplir d'un seul passage les 2 tableaux de chiffres
		// et lettres
		int positionLibreTabChiffres = 0;
		int positionLibreTabLettres = 0;
		for (int i = 0; i < tab.length; i++) {
			char temp = tab[i];
			if (estChiffre(temp)) {
				tabChiffres[positionLibreTabChiffres] = temp;
				positionLibreTabChiffres++;
			} else {
				if (estLettre(temp)) {
					tabLettres[positionLibreTabLettres] = temp;
					positionLibreTabLettres++;
				}
			}
		}

		// si nombre de chiffres > nombre de lettres
		char[] tabbis;
		if (nombreChiffres > nombreLettres) {
			// le resultat est la concatenation du tableau de chiffres avec
			// celui de lettres
			tabbis = concatTableaux(tabChiffres, tabLettres);
		} else {
			// le resultat est la concatenation du tableau de lettres avec celui
			// de lettres
			tabbis = concatTableaux(tabLettres, tabChiffres);
		}

		return tabbis;
	}

}
