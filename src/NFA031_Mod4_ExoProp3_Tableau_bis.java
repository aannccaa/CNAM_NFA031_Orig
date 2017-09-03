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

public class NFA031_Mod4_ExoProp3_Tableau_bis {

	public static void main(String[] args) {
		int nbLignes = 2;
		int nbCol = 3;

		// a)
		int[][] tab = creerTab(nbLignes, nbCol);
		System.out.println("Tab introduit : ");
		afficherTab2D(tab);
		
		//b)
		int[][] tabCopie = copyTab(tab);
		System.out.println("Tab copié : ");
		afficherTab2D(tabCopie);
		
		int[] ligneOrdreAsc = ordonnerLigne(tabCopie);
		System.out.println("Ligne ordonné asc : ");
		afficherTab1D(ligneOrdreAsc);
		
		//c)
		
		int[][] tabCopie2 = copyTab(tab);
		System.out.println("Tab copié : ");
		afficherTab2D(tabCopie2);
		
		int[] colOrdreDesc = ordonnerCol(tabCopie2);
		System.out.println("Colonne ordonné desc : ");
		afficherTab1D(colOrdreDesc);

	}

	public static int[][] creerTab(int nbLignes, int nbCol) {
		int[][] tab = new int[nbLignes][nbCol];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print("Donner la valeur pour la ligne '" + i + "' et colonne '" + j + "' : ");
				tab[i][j] = Lire.i();
			}
		}
		return tab;
	}

	public static void afficherTab2D(int[][] tab) {
		String sep;
		for (int i = 0; i < tab.length; i++) {
			sep = "";
			System.out.print("{");

			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(sep + tab[i][j]);
				sep = "; ";
			}
			System.out.println("}");
		}
	}

	public static void afficherTab1D(int[] tab) {
		String sep = "";
		
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = "; ";
		}
		System.out.println("}");
	}
	
	public static int[][] copyTab(int[][] tab) {
		int[][] tabCopie = new int[tab.length][tab[0].length];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tabCopie[i][j] = tab[i][j];
			}
		}
		return tabCopie;
	}
	
	public static int[] ordonnerLigne(int[][] tab){
		System.out.print("Donner le numéro d'une ligne :");
		int numLigne = Lire.i();
		int min = Integer.MAX_VALUE;
		int[] ligne = new int[numLigne];
		for(int i=0; i<ligne.length; i++) {
			if (ligne[i]<min) {
				min = ligne[i];
			}
		}
		
		return ligne;
	}
	
	public static int[] ordonnerCol(int[][] tab){
		System.out.print("Donner le numéro d'une col. :");
		int numCol = Lire.i();
		int max = Integer.MIN_VALUE;
		int[] col = new int[numCol];
		for(int j=0; j<col.length; j++) {
			if (col[j]>max) {
				max = col[j];
			}
		}
		
		return col;
	}
}
