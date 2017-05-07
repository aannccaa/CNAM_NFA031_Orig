
public class NFA031_Mod4_Tableau_5a_TriParSelection_FOR_WHILE {

	public static void main(String[] args) {

		int i, j, min, indexMin, longueurTableau;
		int[] T = {5, 7, 3, 1, 6};
		longueurTableau = T.length;
		System.out.print("[");
		for (i = 0; i <= longueurTableau-2; i++) {
			min = T[i];
			indexMin = i;
			j = i + 1;
			while (j <= longueurTableau-1) {
				if (T[j] < min) {
					min = T[j];
					indexMin = j;
				}
				j = j + 1;
			}
			T[indexMin] = T[i];
			T[i] = min;
			System.out.print(T[i]);
			System.out.print(", ");
		}
		System.out.print(T[i]);
		System.out.print("]");
		
	}

}
