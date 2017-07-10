/*
a) Ecrire un algorithme qui demande en entrée un tableau trié dont on gardera une place libre
à la fin du tableau. L’algorithme demandera ensuite une valeur et le rangera dans le tableau en
respectant l’ordre croissant des éléments.
Exemple :
{12 15 16 18 20}
Valeur à insérer : 17
{12 15 16 17 18 20}

b) Vérifiez votre solution à l’aide d’un tableau d’évolution des variables .
 */

public class NFA031_Mod4_ExoProp1_Tableau {

	public static void main(String[] args) {
		int nbValCroissantes = 3;
		int nbElemTableau = nbValCroissantes + 1;
		int tab[] = new int[nbElemTableau];
		String separateur;
		int temp = -1;
		int dernierNb;

		// introduire un nombre des entiers croissants donnés par l'utilsateur
		// dans un tableau:
		System.out.println("Donner " + nbValCroissantes + " numéros entiers en ordre croissante. ");

		for (int i = 0; i < nbValCroissantes; i++) {
			System.out.print("Donner le numéro " + i + " : ");
			tab[i] = Lire.i();
		}

		//
		System.out.print("Donner un autre numéro entier au hazard : ");
		dernierNb = Lire.i();
		tab[nbElemTableau - 1] = dernierNb;

		// tri croissant valeurs du tableau, tenant compte que les premiers
		// valeurs "nbValCroissantes" sont déjà ordonnées:
		int n = nbElemTableau;
		for (int i=n-1; i>0; i--) {
			if (tab[i] < tab[i-1]) {
				temp = tab[i];
				tab[i] = tab[i-1];
				tab[i-1] = temp;
			}
		}

		
		// print tableau:
		separateur = "";
		System.out.print("Le tableau ordonné en ordre croissante: { ");
		for (int i = 0; i < nbElemTableau; i++) {
			System.out.print(separateur + tab[i]);
			separateur = ", ";
		}
		System.out.print(" }");

		/*
		// tri croissant valeurs du tableau méthode par bulle, marche aussi
		// quand le tableau en entrée n'est pas ordonné :
		for (int i = 0; i < nbElemTableau - 1; i++) {
			for (int j = 0; j < nbElemTableau - 1; j++) {
				if (tab[j] > tab[j + 1]) {
					temp = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = temp;
				}

			}

		}

		// afficher le tableau ordonné ordre croissante:
		separateur = "";
		System.out.print("Le tableau ordonné en ordre croissante méthode bulle: { ");
		for (int i = 0; i < nbElemTableau; i++) {
			System.out.print(separateur + tab[i]);
			separateur = ", ";
		}
		System.out.print(" }");
		*/
	}

}
