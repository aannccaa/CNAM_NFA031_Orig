/*
Exercice 2
a) Ecrire un code qui permet de saisir N lettres majuscules pour les placer dans un tableau . 
b) On appelle 'plateau' une suite de majuscules contiguës et identiques . 
    Ecrire un code qui calcule le nombre de plateaux contenus dans le tableau .
       Exemple : si le tableau est le suivant : {'A' , 'B' , 'B' , 'T' , 'V' , 'V' , 'V' , 'A' , 'B' , 'B'} , le
                         programme indiquera qu'il y a 3 plateaux .
*/

public class NFA031_recap2_bis {

	public static void main(String[] args) {
		int nombreLettres=10;
		// char[] tab = { 'A', 'B', 'B', 'T', 'V', 'V', 'V', 'A', 'B', 'B' };
		char[] tab = new char[nombreLettres];
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Donner le character position " + i + " : ");
			tab[i] = Character.toUpperCase(Lire.c());
		}
		
		System.out.println("Nombre plateaux = " + compterPlateaux(tab));

	}

	public static int compterPlateaux(char[] tab) {
		int nbPlateaux = 0;
		char lettrePrecedente = tab[0];
		boolean compterPlateau = true;

		for (int i = 1; i < tab.length; i++) {
			if (lettrePrecedente == tab[i]) {
				if (compterPlateau) {
					nbPlateaux = nbPlateaux + 1;
					compterPlateau = false;
				}
			} else {
				lettrePrecedente = tab[i];
				compterPlateau = true;
			}
		}

		return nbPlateaux;
	}

}
