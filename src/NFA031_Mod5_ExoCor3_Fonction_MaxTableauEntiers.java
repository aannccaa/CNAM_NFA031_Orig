/*
Ecrire une fonction qui retourne l’élément maximum d’un tableau 
de 20 entiers reçu en entrée.
 */
public class NFA031_Mod5_ExoCor3_Fonction_MaxTableauEntiers {

	public static void main(String[] args) {
		int nbEntiers = 3;
		int[] tab = remplirTableau(nbEntiers);
		int maxTableau = calculerMaxEntiersTableau(tab);
		System.out
				.println("La valeur maximale des entiers du tableau de " + nbEntiers + " élements est : " + maxTableau);

	}

	// fonction pour remplir un tableau avec des entiers
	public static int[] remplirTableau(int longueurTableau) {
		int[] tableau = new int[longueurTableau];
		for (int i = 0; i < tableau.length; i++) {
			System.out.print("Donner un nombre entier pour l'élément du tableau d'indice " + i + " : ");
			tableau[i] = Lire.i();
		}
		return tableau;
	}

	// fonction pour calculer le max des valeurs entiers du tableau
	public static int calculerMaxEntiersTableau(int[] tableau) {
		int maxEntiersTableau = Integer.MIN_VALUE;
		for (int i = 0; i < tableau.length - 1; i++) {
				if (tableau[i] > maxEntiersTableau) {
					maxEntiersTableau = tableau[i];
				}
		}
		return maxEntiersTableau;
	}

}
