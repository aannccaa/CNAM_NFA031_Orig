
public class NFA031_Mod4_5b_TableauTriParPermutation_FOR_FOR {

	public static void main(String[] args) {

		int i, j, temp, longueurTableau;
		int[] T = { 5, 7, 3, 1, 6 };
		longueurTableau = T.length;
		System.out.print("[");
		for (i = 0; i <= longueurTableau - 2; i++) {
			for (j = i + 1; j <= longueurTableau - 1; j++) {
				if (T[i] > T[j]) {
					temp = T[i];
					T[i] = T[j];
					T[j] = temp;
				}
			}
			System.out.print(T[i]);
			System.out.print(", ");
		}
		System.out.print(T[i]);

		System.out.print("]");

	}

}
