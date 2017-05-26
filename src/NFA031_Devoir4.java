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

public class NFA031_Devoir4 {
	public static void main(String[] args) {
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
		
		// parcourir chaque string infoLivre, pour chercher si l'éditeur existe
		// s'il existe, extraire les livres
		
		
		String stop="";
		do {
		// demander l'éditeur dans une boucle, jusqu'à ce que l'utilisateur décide d'arrêter
		System.out.print("Donner un editeur pour retourner ses livres : (terminer avec *");
		editeur = Lire.S();
		
		// retourner les livres d'un éditeur
		for (int i=0; i<tab.length; i++) {
			String editeurARechercher = tab[i];
			// trouver l'indice du premier separateur "/"
			if (tab[i] == "/") {
				int indiceSeparateurInf = i;
				//trouver l'indice du deuxième separateur "/"
				for (int j=indiceSeparateurInf; i<tab.length; i++) {
					if (tab[i] == "/") {
						int indiceSeparateurSup = j;
						String editeurCourrant = tab[i].substring(indiceSeparateurInf, indiceSeparateurSup);
					}
				}
			}
			
			// vérifier si le string recherché est égal au string contenu entre les 2 separateurs "/.../" (correspond à l'éditeur)
			if (editeurARechercher.equals(editeurCourrant)) {
				
			// extraire le string entre l' indice 0 et indice du premier "/"  (correspond au nom du livre)
			
			// stoquer le nom du livre dans un tableau tabEditeur
			}
			}
		
		// repéter jusqu'à ce que l'utilisateur décide d'arrêter
		} while (stop != "*");
		
	}

	// public static String[][] remplirTableau (int nombreLivres)
}