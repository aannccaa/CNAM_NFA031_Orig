/*
Rentrer dans un tableau à 2 dimensions les données suivantes:
{7,  3,  4}
{2,  8,  9}
Demander à l’utilisateur de rentrer d’abord tous les éléments de la ligne 1 
et ensuite de rentrer tous les éléments de la ligne 2.
Faire afficher la somme d'une ligne du tableau.
Faire afficher la somme d'une colonne du tableau.
 */
public class NFA031_Mod4_Cc_SommeValeursLigneColTableau {

	public static void main(String[] args) {
		int[][] tab = new int[2][3];
		int i; // ligne;
		int j; // colonne;

		// Introduire des valeurs entiers dans un tableau (2 lignes, 3 colonnes), fournies par l'utilsateur:
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Donner la valeur au croisement de la ligne " + i + " et de la colonne " + j + " :");
				tab[i][j] = Lire.i();
			}
		}

		// Calculer la somme des entiers du tableau:
		int sommeEntiersTableau = 0;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				sommeEntiersTableau = sommeEntiersTableau + tab[i][j];
			}
		}
		System.out.println("La somme des entiers du tableau est: " + sommeEntiersTableau);

		// Calculer la somme des entiers d'une ligne i demandée par l'utilisateur:
		System.out.print("Donner l'indice de la ligne dont vous souhaitez la somme des valeurs : ");
		i = Lire.i();
		int sommeEntiersLigne = 0;
		for (j = 0; j < 3; j++) {
			sommeEntiersLigne = sommeEntiersLigne + tab[i][j];
		}
		System.out.println("La somme des entiers de la ligne " + i + " = " + sommeEntiersLigne);

		// Calculer la somme des entiers d'une colonne j demandée par
		// l'utilisateur:
		System.out.print("Donner l'indice de la colonne dont vous souhaitez la somme des valeurs : ");
		j = Lire.i();
		int sommeEntiersColonne = 0;
		for (i= 0; i < 2; i++) {
			sommeEntiersColonne = sommeEntiersColonne + tab[i][j];
		}
		System.out.println("La somme des entiers de la colonne " + j + " = " + sommeEntiersColonne);
	}

}
