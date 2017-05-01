/*
Exercice 2
On souhaite déterminer le prix moyen, le prix le plus cher et le prix le moins cher d’un
ensemble de produits rangés dans un rayon de magasin. A priori, on ne connaît pas le nombre
de produits.
Ecrire l’algorithme qui demandera les données nécessaires et affichera le prix moyen, le prix
le moins cher et le prix le plus cher.
 */

public class NFA031_Mod3_ExoCor2_PrixMoyenMinMax_DO_WHILE {
	public static void main(String[] args) {
		int nbProduits = 1;
		double prix, prixMoyen = 0, prixMin = 0, prixMax = 0, sommePrix = 0;
		char choix;

		do {
			System.out.print("Donner le prix du produit n° " + nbProduits + " : ");
			prix = Lire.d();
			sommePrix = prix + sommePrix;
			prixMoyen = sommePrix / nbProduits;
			if (nbProduits == 1) {
				prixMax = prix;
				prixMin = prix;
			}
			if (prix >= prixMax) {
				prixMax = prix;
			}
			if (prix <= prixMin) {
				prixMin = prix;
			}
			System.out.print("Voulez-vous rentrer le prix d'un autre produit (O/N)? ");
			choix = Character.toUpperCase(Lire.c());
			if (choix == 'O') {
				nbProduits = nbProduits + 1;
			}
		} while (choix == 'O');

		prixMoyen = sommePrix / nbProduits;
		System.out.println("prixMoyen = " + prixMoyen);
		System.out.println("prixMin = " + prixMin);
		System.out.println("prixMax = " + prixMax);

		System.out.println("FIN DU PROGRAMME");

	}

}
