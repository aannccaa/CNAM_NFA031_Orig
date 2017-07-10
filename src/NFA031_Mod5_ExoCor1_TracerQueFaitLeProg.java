/*
Donner et expliquer , à l’aide d’un tableau 
retraçant l’évolution des variables, les résultats
fournis par le programme suivant :
*/

public class NFA031_Mod5_ExoCor1_TracerQueFaitLeProg {
	public static void main(String[] args) {
		int s, c;
		s = 3;
		c = 1;
		while (s <= 500) {
			s = 2 * fct(s + 2);
			System.out.println("s d indice " + c + " vaut : " + s);
			c = c + 1;
		}

	}

	public static int fct(int y) {
		int z, w;
		z = 2 * y;
		w = y + 1;
		w = w + z;

		return w;
	}
}