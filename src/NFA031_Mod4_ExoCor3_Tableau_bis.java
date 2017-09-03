/*
a) Ecrire un code pour remplir un tableau d’entiers de 3 lignes et 4 colonnes.
On convient de démarrer l’indexation des lignes et des colonnes à l’indice 0.
b) Ecrire un code pour calculer la valeur minimale des entiers contenus 
dans une ligne dont l’indice est fourni par l’utilisateur.
c) Ecrire un code pour calculer la valeur maximale des entiers contenus 
dans une colonne dont l’indice est fourni par l’utilisateur.
 */
public class NFA031_Mod4_ExoCor3_Tableau_bis {

	public static void main(String[] args) {
		int nbLignes = 2;
		int nbCol = 2;

		int[][] tab = creerTab(nbLignes, nbCol);
		afficherTab2D(tab);
		
		int minLigne = minLigne(tab);
		System.out.println("Le MIN de la ligne est : " + minLigne);
		
		int maxColonne = maxCol(tab);
		System.out.println("Le MAX de la colonne est : " + maxColonne);

	}

	public static int[][] creerTab(int nbLignes, int nbCol) {
		int[][] tab = new int[nbLignes][nbCol];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print("Donner un entier pour la ligne '" + i + "' et la colonne '" + j + "' : ");
				tab[i][j] = Lire.i();
			}
		}
		return tab;
	}

	public static void afficherTab2D(int[][] tab) {
		String sep;
		System.out.println("Le tableau rentré est : ");
		for (int i = 0; i < tab.length; i++) {
			sep = "";
			System.out.print("{");
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(sep + tab[i][j]);
				sep = ";";
			}
			System.out.println("}");
		}

	}
	
	public static int minLigne(int[][] tab) {
		int ligne;
		int minLigne=Integer.MAX_VALUE;
		System.out.print("Donner un numéro de ligne : ");
		ligne = Lire.i();
		for(int col = 0; col<tab[ligne].length; col++) {
			if (tab[ligne][col] < minLigne) {
				minLigne = tab[ligne][col];
			}
		}
		return minLigne;
	}
	
	public static int maxCol(int[][] tab) {
		int col;
		int maxCol = Integer.MIN_VALUE;
		System.out.print("Donner un numéro de colonne : ");
		col = Lire.i();
		for(int ligne = 0; ligne<tab[col].length; ligne++) {
			if (tab[ligne][col] > maxCol) {
				maxCol = tab[ligne][col];
			}
		}
		return maxCol;
	}
}