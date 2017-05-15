/*
a) Ecrire un code pour remplir un tableau d’entiers de 4 lignes et 5 colonnes. 
On convient de démarrer l’indexation des lignes et des colonnes à l’indice 0.
b) Ecrire un code pour trier par ordre croissant les entiers contenus dans une ligne dont
l’indice est fourni par l’utilisateur.
c) Ecrire un code pour trier par ordre décroissant les entiers contenus dans une colonne dont
l’indice est fourni par l’utilisateur .

Indication : afin de ne pas modifier les données du tableau initial, il faut effectuer les tris sur
des copies des données.
 */

public class NFA031_Mod4_ExoProp3_Tableau {

	public static void main(String[] args) {
		int nbLignes = 2;
		int nbCol = 2;
		
		int indiceLigne;
		int indiceCol;
		//int tab[][] = new int[nbLignes][nbCol];
		int tab[][] = {
				{3,2,5,7,0},
				{1,4,3,2,8},
				{3,2,5,1,9},
				{1,4,3,2,6},
		};

/*
		//introduire valeurs tableau
		for (int i = 0; i < nbLignes; i++) {
			for (int j = 0; j < nbCol; j++) {
				System.out.print("Donner un nombre entier pour le croissement de la ligne " + i + " et de la colonne "
						+ j + " : ");
				tab[i][j] = Lire.i();
			}
		}
		
		// print tableau introduit
		System.out.println("La matrice est: ");
		for (int i = 0; i < nbLignes; i++) {
			for (int j = 0; j < nbCol; j++) {
				System.out.print(tab[i][j]);
				System.out.print(" , ");
			}
			System.out.println();
		}
*/
		
			System.out.print("Donner l'indice de la ligne que vous voulez trier en ordre croissante : ");
			indiceLigne = Lire.i();
		
			System.out.print("Donner l'indice de la col que vous voulez trier en ordre décroissante : ");
			indiceCol = Lire.i();

	}

}
