/*
On souhaite utiliser un programme pour enregistrer les résultats d’une élection. 
Ces résultats donneront le nombre de voix obtenu par candidat et par bureau de vote. 
Les candidats sont Riri, Fifi et Loulou. Il y a 5 bureaux de vote.
a) Définissez la ou les variables nécessaires pour contenir ces données ainsi que le code
nécessaire pour enregistrer au clavier les données sur le vote.
b) Ecrivez une méthode qui calcule le pourcentage d’un candidat donné. Cette méthode ne
doit rien afficher.
c) Utilisez cette méthode pour faire afficher le pourcentage des votes obtenus par chacun des
candidats.
d) Affichez le nom du vainqueur.
 */
public class NFA031_recap4 {

	public static void main(String[] args) {
		int nbBureaux = 2;
		int nbCandidats = 3;

		int[][] tab = { { 1, 2, 3 }, { 2, 6, 1 } };
		// int[][] tab = rentrerResultats(nbBureaux, nbCandidats);

		// afficher le nombre de votes dans chaque bureau de vote, par candidat
		afficherVotes(tab);

		// afficher le % de chaque candidat
		double[] resultats = calcPercent(tab);
		afficherPourcentages(resultats);

		// afficher le vainqueur
		int indexVainqueur = trouverIndexValMax(resultats);
		afficherLeGagnant(indexVainqueur);

		// afficher les resultats en % par candidat et bureau
	}

	// introduire les votes dans un tableau à 2 dimensions
	public static int[][] rentrerResultats(int nbBureaux, int nbCandidats) {
		// première dimension les bureaux de vote
		int[][] tab = new int[nbBureaux][nbCandidats];

		// sur chaque ligne representant un bureau de vote, enregistrer le votes
		// de chaque candidat
		for (int bureau = 0; bureau < nbBureaux; bureau++) {
			for (int candidat = 0; candidat < nbCandidats; candidat++) {
				System.out.format("Pour le bureau n° %d, donner le nombre de votes pour le candidat n° %d:",
						(bureau + 1), (candidat + 1));
				tab[bureau][candidat] = Lire.i();
			}
		}
		return tab;
	}

	public static double[] calcPercent(int votes[][]) {
		int nbBureaux = votes.length;
		int nbCandidats = votes[0].length;

		// calculer la somme de voix par candidat pour toutes les bureaux de
		// vote
		int[] totalVoixParCandidat = new int[nbCandidats];
		for (int candidat = 0; candidat < nbCandidats; candidat++) {
			int sommeVoix = 0;
			for (int bureau = 0; bureau < nbBureaux; bureau++) {
				sommeVoix = sommeVoix + votes[bureau][candidat];
			}
			totalVoixParCandidat[candidat] = sommeVoix;
		}

		return calculerResultatsPercent(totalVoixParCandidat);
	}

	private static double[] calculerResultatsPercent(int[] voixParCandidat) {
		int nbCandidats = voixParCandidat.length;
		// calculer le nombre total de voix
		int totalVoix = 0;
		for (int candidat = 0; candidat < nbCandidats; candidat++) {
			totalVoix = totalVoix + voixParCandidat[candidat];
		}

		// calculer le % voix de chaque candidat (= nombre voix candidat / total
		// voix)
		double[] resultats = new double[nbCandidats];
		for (int candidat = 0; candidat < nbCandidats; candidat++) {
			double procentVoix = voixParCandidat[candidat] * 100.0 / totalVoix;
			resultats[candidat] = procentVoix;
		}

		return resultats;
	}

	public static void afficherVotes(int[][] tab) {

		System.out.println("Les votes des candidats { Riri ; Fifi ; Loulou }, par bureau, sont : ");

		for (int i = 0; i < tab.length; i++) {
			String separateur = "";
			System.out.print("bureau " + (i + 1) + " { ");
			for (int j = 0; j < tab[0].length; j++) {
				System.out.print(separateur + tab[i][j]);
				separateur = " ; ";
			}
			System.out.print(" }\n");

		}

	}

	public static void afficherPourcentages(double[] tab) {

		System.out.println("Les % des votes des candidats { Riri; Fifi: Loulou } sont : ");
		String separateur = "";
		System.out.print("{ ");
		for (int i = 0; i < tab.length; i++) {
			System.out.format("%s%.2f", separateur, tab[i]);
			separateur = " ; ";
		}
		System.out.print(" }\n");

	}

	public static int trouverIndexValMax(double[] tab) {
		int indexValMax = -1;
		double max = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
				indexValMax = i;
			}
		}
		return indexValMax;
	}

	private static void afficherLeGagnant(int indexVainqueur) {
		String choixGagnant;
		

		// variante1 avec switch / case
		if (indexVainqueur == 0) {
			choixGagnant = "Riri";
		} else if (indexVainqueur == 1) {
			choixGagnant = "Fifi";
		} else {
			choixGagnant = "Loulou";
		}
		
		switch (choixGagnant) {
		case ("Riri"): {
			System.out.println("Riri a gagné");

		}
			break;
		case ("Fifi"): {
			System.out.println("Fifi a gagné");

		}
			break;
		case ("Loulou"): {
			System.out.println("Loulou a gagné");

		}
			break;
		}

		// variante2, avec if than else
		System.out.format("Le candidat %d a gagné\n", (indexVainqueur + 1));
		if (indexVainqueur == 0) {
			System.out.println("Riri a gagné");
		} else if (indexVainqueur == 1) {
			System.out.println("Fifi a gagné");
		} else {
			System.out.println("Loulou a gagné");
		}
	}
}
