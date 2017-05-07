
public class NFA031_Mod4_Tableau_5a_TriParSelection_FOR_FOR {

	public static void main(String[] args) {
		int i, j, min, indexMin, longueurTableau;
		int T[] = { 5, 7, 3, 1, 6 };
		longueurTableau = T.length;

		System.out.print("[");
		for (i = 0; i <= longueurTableau - 2; i++) {
			min = T[i];
			indexMin = i;
			for (j = i + 1; j <= longueurTableau - 1; j++) {
				if (T[j] < min) {
					min = T[j];
					indexMin = j;
				}
			}
			if (indexMin > i) {
				T[indexMin] = T[i];
				T[i] = min;
			}
			System.out.print(T[i] + ", ");
		}
		System.out.print(T[i]);
		System.out.print("]");
	}

}
