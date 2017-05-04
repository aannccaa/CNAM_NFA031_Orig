/*
A l’aide d’un tableau retraçant l’évolution des variables et des expressions, 
indiquez ce que fait le programme suivant :
 */

public class NFA031_Mod3_ExoProp4_TracerQueFaitLeProg {

	public static void main(String[] args) {
		int r = 2;
		boolean b = false;

		for (int i = 0; i < 7; i++) {
			b = (i % 3 == 1);

			if (b == (i > 4)) {
				r = r * 3;
			}

			else {
				r = r + 5;
			}

			System.out.println("r numero " + i + " vaut : " + r);
		}
	}
}