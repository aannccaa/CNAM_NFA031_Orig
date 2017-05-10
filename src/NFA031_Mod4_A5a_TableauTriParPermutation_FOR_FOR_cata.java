
public class NFA031_Mod4_A5a_TableauTriParPermutation_FOR_FOR_cata {

	public static void main(String[] args) {
		int T1[] = { 5, 7, 3, 1, 6 };
		sort(T1);
		printArray(T1);
		
		int T2[] = { 5, 7, 9, 1, 6, 7, 99 };
		sort(T2);
		printArray(T2);

	}

	private static void sort(int[] T) {
		int i, j, longueurTableau;
		longueurTableau = T.length;

		for (i = 0; i < longueurTableau; i++) {
			for (j = 0; j < longueurTableau - 1; j++) {
				if (T[j] > T[j + 1]) {
					int tmp = T[j + 1];
					T[j + 1] = T[j];
					T[j] = tmp;
				}
			}

		}
	}

	public static void swap(int[] t, int x, int y) {
		int tmp = t[x];
		t[x] = t[y];
		t[y] = tmp;
	}
	
	public static void x(String[] args) {
		int i, j, longueurTableau;
		int T[] = { 5, 7, 3, 1, 6 };
		longueurTableau = T.length;

		for (i = 0; i < longueurTableau; i++) {
			for (j = 0; j < longueurTableau - 1; j++) {
				if (T[j] > T[j + 1]) {
					swap(T, j, j+1);
				}
			}
		}
		printArray(T);
	}

	private static void printArray(int[] t) {
		System.out.print("[");
		String sep = "";
		for (int i = 0; i < t.length; i++) {
			System.out.print(sep + t[i]);
			sep = ", ";
		}
		System.out.println("]");
	}

}
