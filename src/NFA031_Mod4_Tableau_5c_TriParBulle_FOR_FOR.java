
public class NFA031_Mod4_Tableau_5c_TriParBulle_FOR_FOR {

	public static void main(String[] args) {

		int i, j, temp, Max = 5;
		int[] T = { 5, 7, 3, 1, 6 };
		System.out.print("[");
		for (i = 0; i <= Max - 1; i++) {
			for (j = 0; j <= Max - 1; j++) {
				if (T[i] > T[j]) {
					temp = T[i];
					T[i] = T[i + 1];
					T[j] = temp;
				}
			}
			System.out.print(T[i]);
			System.out.print(",");
		}
		System.out.print("]");

	}

}
