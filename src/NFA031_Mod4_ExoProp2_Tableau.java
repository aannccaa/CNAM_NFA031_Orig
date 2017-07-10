/*
 Ecrire un code qui fournit à son exécution le résultat suivant :
    *
   **
  ***
 ****
*****
 */

public class NFA031_Mod4_ExoProp2_Tableau {

	public static void main(String[] args) {
		
		
		int nbLignes = 5;
		int nbCol = nbLignes;
		char tab[][] = new char[nbLignes][nbCol];
/*		char tab[][] = {
				{' ', ' ', ' ', ' ', '*'},
				{' ', ' ', ' ', '*', '*'},
				{' ', ' ', '*', '*', '*'},
				{' ', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'},
		};
*/
		
		for (int i = 0; i < nbLignes; i++) {
			for (int j = 0; j < nbCol; j++) {
				//if ((i+j)%2==0) {
				//if ((i==j) || (j==nbCol-1-i)) {
				//if((i != nbLignes/2 ) && (j != nbCol/2)){
				//if(i < nbLignes - 1 - j){
				if (i+j >= nbCol - 1) {
				tab[i][j] = '*';
				} else {
					tab[i][j] = ' ';
				}
			}
		}

		
		for (int i = 0; i < nbLignes; i++) {
			for (int j = 0; j < nbCol; j++) {
				
					System.out.print(tab[i][j]);
			}
			System.out.println();
		}
		
	}

}

