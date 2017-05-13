/*
Dans une course de motos, on demande au candidat de r�aliser une s�rie de tests jusqu�� ce
qu�il obtienne 10 essais  diff�rents. Les 10 essais, dont le temps est exprim� en secondes, 
seront stock�s dans un tableau. A chaque saisie d�un temps, on examine s�il a �t� d�j�
r�alis�; si tel est le cas, le candidat est invit� � refaire un essai; 
sinon, le temps est homologu� et stock� dans le tableau.
D�terminer ensuite le temps moyen des essais du candidat et son record.
*/

public class NFA031_Mod4_ExoCor2_Tableau {
	public static void main(String[] args) {
		int nbEssaisDifferents = 4;
		double tempsMoyenEssais;
		double tempsTotalEssais = 0;
		double minTempsEssai = Integer.MAX_VALUE;
		double tab[] = new double[nbEssaisDifferents];
		double tempsEssai;
		int compteur = 0;

		// citesc $nbEssaisDifferents eseuri valide
		for (int i = 0; i < nbEssaisDifferents; i++) {

			boolean essaiHommologue;
			do {
				// citesc un eseu
				System.out.print("Donner le temps en secondes pour l'essai n� " + (i + 1) + " : ");
				tempsEssai = Lire.d();
				// presupun ca e valid pana la proba contrarie
				if (tempsEssai <= 0) {
					essaiHommologue = false;
					continue; // saute � la fin de la boucle, execute
								// directement la condition while
				}

				essaiHommologue = true;
				for (int j = 0; j < i; j++) {
					if (tempsEssai == tab[j]) {// proba contrarie, eseu
												// invalid
						essaiHommologue = false;
						compteur = compteur + 1;
						System.out.println("Essai non hommologu�, car identique � l'essai n� " + (j + 1) + ". ");
						// ma opresc din cautare, am decis ca eseul este invalid
						break; // arr�te la boucle courrante, for (j... , saute
								// pour executer directement la condition while
					}
				}

			} while (!essaiHommologue);// repet citirea eseurilor panca cand
										// eseul este valid

			// aici eseul este validat, il memorez
			tab[i] = tempsEssai;
		}

		// tiparesc eseurile
		String separateur = "";
		System.out.print("Les essais hommologu�s sont : [ ");
		for (int i = 0; i < nbEssaisDifferents; i++) {
			System.out.print(separateur + tab[i]);
			separateur = ", ";
		}
		System.out.println("]");
		System.out.println("Nombre des essais non hommologu�s = " + compteur);

		// calcul du temps record (minTempsEssai) et calcul temps total:
		for (int i = 0; i < nbEssaisDifferents; i++) {
			if (tab[i] < minTempsEssai) {
				minTempsEssai = tab[i];
			}
			// temps total
			tempsTotalEssais = tempsTotalEssais + tab[i];

		}
		System.out.println("Temps reccord des essais hommologu�s est de " + minTempsEssai + " secondes. ");

		// calcul du temps moyen (tempsMoyenEssais):
		tempsMoyenEssais = tempsTotalEssais / nbEssaisDifferents;
		System.out.println("Temps moyen des essais hommologu�s est de " + tempsMoyenEssais + " secondes. ");
	}
}