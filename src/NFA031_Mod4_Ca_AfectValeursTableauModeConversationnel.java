/*
Rentrer dans un tableau à 2 dimensions les donnes suivantes:
{7,  3,  4}
{2,  8,  9}
Demander à l’utilisateur de rentrer d’abord tous les éléments de la ligne 1 
et ensuite de rentrer tous les éléments de la ligne 2.

 */
public class NFA031_Mod4_Ca_AfectValeursTableauModeConversationnel {

	public static void main(String[] args) {
		int[][] tab = new int[2][3];
		int i; // ligne;
		int j; // colonne;

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Donner la valeur au croisement de la ligne " + i 
						+ " et de la colonne " + j + " :");
				tab[i][j] = Lire.i();
			}
		}
		System.out.println("Le tableau contient : ");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("tab[" + i + "]" + "tab[" + j + "] = " + tab[i][j] + " ");
			}
		System.out.println("");
		}
	}

}