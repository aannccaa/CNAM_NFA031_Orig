/*
a) Ecrire un programme qui demande à l’utilisateur une série de N nombres entiers
strictement positifs et qui les stocke dans un tableau.
b) Calculer la valeur maximale atteinte par les nombres du tableau.
c) Ajouter à votre programme la détermination du nombre d’entiers qui sont égaux à
cette valeur maximale, ainsi que la détermination des indices auxquels ils sont situés.
d) Ajouter à votre programme le calcul de la moyenne des nombres du tableau.
*/

public class NFA031_Mod4_ExoCor1_Tableau {
	public static void main(String[] args) {
		int nbEntiers;
		int valMax = Integer.MIN_VALUE; 
		int nbEntiersEgauxValMax = 0; 
		int sommeNbEntiers = 0;
		double moyenneNbEntiers;
		String separateur;

		System.out.print("Donner le nombre des entiers > 0 que vous voulez stoquer dans un tableau :");
		nbEntiers = Lire.i();
		int tab[] = new int[nbEntiers];
		for (int i = 0; i < nbEntiers; i++) {
			System.out.print("Donner l'entier n° " + (i + 1) + " : ");
			tab[i] = Lire.i();
			sommeNbEntiers = sommeNbEntiers + tab[i];

			if (tab[i] > valMax) {
				valMax = tab[i];
				nbEntiersEgauxValMax = 1;
			} else {
				if (tab[i] == valMax) {
					nbEntiersEgauxValMax = nbEntiersEgauxValMax + 1;
				}
			}

		}
		System.out.println("La valeur max. des entiers du tableau est " + valMax);

		System.out.print("Las liste des indices(commencent avec 0) sur leques les val max. sont situés : [ ");

		separateur = "";
		// optionnel écrire les indices des val max. dans un tableau
		int tabIndices[] = new int[nbEntiersEgauxValMax];
		int premierePositionLibreDansLeTabIndices = 0;
		for (int i = 0; i < nbEntiers; i++) {
			if (tab[i] == valMax) {
				// optionnel: sauvegarde des indices dans le tableau tabIndices
				tabIndices[premierePositionLibreDansLeTabIndices] = i;
				premierePositionLibreDansLeTabIndices = premierePositionLibreDansLeTabIndices + 1;
				// écrire les indices
				System.out.print(separateur + i);
				// Premiere fois le séparateur est vide, les prochaines fois ", "
				separateur = ", ";
			}
		}

		System.out.println(" ]");

		for (int i = 0; i < nbEntiers; i++) {
			if (tab[i] == valMax) {
			}
		}

		//

		System.out.println("Le nb d'entiers ayant la val max = " + valMax + " est " + nbEntiersEgauxValMax);
		moyenneNbEntiers = sommeNbEntiers*1.0 / nbEntiers;

		System.out.format("La moyenne des entiers du tableau = %.2f \n", moyenneNbEntiers);

	}

}