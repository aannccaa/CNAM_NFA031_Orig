/*
a) Ecrire un code pour remplir un tableau d’entiers de 4 lignes et 5 colonnes. 
On convient de démarrer l’indexation des lignes et des colonnes à l’indice 0.
b) Ecrire un code pour trier par ordre croissant les entiers contenus dans une ligne dont
l’indice est fourni par l’utilisateur.
c) Ecrire un code pour trier par ordre décroissant les entiers contenus dans une colonne dont
l’indice est fourni par l’utilisateur .

Indication : afin de ne pas modifier les données du tableau initial, 
il faut effectuer les tris sur des copies des données.
 */

public class NFA031_Mod4_ExoProp3_Tableau {

	public static void main(String[] args) {
		int nbLignes = 4;
		int nbCol = 5;
		int tab[][] = new int[nbLignes][nbCol];
		// creer un vecteur pour la ligne à trier:
		int tabLigne[] = new int[nbCol];
		// creer un vecteur pour la col à trier:
		int tabCol[] = new int[nbLignes];

		int indiceLigne = 2;
		int indiceCol = 4;

		// test
		//int tab[][] = { { 3, 2, 5, 7, 0 }, { 1, 4, 3, 2, 8 }, { 3, 2, 5, 1, 9 }, { 1, 4, 3, 2, 6 } };

		// introduire valeurs tableau
		for (int i = 0; i < nbLignes; i++) {
			for (int j = 0; j < nbCol; j++) {
				System.out.print("Donner un nombre entier pour le croissement de la ligne " + i + " et de la colonne "
						+ j + " : ");
				tab[i][j] = Lire.i();
			}
		}

		// print tableau introduit:
		System.out.println("La matrice est: ");
		for (int i = 0; i < nbLignes; i++) {
			for (int j = 0; j < nbCol; j++) {
				System.out.print(tab[i][j]);
				System.out.print(" , ");
			}
			System.out.println();
		}

		System.out.print("Donner l'indice de la ligne que vous voulez trier en ordre croissante : ");
		indiceLigne = Lire.i();
		// remplir le vecteur correspondant a l'indiceLigne
		for (int j = 0; j < nbCol; j++) {
			tabLigne[j] = tab[indiceLigne][j];
		}

		// ordonner croissant le vecteur pour indiceLigne
		for (int i = 0; i < nbCol - 1; i++) {
			for (int j = i + 1; j < nbCol; j++) {
				if (tabLigne[i] > tabLigne[j]) {
					int temp = tabLigne[i];
					tabLigne[i] = tabLigne[j];
					tabLigne[j] = temp;
				}
			}

		}

		// afficher le vecteur trié pour indiceLigne
		System.out.println("Voici la ligne d'indice " + indiceLigne + " triée en ordre croissante:");
		for (int i = 0; i <= nbCol - 1; i++) {
			System.out.print(tabLigne[i] + " ");
		}
		System.out.println();

		// remplir le vecteur correspondant a l'indiceCol
		System.out.print("Donner l'indice de la col que vous voulez trier en ordre décroissante : ");
		indiceCol = Lire.i();
		for (int i = 0; i < nbLignes; i++) {
			tabCol[i] = tab[i][indiceCol];
		}

		// ordonner décroissant le vecteur pour l'indiceCol
		for (int i = 0; i < nbLignes - 1; i++) {
			for (int j = i + 1; j < nbLignes; j++) {
				if (tabCol[i] < tabCol[j]) {
					int temp = tabCol[i];
					tabCol[i] = tabCol[j];
					tabCol[j] = temp;
				}
			}
		}

		// afficher le vecteur trié pour indiceCol
		System.out.println("Voici la colonne d'indice " + indiceCol + " triée en ordre decroissante:");
		for (int i = 0; i < nbLignes; i++) {
			System.out.println(tabCol[i] + " ");
		}
		System.out.println();

	}

}
