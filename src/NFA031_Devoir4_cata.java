/*
Un libraire veut créer un programme pour archiver des données sur les livres qu'il vend. 
Ces données sont: le titre du livre, le nom de l'auteur et l'éditeur.
Pour chaque livre, les données le concernant seront enregistrées sous forme d'une chaîne de caractères 
avec le format suivant: Nom du livre/AUTEUR/EDITEUR*.
a) Rédiger un code pour enregistrer les données de N livres, N étant un nombre fourni par l'utilisateur. 
On suppose que l'utilisateur remplit convenablement les données.
b) Compléter le code pour qu'il affiche les livres publiés par un éditeur donné, lorsque l'utilisateur indique un nom d'éditeur. 
Le code devra être rédigé de façon telle que l'utilisateur puisse effectuer autant de demandes qu'il le souhaite.
*/

public class NFA031_Devoir4_cata {
	public static void main(String[] args) {
		boolean testEnDur = false;
		String[] tab = enregistrerLivres(testEnDur);

		// imprimer le tableau des enregistrements
		imprimerEnregistrements(tab);

		// parcourir chaque string infoLivre, pour chercher si l'éditeur existe
		// s'il existe, extraire les livres

		String editeurARechercher;

		// demander l'éditeur dans une boucle et retourner ses livres, jusqu'à
		// ce que l'utilisateur décide d'arrêter
		do {
			System.out.print("Donner un editeur pour retourner ses livres (ou terminer avec *) : ");
			editeurARechercher = Lire.S();

			chercherParEditeur(tab, editeurARechercher);

			// repéter jusqu'à ce que l'utilisateur décide d'arrêter
		} while (!editeurARechercher.equals("*"));

	}

	// en mode test le tableau est initialisé avec des donnés en dur
	private static String[] enregistrerLivres(boolean modeTest) {
		if (modeTest) {
			String[] tab = { "n/a/e", "n2/a2/e2", "n3/a3/e" };
			return tab;
		} else {
			String nomLivre;
			String auteur;
			String editeur;
			int nombreLivres;
			String infoLivre;

			// demander le nombre de livres à archiver
			System.out.print("Donner le nombre de livres à archiver : ");
			nombreLivres = Lire.i();
			String[] tab = new String[nombreLivres];

			// pour chaque livre, demander:
			// Nom du livre
			// AUTEUR
			// EDITEUR
			for (int i = 0; i < tab.length; i++) {
				System.out.print("Donner le Nom du livre numéro " + i + " : ");
				nomLivre = Lire.S();
				System.out.print("Donner l'Auteur du livre numéro " + i + " : ");
				auteur = Lire.S();
				System.out.print("Donner l'Editeur du livre numéro " + i + " : ");
				editeur = Lire.S();

				// pour chaque livre stocker dans un tableau les informations en
				// format string
				// "Nom du livre/AUTEUR/EDITEUR"
				infoLivre = nomLivre + "/" + auteur + "/" + editeur;
				tab[i] = infoLivre;
			}
			return tab;
		}
	}

	private static void imprimerEnregistrements(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print("{");
			System.out.print(tab[i]);
			System.out.print("} \n");

		}
	}

	private static void chercherParEditeur(String[] tab, String editeurARechercher) {
		String editeurCourrant;
		String livreCourrant;
		String auteurCourrant;
		String nomLivreCourrant;
		for (int i = 0; i < tab.length; i++) {
			livreCourrant = tab[i];
			String[] fragments = fragmenter('/', livreCourrant);

			// l'editeur se trouve sur position 2 dans le tableau fragments
			editeurCourrant = fragments[2];

			// vérifier si l'éditeur recherché est égal à l'éditeur enregistré
			if (editeurARechercher.equals(editeurCourrant)) {
				auteurCourrant = fragments[1];
				nomLivreCourrant = fragments[0];
				System.out.println("Livre :" + nomLivreCourrant + "; Auteur : " + auteurCourrant);
			}
		}
	}

	public static String[] fragmenter(char sep, String s) {
		String[] result;
		int compteur = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == sep) {
				compteur++;
			}
		}
		int nobmreFragments = compteur + 1;
		result = new String[nobmreFragments];

		String mot;
		int start = 0;
		int positionLibre = 0;
		for (int i = 0; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) == sep) {
				int positionSeparateur = i;
				mot = s.substring(start, positionSeparateur);
				result[positionLibre] = mot;
				positionLibre++;
				start = positionSeparateur + 1;

			}
		}
		return result;
	}
}