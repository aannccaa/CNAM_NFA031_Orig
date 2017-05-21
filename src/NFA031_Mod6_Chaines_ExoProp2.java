/*
a) Ecrire un programme qui demande à l’utilisateur 5 noms, chacun suivi du prénom, 
et qui les stocke dans un tableau de chaînes de caractères. 
Un nom suivi d’un prénom sera enregistré dans le tableau sous la forme suivante: 
DURAND Jean 
le caractère qui sépare le nom du prénom est donc le caractère appelé: blanc.

b) On suppose que les noms fournis par l’utilisateur sont tous différents. Compléter le
programme afin qu’il donne le prénom d’une personne dont on fournit le nom, lorsque ce
nom figure dans le tableau du a) .
 */
public class NFA031_Mod6_Chaines_ExoProp2 {

	public static void main(String[] args) {
		int nombreEnregistrements = 2;
		String nom;
		String prenom;
		boolean stop;
		String[] tableauDesNomsEtPrenoms = enregistrerNomPrenomDansTableau(nombreEnregistrements);

		do {
			System.out.print("Donner un nom pour rechercher son prénom (ou * pour terminer): ");
			nom = Lire.S();
			stop = nom.equals("*");
			if (!stop) {
				prenom = trouverPrenom(nom, tableauDesNomsEtPrenoms);
				if (prenom.equals("PRENOM NON TROUVE")) {
					System.out.println("Le nom n'a pas été trouvé");

				} else {
					System.out.println("Le prénom correspondant au nom '" + nom + "' est " + prenom);
				}
			}
		} while (!stop);

	}

	// la fonction remplit avec des noms et prénoms demandés à l'utilisateur,
	// un tableau de longueur égale aux nombre des enregistrements
	// (nombreEnregistrements)
	// les noms sont formatés en majuscules, ainsi que l'initiale du prénom
	// elle retourne ce tableau
	public static String[] enregistrerNomPrenomDansTableau(int nombreEnregistrements) {
		String nom;
		String prenom;
		String[] tab = new String[nombreEnregistrements];
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Pour la personne " + (i + 1) + " : ");
			System.out.print("- donner le Nom (sans espaces):");
			nom = Lire.S();
			nom = nom.toUpperCase();
			System.out.print("- donner le Prénom (sans espaces):");
			prenom = Lire.S();
			prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1, prenom.length()).toLowerCase();

			tab[i] = nom + " " + prenom;
			System.out.println("Nom Prénom enregistrés: " + tab[i]);
		}
		return tab;
	}

	// à partir d'un nom complet écrit sous forme "NOM Prenom", la fonction
	// retourne un tableau de 2 éléments: {nom, prénom}:
	public static String[] extractNomEtPrenom(String nomPrenom) {
		String[] nomEtPrenom = new String[2];
		for (int i = 0; i < nomPrenom.length(); i++) {
			if (nomPrenom.charAt(i) == ' ') {
				String nom, prenom;
				nom = nomPrenom.substring(0, i);
				prenom = nomPrenom.substring(i + 1);
				nomEtPrenom[0] = nom;
				nomEtPrenom[1] = prenom;
				break;
			}
		}
		return nomEtPrenom;// Attention, si l'espace n'a pas été trouvé, le
							// tableau résultat n'est pas initialisé, mais ce
							// cas est impossible;
	}

	// à partir d'un nom et d'un tableau de noms et prénoms donnés en entrée,
	// extraire le prénom:
	// si le nom n'a pas été trouvé, la fonction retourne la valeur "PRENOM NON
	// TROUVE"
	public static String trouverPrenom(String nomRecherche, String[] tableau) {
		String prenom = "PRENOM NON TROUVE";
		String nomPrenom;

		// les noms sont stoqués en majuscules dans le tableau
		nomRecherche = nomRecherche.toUpperCase();
		for (int i = 0; i < tableau.length; i++) {
			nomPrenom = tableau[i];
			String[] nomEtPrenom = extractNomEtPrenom(nomPrenom);

			// si le nom recherché a la même valeur que le nom stoqué en
			// position 0 dans le tableau nomEtPrenom,
			// le prénom recherché est stoqué en position 1 dans le même tableau
			if (nomRecherche.equals(nomEtPrenom[0])) {
				prenom = nomEtPrenom[1];
				break;
			}
		}
		return prenom; // si le nom n'a pas été trouvé, la fonction retourne la
						// valeur "PRENOM NON TROUVE"
	}

}
