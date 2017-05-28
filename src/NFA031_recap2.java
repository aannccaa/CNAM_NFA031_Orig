/*
Exercice 2
a) Ecrire un code qui permet de saisir N lettres majuscules pour les placer dans un tableau . 
b) On appelle 'plateau' une suite de majuscules contiguës et identiques . 
    Ecrire un code qui calcule le nombre de plateaux contenus dans le tableau .
       Exemple : si le tableau est le suivant : {'A' , 'B' , 'B' , 'T' , 'V' , 'V' , 'V' , 'A' , 'B' , 'B'} , le
                         programme indiquera qu'il y a 3 plateaux .
*/

public class NFA031_recap2 {
	public static void main(String[] args) {
		
		int nombreLettres;
		// char[] tab = { 'A', 'B', 'B', 'T', 'V', 'V', 'V', 'A', 'B', 'B' };
		
		
		System.out.println("Donner le nombre de lettres à mémoriser :");
		nombreLettres = Lire.i();
		char[] tab = new char[nombreLettres];
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Donner le character position " + i + " : ");
			tab[i] = Character.toUpperCase(Lire.c());
		}
		
		System.out.print("{");
		String result = "";
		String separateur = "";
		for (int i = 0; i < tab.length; i++) {
			result = result + separateur + tab[i];
			separateur = ";";
		}
		
		System.out.println(result + "}");
		
		
		System.out.println("Nombre plateaux = " + compterPlateaux(tab));
	}

	public static int compterPlateaux(char[] tab) {
		int result = 0;
		char lettrePrecedente = tab[0];
		boolean compterPlateau = true;

		for (int i = 1; i < tab.length; i++) {
			if (tab[i] == lettrePrecedente) {
				if (compterPlateau) {
					result = result + 1;
					compterPlateau = false;
				}  
			} else {
				lettrePrecedente = tab[i];
				compterPlateau = true;
			}
		}

		return result;
	}
	
	public static int[][] extractPlateaux(char[] tab) {
		int nbPlateaux = compterPlateaux(tab);
		int[][] tabPlateaux= new int[nbPlateaux][2];
		
		int indexPlateau=0;
		char lettrePrecedente = tab[0];
		boolean compterPlateau = true;

		for (int i = 1; i < tab.length; i++) {
			if (tab[i] == lettrePrecedente) {
				if (compterPlateau) {
					tabPlateaux[indexPlateau][0] = i-1;
					tabPlateaux[indexPlateau][1] = -1;
					compterPlateau = false;
				}  
			} else {
				lettrePrecedente = tab[i];
				compterPlateau = true;
			}
		}

		return result;
	}

	public static int compterPlateaux2(char[] tab, int start) {
		if(start >= tab.length -1){
			return 0;
		}
		char lettrePlateau = tab[start];
		
		int index = start+1;
		int cnt = 1;
		while(index < tab.length && tab[index] == lettrePlateau){
				cnt ++;
				index ++;
			}
		
		
		boolean plateau = (cnt > 1);
		int result;
		if(plateau){
			result = 1;
		}else {
			result =0;
		}
		return result + compterPlateaux2(tab, index);
	}

	
}