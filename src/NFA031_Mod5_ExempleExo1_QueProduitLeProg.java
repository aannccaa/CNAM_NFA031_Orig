/*
Donnez les affichages produits à l'exécution par le programme suivant:
*/

public class NFA031_Mod5_ExempleExo1_QueProduitLeProg {
	static void pm(int i, int n, int[] t) {
		if (dI(i, 0, t.length - 1))
			t[i] = t[i] + n;
	}

	static boolean dI(int i, int inf, int sup) {
		return ((inf <= i) && (i <= sup));
	}

	static void af(int[] t) {
		for (int i = 0; i < t.length; i++)
			System.out.print(" " + t[i]);
	}

	static int eval(int x, int[] t) {
		int p = 1;

		int r = 0;

		for (int i = 0; i < t.length; i++) {
			r = r + t[i] * p;

			p = p * x;
		}

		return r;
	}

	public static void main(String[] args) {
		int[] tab = { 1, 3, 5 };

		pm(3, 10, tab); /* étape a) */

		af(tab); /* étape b) */

		System.out.println(" ");

		pm(0, 3, tab); /* étape c) */

		af(tab); /* étape d) */

		System.out.println(" ");

		System.out.println(" Le resultat vaut : " + eval(2, tab));
	}

}
