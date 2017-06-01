/*
Un libraire veut cr�er un programme pour archiver des donn�es sur les livres qu'il vend. 
Ces donn�es sont: le titre du livre, le nom de l'auteur et l'�diteur.
Pour chaque livre, les donn�es le concernant seront enregistr�es sous forme d'une cha�ne de caract�res 
avec le format suivant: Nom du livre/AUTEUR/EDITEUR*.
a) R�diger un code pour enregistrer les donn�es de N livres, N �tant un nombre fourni par l'utilisateur. 
On suppose que l'utilisateur remplit convenablement les donn�es.
b) Compl�ter le code pour qu'il affiche les livres publi�s par un �diteur donn�, lorsque l'utilisateur indique un nom d'�diteur. 
Le code devra �tre r�dig� de fa�on telle que l'utilisateur puisse effectuer autant de demandes qu'il le souhaite.
*/

public class NFA031_Devoir4 {
	public static void main(String[] args) {

		// stoquer dans un tableau les information des livres ("Nom du livre/AUTEUR/EDITEUR")
		String[] tab = enregistrerLivres();

		// imprimer le tableau des enregistrements de livre
		imprimerEnregistrements(tab);

		// pour un �diteur donn�e, parcourir chaque string infoLivre (Nom du livre/AUTEUR/EDITEUR) pour chercher si l'�diteur existe et 
		// s'il existe, extraire ses livres
		String editeurARechercher;
		// demander l'�diteur dans une boucle et retourner ses livres, jusqu'�
		// ce que l'utilisateur d�cide d'arr�ter
		do {
			System.out.print("Donner un editeur pour retourner ses livres (ou terminer avec *) : ");
			editeurARechercher = Lire.S();

			// parcourir chaque string infoLivre, pour chercher si
			// l'�diteur existe et s'il existe, extraire les livres
			chercherParEditeur(tab, editeurARechercher);

			// rep�ter jusqu'� ce que l'utilisateur d�cide d'arr�ter
		} while (!editeurARechercher.equals("*"));

	}

	// fonction pour stocker dans un tableau les information des livres (en format "Nom du livre/AUTEUR/EDITEUR")
	private static String[] enregistrerLivres() {
		String nomLivre;
		String auteur;
		String editeur;
		int nombreLivres;
		String infoLivre; // chaine de charact�res contenant "Nom du livre/AUTEUR/EDITEUR"

		// demander le nombre de livres � archiver
		System.out.print("Donner le nombre de livres � archiver : ");
		nombreLivres = Lire.i();
		// cr�er et initialiser le tableau des enregistrements
		String[] tab = new String[nombreLivres];

		// pour chaque livre � archiver, demander:
		// Nom du livre
		// AUTEUR
		// EDITEUR
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Donner le Nom du livre num�ro " + i + " : ");
			nomLivre = Lire.S();
			System.out.print("Donner l'Auteur du livre num�ro " + i + " : ");
			auteur = Lire.S();
			System.out.print("Donner l'Editeur du livre num�ro " + i + " : ");
			editeur = Lire.S();

			// pour chaque livre � archiver, stocker dans un tableau les informations en format string
			// "Nom du livre/AUTEUR/EDITEUR"
			infoLivre = nomLivre + "/" + auteur + "/" + editeur;
			tab[i] = infoLivre;
		}
		return tab;
	}

	// fonction pour imprimer le tableau des enregistrements de livre
	private static void imprimerEnregistrements(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print("{");
			System.out.print(tab[i]);
			System.out.print("} \n");

		}
	}

	// fonction pour parcourir chaque string infoLivre, pour chercher si
	// l'�diteur existe et s'il existe, extraire ses livres
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

			// v�rifier si l'�diteur recherch� est �gal � l'�diteur enregistr�
			if (editeurARechercher.equals(editeurCourrant)) {
				auteurCourrant = fragments[1];
				nomLivreCourrant = fragments[0];
				System.out.println("Livre :" + nomLivreCourrant + "; Auteur : " + auteurCourrant);
			}
		}
	}

	// fonction pour fragmenter une cha�ne de charact�res donn�e
	// (par rapport � un s�parateur)
	// et stocker les fragments dans un tableau
	public static String[] fragmenter(char sep, String s) {
		String[] result;
		int compteur = 0;
		// determiner le nombre des s�parateurs dans un string
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == sep) {
				compteur++;
			}
		}
		// determiner le nombre de fragments (= nb. s�parateurs + 1)
		int nobmreFragments = compteur + 1;

		// cr�er et initialiser le tableau des fragments
		result = new String[nobmreFragments];

		// soustraire les mots compris entre les s�parateurs et les stocker dans un tableau
		String mot;
		int start = 0;
		int positionLibre = 0;
		for (int i = 0; i <= s.length(); i++) {
			// si on arrive � la fin du tableau, ou qu'on a trouv� un s�parateur
			if (i == s.length() || s.charAt(i) == sep) {
				int positionSeparateur = i;
				// soustraire le mot par rapport � la d�limitation
				mot = s.substring(start, positionSeparateur);

				// stocker le mot extrait dans un tableau, � la premi�re position libre
				result[positionLibre] = mot;

				positionLibre++;
				start = positionSeparateur + 1;

			}
		}
		return result;
	}
}