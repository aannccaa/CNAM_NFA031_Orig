/*
L'organisateur d'un tournoi de lancer de javelot veut créer un programme pour archiver les résultats de ce tournoi. 
Chaque sportif effectue 3 lancers. 
Le programme devra stocker les résultats de N sportifs, N étant un nombre fourni par l'utilisateur du programme. 
a) Ecrire un code qui permet de stocker les résultats des 3 lancers de chacun des N sportifs dans un tableau à deux dimensions. 
Un sportif sera identifié par un numéro de dossard compris entre 0 et N-1.
b) Compléter le code pour qu'il calcule et affiche la moyenne des 3 lancers de chaque sportif. 
c) Compléter le code pour qu'il calcule la valeur M la plus grande des moyennes obtenues par ces sportifs 
et affiche le ou les numéros des sportifs ayant atteint cette valeur M.  

*/

public class NFA031_Devoir3 {
	public static void main(String[] args) {
		int nombreSportifs = 2;
		int nombreLancers = 3;

		// fournir le nombre de sportifs
		System.out.print("Donner le nombre de sportifs :");
		nombreSportifs = Lire.i();

		// stoquer le resultat des lancers pour tous les sportifs
		double[][] tableauResultats = stoquerResultats(nombreSportifs, nombreLancers);

		// afficher le tableau introduit
		String tableauResultatsConvertit = convertirTableauEnString(tableauResultats);
		System.out.println("Les valeurs introduites pour les lancers par sportif sont : ");
		System.out.println(tableauResultatsConvertit);

		double[] moyenneSportifs = calculerMoyenneSportif(tableauResultats);
		System.out.println("Moyennes des sportifs : " + convertirTableauEnString(moyenneSportifs));

		// afficher le maximum des moyennes
		double maxMoyennes = maxElements(moyenneSportifs);
		System.out.format("Le max des moyennes est : %.2f \n", maxMoyennes);

		// afficher la liste des sportifs ayant atteint le max des moyennes
		int[] sportifsAtteignantMax = indicesPourValeur(moyenneSportifs, maxMoyennes);
		System.out.println(
				"La liste des sportifs ayant la moyenne maximale: " + convertirTableauEnString(sportifsAtteignantMax));

	}

	//
	public static int[] indicesPourValeur(double[] tab, double valeur) {
		// determiner le nombre n des elements egaux avec la valeur
		int n = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == valeur) {

				n = n + 1;

			}
		}

		// creer le tableau resultat
		int[] indices = new int[n];

		// parcourir le tableau des valeurs pour remplir le tableau des indices
		int positionLibre = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == valeur) {
				indices[positionLibre] = i;
				positionLibre++;
			}
		}

		return indices;
	}

	// stoquer le resultat des lancers pour tous les sportifs
	public static double[][] stoquerResultats(int nbSportifs, int nbLancers) {
		double[][] tab = new double[nbSportifs][nbLancers];
		for (int i = 0; i < nbSportifs; i++) {
			for (int j = 0; j < nbLancers; j++) {
				System.out.print("Pour le Sportif n° " + i + " donner le résultat n° " + j + " : ");
				tab[i][j] = Lire.d();

			}

		}
		return tab;

	}

	// calculer la moyenne des lancers de tous les sportifs
	public static double[] calculerMoyenneSportif(double[][] tab) {
		int nombreSportifs = tab.length;
		// creer un tableau pour stoquer les moyennes des lancers de tous les
		// sportifs
		double[] tabMoyennes = new double[nombreSportifs];

		// pour chaque sportif:
		for (int i = 0; i < nombreSportifs; i++) {
			double[] lancersSportifCourrant = tab[i];
			// calculer la somme les lancers
			double sommeLancersParSportif = sommeElements(lancersSportifCourrant);
			// calculer la moyenne des lancers = somme des lancers / nb lancers
			double nombreLancersSportifCourrant = lancersSportifCourrant.length;
			double moyenneParSportif = sommeLancersParSportif / nombreLancersSportifCourrant;

			// stoquer la moyenne dans le tableau
			tabMoyennes[i] = moyenneParSportif;
		}
		// retourner le tableau des moyennes
		return tabMoyennes;
	}

	// calculer le maximum des élements d'un tableau
	public static double maxElements(double[] tab) {
		double max = Double.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}

	// calculer la somme des elements d'un tableau
	public static double sommeElements(double[] tab) {
		double somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme = somme + tab[i];
		}
		return somme;
	}

	// convertir le tableau 2 dimensions dans un string
	public static String convertirTableauEnString(double[][] tab) {
		String result = "";
		String separateur;
		for (int i = 0; i < tab.length; i++) {
			separateur = "";
			result = result + "{";
			for (int j = 0; j < tab[0].length; j++) {
				result = result + separateur + tab[i][j];
				separateur = ";";
			}

			result = result + "}\n";
		}
		return result;
	}

	// convertir le tableau de doubles 1 dimension dans un string
	public static String convertirTableauEnString(double[] tab) {
		String result = "{";
		String separateur = "";
		for (int i = 0; i < tab.length; i++) {

			result = result + separateur + tab[i];
			separateur = ";";
		}
		return result + "}";
	}

	// convertir le tableau de integers 1 dimension dans un string
	public static String convertirTableauEnString(int[] tab) {
		String result = "{";
		String separateur = "";
		for (int i = 0; i < tab.length; i++) {

			result = result + separateur + tab[i];
			separateur = ";";
		}
		return result + "}";
	}

}
