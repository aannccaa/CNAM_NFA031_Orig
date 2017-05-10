/*
Rentrer dans un tableau à 2 dimensions les donnes suivantes:
{7,  3,  4}
{2,  8,  9}
Demander à l’utilisateur de rentrer d’abord tous les éléments de la ligne 1 
et ensuite de rentrer tous les éléments de la ligne 2.
Faire la somme des entiers du tableau
 */
public class NFA031_Mod4_Cb_SommeValeursTableau {

	public static void main(String[] args) {
		int[][] tab = new int[2][3];
		int i; // ligne;
		int j; // colonne;
		int somme=0;

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Donner la valeur au croisement de la ligne " + i 
						+ " et de la colonne " + j + " :");
				tab[i][j] = Lire.i();
				somme = somme + tab[i][j];
			}		
		}
		System.out.println("La somme des entiers du tableau est: " +somme);
	}

}

