/*
Indiquer le résultat de l’exécution du code suivant: 
*/

public class NFA031_Mod5_Exemple3_Tableau {
	public static void main(String[] args) {
		int i, j;
		char tab[][] = new char[5][5];

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (j <= i) {
					tab[i][j] = '*';

				} else {
					tab[i][j] = ' ';
				}
			}

		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(tab[i][j]);
				System.out.print("");
			}
			System.out.println();
		}
	}
}
