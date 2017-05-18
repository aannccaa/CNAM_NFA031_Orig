import java.security.InvalidParameterException;

/*
Ecrivons par exemple une fonction qui retourne la plus grande valeur d’un tableau
d’entiers comportant 3 lignes et 4 colonnes
 */
public class NFA031_Mod5_Bb2_Fonction_passerTableau2dimEnParam_calcMax {

	public static void main(String[] args) {
		String msg = "";
		int a = lireEntierStrictementPositif(msg);
		System.out.println(a);
		msg = "Donnez le nombre des lignes";
		int nbLignes = lireEntierStrictementPositif(msg);
		int nbCol = lireEntierStrictementPositif("Donnez le nombre des colonnes");
		int maxEntiersTableau;

		int tab[][] = lireTableau(nbLignes, nbCol);

		maxEntiersTableau = calculerMaxEntiersTableau(tab);
		System.out.println("Le max des valeurs du tableau est : " + maxEntiersTableau);
	}
	

	public static int lireEntierStrictementPositif(String message) {
		int nombreIntroduit;
		if(message == "" || message == null){
			message = "Donnez un numéro entier strictement positif";
		}
		do {
			System.out.print(message +" : ");
			nombreIntroduit = Lire.i();
			if (nombreIntroduit <= 0) {
				System.out.println("Le numéro " + nombreIntroduit + " n'est pas strictement positif. ");
			}
			
		} while (nombreIntroduit <= 0);
		return nombreIntroduit;
	}
	
	public static int[][] lireTableau(int x, int y) {

		int[][] tab = new int[x][y];

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print("Donner la valeur au croissement ligne " + i + " colonne " + j + " : ");
				tab[i][j] = Lire.i();
			}
		}
		return tab;
	}

	public static int calculerMaxEntiersTableau(int tableau[][]) {
		int maxValTableau = Integer.MIN_VALUE;
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[i].length; j++) {
				if (i == 0 && j == 0) {
					maxValTableau = tableau[i][j];
				} else {
					if (tableau[i][j] > maxValTableau) {
						maxValTableau = tableau[i][j];
					}
				}
			}
		}
		return maxValTableau;
	}

}
