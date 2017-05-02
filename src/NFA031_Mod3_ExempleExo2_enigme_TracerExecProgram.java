/*
Exercice 2
Tracez l'exécution du programme suivant à l'aide d'un tableau d'évolution des variables :
 */

public class NFA031_Mod3_ExempleExo2_enigme_TracerExecProgram {

	public static void main(String[] args) {
		int x = 0;
		String st = "abc";
		boolean bool = true;
		char ch1 = 'b';
		char ch2 = 'x';

		for (int i = 0; i < 5; i++) {
			bool = (i % 2 == 0);
			if (bool == (i < 3)) {
				st = st + ch1;
			} else {
				st = st + ch2;
			}
		}

		System.out.println("La valeur de st est : " + st);
	}

}

