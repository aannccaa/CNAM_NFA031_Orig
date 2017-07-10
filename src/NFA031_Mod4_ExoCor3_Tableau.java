/*
a) Ecrire un code pour remplir un tableau d’entiers de 3 lignes et 4 colonnes.
On convient de démarrer l’indexation des lignes et des colonnes à l’indice 0.
b) Ecrire un code pour calculer la valeur minimale des entiers contenus 
dans une ligne dont l’indice est fourni par l’utilisateur.
c) Ecrire un code pour calculer la valeur maximale des entiers contenus 
dans une colonne dont l’indice est fourni par l’utilisateur.
 */
public class NFA031_Mod4_ExoCor3_Tableau {

	public static void main(String[] args) {
		int minLigne; // = Integer.MAX_VALUE;
		int maxCol; // = Integer.MIN_VALUE;
		int nbLignes = 2;
		int nbCol = 2;
		int tab[][] = new int[nbLignes][nbCol];

		for (int i = 0; i < nbLignes; i++) {
			for (int j = 0; j < nbCol; j++) {
				System.out.print(
						"Donner un entier pour le croissement de la ligne " + i + " et de la colonne " + j + " : ");
				tab[i][j] = Lire.i();
			}
		}

		// imprimer le tableau:
		System.out.println("Le tableau introduit est : ");

		for (int i = 0; i < nbLignes; i++) {
			String separateur = "";
			for (int j = 0; j < nbCol; j++) {
				System.out.format("%s%3d", separateur, tab[i][j]);
				separateur = " | ";
			}
			System.out.println();
		}

		// Trouver le min de la ligne indexLigne
		System.out.print("Donner l'indice de la ligne pour laquelle vous voulez calculer le minimum des valeurs :");
		int indexLigne = Lire.i();
		minLigne = tab[indexLigne][0]; 
		for (int j = 0; j < nbCol; j++) {
			if (tab[indexLigne][j] < minLigne) {
				minLigne = tab[indexLigne][j];
			}
		}
		System.out.println("Val min de la ligne d'indice " + indexLigne + " est " + minLigne);

		// Trouver le max de la colonne indexCol
		
		System.out.print("Donner l'indice de la colonne pour laquelle vous voulez calculer le maximum des valeurs :");
		int indexCol = Lire.i();
		maxCol = tab[0][indexCol];
		for (int i = 0; i < nbLignes; i++) {
			if (tab[i][indexCol] > maxCol) {
				maxCol = tab[i][indexCol];
			}
		}
		System.out.println("Val max de la colonne d'indice " + indexCol + " est " + maxCol);
	}
}