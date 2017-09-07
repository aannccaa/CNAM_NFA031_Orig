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
public class NFA031_Mod6_Chaines_ExoProp2_bis {

	public static void main(String[] args) {
		int nbEnregistrements = 2;
		String[] personnes = stoquerNomPrenom(nbEnregistrements);
		afficherTab1D(personnes);
		
		String nom = "TOTO";
		String prenom = retournerPrenom(personnes, nom);
		System.out.println("Prenom trouve pour le nom '" + nom + "' est: '"  + prenom + "'");
	}

	public static String[] stoquerNomPrenom(int nbEnregistrements) {
		String[] tab = new String[nbEnregistrements];

		for (int i = 0; i < tab.length; i++) {
			System.out.print("Donner NOM et Prénom pour la personne " + i + " : ");
			tab[i] = Lire.S();

		}
		return tab;
	}

	public static void afficherTab1D(String[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = "; ";
		}
		System.out.println("}");

	}

	
	public static String retournerPrenom(String[] tab, String nom) {
		String prenom="";
		for (int i=0; i<tab.length; i++) {
			String nomPrenom = tab[i];
			if (trouverSubstring(nomPrenom, nom)) {
				prenom = nomPrenom.substring(nom.length()+1, nomPrenom.length());
			}
		}
		return prenom;
	}

	public static boolean trouverSubstring(String s, String aTrouver) {
		boolean trouve = false;
		int sep = indiceChar(s, ' ');
		String nom = s.substring(0, sep);
		trouve = nom.equals(aTrouver);
		// variante: 
//		int longNom = nom.length();
//		int longStringATrouver = aTrouver.length();
//		if (longNom == longStringATrouver) {
//			trouve=true;
//			for (int i = 0; i < sep; i++) {
//				if (s.charAt(i) != aTrouver.charAt(i)) {
//					trouve = false;
//					break;
//				}
//			}
//		}
		return trouve;
	}

	public static int indiceChar(String s, char c) {
		int indice = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				indice = i;
				break;
			}
		}
		return indice;

	}
}
