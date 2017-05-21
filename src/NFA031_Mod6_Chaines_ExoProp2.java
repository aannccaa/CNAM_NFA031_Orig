/*
a) Ecrire un programme qui demande � l�utilisateur 5 noms, chacun suivi du pr�nom, 
et qui les stocke dans un tableau de cha�nes de caract�res. 
Un nom suivi d�un pr�nom sera enregistr� dans le tableau sous la forme suivante: 
DURAND Jean 
le caract�re qui s�pare le nom du pr�nom est donc le caract�re appel�: blanc.

b) On suppose que les noms fournis par l�utilisateur sont tous diff�rents. Compl�ter le
programme afin qu�il donne le pr�nom d�une personne dont on fournit le nom, lorsque ce
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
			System.out.print("Donner un nom pour rechercher son pr�nom (ou * pour terminer): ");
			nom = Lire.S();
			stop = nom.equals("*");
			if (!stop) {
				prenom = trouverPrenom(nom, tableauDesNomsEtPrenoms);
				if (prenom.equals("PRENOM NON TROUVE")) {
					System.out.println("Le nom n'a pas �t� trouv�");

				} else {
					System.out.println("Le pr�nom correspondant au nom '" + nom + "' est " + prenom);
				}
			}
		} while (!stop);

	}

	// la fonction remplit avec des noms et pr�noms demand�s � l'utilisateur,
	// un tableau de longueur �gale aux nombre des enregistrements
	// (nombreEnregistrements)
	// les noms sont format�s en majuscules, ainsi que l'initiale du pr�nom
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
			System.out.print("- donner le Pr�nom (sans espaces):");
			prenom = Lire.S();
			prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1, prenom.length()).toLowerCase();

			tab[i] = nom + " " + prenom;
			System.out.println("Nom Pr�nom enregistr�s: " + tab[i]);
		}
		return tab;
	}

	// � partir d'un nom complet �crit sous forme "NOM Prenom", la fonction
	// retourne un tableau de 2 �l�ments: {nom, pr�nom}:
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
		return nomEtPrenom;// Attention, si l'espace n'a pas �t� trouv�, le
							// tableau r�sultat n'est pas initialis�, mais ce
							// cas est impossible;
	}

	// � partir d'un nom et d'un tableau de noms et pr�noms donn�s en entr�e,
	// extraire le pr�nom:
	// si le nom n'a pas �t� trouv�, la fonction retourne la valeur "PRENOM NON
	// TROUVE"
	public static String trouverPrenom(String nomRecherche, String[] tableau) {
		String prenom = "PRENOM NON TROUVE";
		String nomPrenom;

		// les noms sont stoqu�s en majuscules dans le tableau
		nomRecherche = nomRecherche.toUpperCase();
		for (int i = 0; i < tableau.length; i++) {
			nomPrenom = tableau[i];
			String[] nomEtPrenom = extractNomEtPrenom(nomPrenom);

			// si le nom recherch� a la m�me valeur que le nom stoqu� en
			// position 0 dans le tableau nomEtPrenom,
			// le pr�nom recherch� est stoqu� en position 1 dans le m�me tableau
			if (nomRecherche.equals(nomEtPrenom[0])) {
				prenom = nomEtPrenom[1];
				break;
			}
		}
		return prenom; // si le nom n'a pas �t� trouv�, la fonction retourne la
						// valeur "PRENOM NON TROUVE"
	}

}
