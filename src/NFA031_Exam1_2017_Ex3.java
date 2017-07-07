// que produit le program

public class NFA031_Exam1_2017_Ex3 {
	public static void main(String[] args) {

		int[] tab = { 4, 7, 3 };
		int k = 1;
		boolean b = true;
		int r;
		while (b == true) {
			r = eval(k, tab);
			System.out.println("La valeur de r a l etape " + k + " est : " + r);
			b = fonct(b, r);
			k = k + 1;
		}
	}

	static int eval(int j, int[] u) {
		int a, n;
		a = 3 * u[1];
		for (n = 0; n < u.length; n++) {
			u[n] = 2 * u[n];
		}
		if (30 * j < a + 2 * (n + 5)) {
			a = u[1];
		}
		return a;
	}

	static boolean fonct(boolean bool, int y) {
		bool = (y < 50);
		return bool;
	}

}
