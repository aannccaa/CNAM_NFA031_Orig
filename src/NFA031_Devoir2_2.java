/*
Exercice 2.
a) Ecrire un programme qui demande à un utilisateur de donner N caractères, qui sont soit des chiffres, soit des lettres, 
N étant un entier fourni par l'utilisateur au début de l'exécution du programme. 
Ces caractères seront stockés dans un tableau 'tab'. 

b) Ecrire un code qui permet de compter le nombre nc de chiffres contenus dans ce tableau.

c) Soit nl le nombre de lettres contenues dans le tableau 'tab'. 
Ecrire un code pour recopier les données contenues dans 'tab' dans un tableau 'tabbis' selon la règle suivante: 
si nc ≥ nl, recopier les chiffres de 'tab' au début du tableau 'tabbis', et recopier les lettres dans la partie restante de 'tabbis'; 
si nc < nl, ce sont les lettres qui devront être recopiées au début de 'tabbis', et les chiffres dans la partie restante.
Exemple : si 'tab' contient les caractères suivants : 
A, 1, 2, R, Y, 6, F, 9, 8, 7 , le tableau 'tabbis' devra contenir : 
1, 2, 6, 9, 8, 7, A, R, Y, F.

N.B : vous pouvez utiliser la méthode : Character.isDigit, qui prend en argument un caractère 
et retourne ‘true’ si le caractère est un nombre et ‘false’ dans le cas contraire, 
ainsi que la méthode : Character.isLetter, qui joue le même rôle pour les lettres. 
 */

public class NFA031_Devoir2_2 {

	public static void main(String[] args) {
		int nombreCharacteres;
		int nombreLettres;
		char charIntroduit;

		System.out.print("Donner le nombre de charactères : ");
		nombreCharacteres = Lire.i();
		char[] tab = new char[nombreCharacteres];

		
		remplirTableauCharacteres(char[] tab);
		String imprim = afficherTableau(char[] tab);
		System.out.print(imprim);


	}

	// fonction pour remplir le tableau de characteres:
	public static char[] remplirTableauCharacteres(char charIntroduit) {
		for (int i = 0; i < tableauCharacteres.length; i++) {
			System.out.print("Donner un charactere (lettre ou chiffre) : ");
			char characterIntroduit = Lire.c();
			tableauCharacteres[i] = characterIntroduit;
		}
		return tableauCharacteres;
	}

	// fonction pour afficher le tableau de characteres:
	public static void afficherTableau(char[] tableau) {
		System.out.print("Le tableau de characteres est : {");
		String separateur = "";
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(separateur + tableau[i]);
			separateur = ";";
		}
		System.out.print("}");
	}

	// fonction pour calculer le nombre de chiffres contenus dans le tableau
	public static int calculerNombreChiffres(int nombreCharacteres) {
		int nombreChiffres = 0;

		return nombreChiffres;
	}

}
