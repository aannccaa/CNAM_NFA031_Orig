/*
Dans une course de motos, on demande au candidat de réaliser une série de tests jusqu’à ce
qu’il obtienne 10 essais  différents. Les 10 essais, dont le temps est exprimé en secondes, 
seront stockés dans un tableau. A chaque saisie d’un temps, on examine s’il a été déjà
réalisé; si tel est le cas, le candidat est invité à refaire un essai; 
sinon, le temps est homologué et stocké dans le tableau.
Déterminer ensuite le temps moyen des essais du candidat et son record.
*/

public class NFA031_Mod4_ExoCor2_Tableau_bis {
	public static void main(String[] args) {
		int nbEssais = 3;

		double[] essais = stoquerEssais(nbEssais);
		afficherTab1D(essais);

		double moyenneTempsEssais = moyenne(essais);
		System.out.println("Moyenne : " + moyenneTempsEssais);

		double reccordTempsEssais = min(essais);
		System.out.format("Temps reccord: %.2f \n", reccordTempsEssais);

	}

	public static double[] stoquerEssais(int nbEssais) {
		double[] tab = new double[nbEssais];
		boolean essaiHommologue = true;
		double temps;

		for (int i = 0; i < tab.length; i++) {
			do {
				System.out.print("Donner le temps pour essai n° " + i + " : ");
				temps = Lire.d();
				essaiHommologue = true;
				for (int j = 0; j < i; j++) {
					if (temps == tab[j]) {
						essaiHommologue = false;
						System.out.println("Non homologué car identique avec l'essai " + j);
						break;
					}

				}
			} while (!essaiHommologue);
			tab[i] = temps;
		}

		return tab;
	}

	public static void afficherTab1D(double[] tab) {
		System.out.print("{");
		String sep = "";
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = "; ";
		}
		System.out.println("}");

	}

	public static double moyenne(double[] tab) {
		double moyenne;
		double somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme = somme + tab[i];
		}
		moyenne = somme * 1.0 / tab.length;
		return moyenne;

	}

	public static double min(double[] tab) {
		double min = Double.MAX_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] <= min) {
				min = tab[i];
			}
		}
		return min;
	}
}