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
		String nomLivre;
		String auteur;
		String editeur;
		int nombreLivres;
		String infoLivre;

		// demander le nombre de livres � archiver
		System.out.print("Donner le nombre de livres � archiver : ");
		nombreLivres = Lire.i();
		String[] tab = new String[nombreLivres];

		// pour chaque livre, demander:
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

			// pour chaque livre stoquer dans un tableau les informations en
			// format string
			// "Nom du livre/AUTEUR/EDITEUR"
			infoLivre = nomLivre + "/" + auteur + "/" + editeur;
			tab[i] = infoLivre;
		}

		// imprimer le tableau des enregistrements
		for (int i = 0; i < tab.length; i++) {
			System.out.print("{");
			System.out.print(tab[i]);
			System.out.print("} \n");

		}
		
		// parcourir chaque string infoLivre, pour chercher si l'�diteur existe
		// s'il existe, extraire les livres
		
		
		String stop="";
		do {
		// demander l'�diteur dans une boucle, jusqu'� ce que l'utilisateur d�cide d'arr�ter
		System.out.print("Donner un editeur pour retourner ses livres : (terminer avec *");
		editeur = Lire.S();
		
		// retourner les livres d'un �diteur
		for (int i=0; i<tab.length; i++) {
			String editeurARechercher = tab[i];
			// trouver l'indice du premier separateur "/"
			if (tab[i] == "/") {
				int indiceSeparateurInf = i;
				//trouver l'indice du deuxi�me separateur "/"
				for (int j=indiceSeparateurInf; i<tab.length; i++) {
					if (tab[i] == "/") {
						int indiceSeparateurSup = j;
						String editeurCourrant = tab[i].substring(indiceSeparateurInf, indiceSeparateurSup);
					}
				}
			}
			
			// v�rifier si le string recherch� est �gal au string contenu entre les 2 separateurs "/.../" (correspond � l'�diteur)
			if (editeurARechercher.equals(editeurCourrant)) {
				
			// extraire le string entre l' indice 0 et indice du premier "/"  (correspond au nom du livre)
			
			// stoquer le nom du livre dans un tableau tabEditeur
			}
			}
		
		// rep�ter jusqu'� ce que l'utilisateur d�cide d'arr�ter
		} while (stop != "*");
		
	}

	// public static String[][] remplirTableau (int nombreLivres)
}