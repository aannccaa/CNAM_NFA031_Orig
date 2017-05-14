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

public class NFA031_Mod4_ExoProp1_Tableau_cata {

	public static void main(String[] args) {
		int nbElemTries = 3;
		int nbElemTableau = nbElemTries + 1;
		int valAInserer;

		int tab[] = {1, 3, 5, 1000};//new int[nbElemTableau];
		
		// introduire les valeurs triés en ordre croissante:
		System.out.println("Introduire " + nbElemTries + " entiers en ordre croissante: ");
		for (int i = 0; i < nbElemTries; i++) {
			System.out.print("Introduire le numéro " + i + " : ");
			tab[i] = Lire.i();
		}
		// introduire un entier au hazard :
		System.out.print("Donner un entier au hazard : ");
		valAInserer = Lire.i();
		
		//valAInserer = 2;
		int indicePlaceLibre = nbElemTableau -1;
		for (int indiceElementAComparer=nbElemTries-1; indiceElementAComparer>=0; indiceElementAComparer--) {
			int elementAComparer = tab[indiceElementAComparer];
			if (valAInserer <= elementAComparer) {
				tab[indicePlaceLibre] = elementAComparer;
				indicePlaceLibre = indicePlaceLibre - 1;
				tab[indicePlaceLibre] = valAInserer;
			} else {
				break;
			}
		}
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println();
	}

}
