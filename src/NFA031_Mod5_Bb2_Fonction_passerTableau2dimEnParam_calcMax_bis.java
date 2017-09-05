/*
Ecrivons par exemple une fonction qui retourne la plus grande valeur d’un tableau
d’entiers comportant 3 lignes et 4 colonnes
 */
public class NFA031_Mod5_Bb2_Fonction_passerTableau2dimEnParam_calcMax_bis {

	public static void main(String[] args) {
		int[][] tab = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		
		afficherTab2D(tab);
		int max = max(tab);
		System.out.println("Max: " + max);
	}

	public static int max(int[][] tab) {
		int max = Integer.MIN_VALUE;
		int nbLignes = tab.length;
		int nbCol = tab[0].length;
		for (int i = 0; i < nbLignes; i++) {
			for (int j = 0; j < nbCol; j++) {
				if (tab[i][j] > max) {
					max = tab[i][j];
				}
			}
		}
		return max;
	}

	public static void afficherTab2D(int[][] tab) {
		String sep;
		int nbLignes = tab.length;
		int nbCol = tab[0].length;
		for (int i = 0; i < nbLignes; i++) {
			sep = "";
			System.out.print("{");
			for (int j = 0; j < nbCol; j++) {
				System.out.print(sep + tab[i][j]);
				sep = ";";
			}
			System.out.println("}");
		}
	}
}
