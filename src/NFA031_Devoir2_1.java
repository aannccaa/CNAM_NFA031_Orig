/*
Exercice 1:
a) Ecrire un programme qui demande à un utilisateur de donner 10 nombres entiers strictement positifs. 
Ces nombres seront stockés dans un tableau 'tab' . 
b) Ecrire le code qui permet de calculer et d'afficher la moyenne m des nombres de ce tableau .
c)  Les entiers du tableau peuvent être répartis en deux catégories . 
La catégorie C1 des entiers dont la valeur est strictement inférieure à m 
et la catégorie C2 des entiers dont la valeur est supérieure ou égale à m . 
Ecrire un code pour calculer et afficher la plus grande valeur des entiers de la catégorie C1 .
 */

public class NFA031_Devoir2_1 {

	public static void main(String[] args) {
		int nombresEntiers = 3;
		int nombreIntroduit;
		int tab[] = new int[nombresEntiers];
		double moyenneNombresEntiers;
		int sommeNombresIntroduits = 0;
		int maxC1;

		// alimenter le tableau:
		for (int i = 0; i < tab.length; i++) {
			// accepter uniquement des entiers positifs
			boolean estPositif;
			do {
				System.out.print("Donner l'entier strictement positif numéro " + i + " : ");
				nombreIntroduit = Lire.i();

				estPositif = nombreIntroduit > 0;
				if (!estPositif) {
					System.out.println(nombreIntroduit + " n'est pas strictement positif.");
				}

				if (nombreIntroduit > 0) {
					estPositif = true;
				} else {
					estPositif = false;
					System.out.println(nombreIntroduit + " n'est pas strictement positif.");
				}
			} while (estPositif == false);

			sommeNombresIntroduits = sommeNombresIntroduits + nombreIntroduit;
			tab[i] = nombreIntroduit;
		}

		// afficher le tableau:
		System.out.print("Le tableau des valeurs introduites est :\n[");
		String separateur = "";
		for (int i = 0; i < nombresEntiers; i++) {
			System.out.print(separateur + tab[i]);
			separateur = ", ";
		}
		System.out.println("]");

		// calcul de la moyenne des entiers du tableau
		// (multiplication avec 1.0 pour forcer à obtenir un double au lieu d'un
		// entier)
		moyenneNombresEntiers = sommeNombresIntroduits * 1.0 / nombresEntiers;
		System.out.format("La moyenne des entiers du tableau est %.2f : \n", moyenneNombresEntiers);

		// calcul val max des numéros < moyenneNombresEntiers
		// initialisation de maxC1 avec une valeur minimale qu'on ne peut pas
		// retrouver dans le tableau d'entiers positifs
		maxC1 = -1;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] < moyenneNombresEntiers) { // on evalue si tab[i] fait
													// partie de la
													// catégorie C1 ...
				if (tab[i] > maxC1) {
					maxC1 = tab[i];
				}
			}
		}
		if (maxC1 == -1) {
			System.out.println("=> Pas de valeur maximale pour C1, car tous les valeurs sont dans la catégorie C2");
		} else {
			System.out.println("=> La valeur max des entiers de catégorie C1 est : " + maxC1);
		}
	}

}
