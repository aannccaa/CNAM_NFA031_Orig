/*
Exercice 2
a) Ecrire un code qui permet de saisir N lettres majuscules pour les placer dans un tableau . 
b) On appelle 'plateau' une suite de majuscules contiguës et identiques . 
    Ecrire un code qui calcule le nombre de plateaux contenus dans le tableau .
       Exemple : si le tableau est le suivant : 
       {'A' , 'B' , 'B' , 'T' , 'V' , 'V' , 'V' , 'A' , 'B' , 'B'}, 
       le programme indiquera qu'il y a 3 plateaux .
*/

public class NFA031_recap2_bisAnca {
	public static void main(String[] args) {
		int n = 10;
		char[] tab = { 'A', 'B', 'B', 'T', 'V', 'V', 'V', 'A', 'B', 'B' };
		// char[] tab = creerTab(n);
		afficherTab1D(tab);

		int nbPlateaux = compterPlateaux(tab);
		System.out.println("Nb. plateaux : " + nbPlateaux);

		String[] plateau = extrairePlateaux2(tab);
		afficherTab1D(plateau);

	}

	public static char[] creerTab(int n) {
		char[] tab = new char[n];
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Donner la lettre n° " + i + " : ");
			tab[i] = Character.toUpperCase(Lire.c());
		}
		return tab;
	}

	public static int compterPlateaux(char[] tab) {
		int nbPlateaux = 0;
		int lettrePrecedente = tab[0];
		boolean compterPlateau = true;

		for (int i = 1; i < tab.length; i++) {
			if (lettrePrecedente == tab[i]) {
				if (compterPlateau) {
					nbPlateaux++;
					compterPlateau = false;
				}
			} else {
				lettrePrecedente = tab[i];
				compterPlateau = true;
			}
		}

		return nbPlateaux;
	}

	public static int compterPlateaux2(char[] tab) {
		int nbPlateaux = 0;
		int indiceStartPlateauCourant = 0;
		int indiceStartPlateauSuivant = 1;
		boolean plateauCourrantEstValide;
		int longueurPlateauCourant;
		while (indiceStartPlateauSuivant < tab.length) {
			char lettrePlateau = tab[indiceStartPlateauCourant];
			char lettreCourante = tab[indiceStartPlateauSuivant];
			if (lettreCourante != lettrePlateau) {
				longueurPlateauCourant = indiceStartPlateauSuivant - indiceStartPlateauCourant;
				plateauCourrantEstValide = (longueurPlateauCourant >=  2);
				if (plateauCourrantEstValide) {
					nbPlateaux++;
				}
				indiceStartPlateauCourant = indiceStartPlateauSuivant;
			}
			indiceStartPlateauSuivant++;
		}
		longueurPlateauCourant = indiceStartPlateauSuivant - indiceStartPlateauCourant;
		plateauCourrantEstValide = (longueurPlateauCourant >=  2);
		if (plateauCourrantEstValide) {
			nbPlateaux++;
		}
		
		return nbPlateaux;
	}
	public static String[] extrairePlateaux2(char[] tab) {
		int nbPlateaux = compterPlateaux(tab);
		String[] plateaux= new String[nbPlateaux];
		int indiceStartPlateauCourant = 0;
		int indiceStartPlateauSuivant = 1;
		boolean plateauCourrantEstValide;
		int longueurPlateauCourant;
		int indicePositionLibre = 0;
		char lettrePlateau = '?';
		while (indiceStartPlateauSuivant < tab.length) {
			lettrePlateau = tab[indiceStartPlateauCourant];
			char lettreCourante = tab[indiceStartPlateauSuivant];
			if (lettreCourante != lettrePlateau) {
				longueurPlateauCourant = indiceStartPlateauSuivant - indiceStartPlateauCourant;
				plateauCourrantEstValide = (longueurPlateauCourant >=  2);
				if (plateauCourrantEstValide) {
					String plateau = fill(lettrePlateau, longueurPlateauCourant);
					plateaux[indicePositionLibre] = plateau;
					indicePositionLibre++;
				}
				indiceStartPlateauCourant = indiceStartPlateauSuivant;
			}
			indiceStartPlateauSuivant++;
		}
		longueurPlateauCourant = indiceStartPlateauSuivant - indiceStartPlateauCourant;
		plateauCourrantEstValide = (longueurPlateauCourant >=  2);
		if (plateauCourrantEstValide) {
			String plateau = fill(lettrePlateau, longueurPlateauCourant);
			plateaux[indicePositionLibre] = plateau;
		}
		
		return plateaux;
		
	}
	
	
	public static String fill(char c, int len) {
		String s= "";
		for(int i=0; i<len;i++) {
			s = s + c;
		}
		return s;
	}

	public static String[] extrairePlateaux(char[] tab) {

		int nbPlateaux = compterPlateaux2(tab);
		String plateaux[] = new String[nbPlateaux];
		char lettrePrecedente = tab[0];
		String plateauCourant = "" + lettrePrecedente;
		int indicePositionLibre = 0;
		for (int i = 1; i < tab.length; i++) {
			char lettreCourante = tab[i];
			if (lettreCourante == lettrePrecedente) {
				plateauCourant = plateauCourant + lettreCourante;
				if (i == tab.length - 1) {
					plateaux[indicePositionLibre] = plateauCourant;
				}
			} else {
				if (plateauCourant.length() >= 2) {
					plateaux[indicePositionLibre] = plateauCourant;
					indicePositionLibre++;
				}
				plateauCourant = "" + lettreCourante;
			}
			lettrePrecedente = lettreCourante;
		}
		// if (plateauCourant.length() >= 2) {
		// plateaux[indicePositionLibre] = plateauCourant;
		// }
		return plateaux;
	}

	public static void afficherTab1D(char[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = "; ";
		}
		System.out.println("}");

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
}