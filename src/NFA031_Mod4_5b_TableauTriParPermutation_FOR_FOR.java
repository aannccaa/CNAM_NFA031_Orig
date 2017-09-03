/*
Tri par permutation
Principe : Ce tri consiste à parcourir le tableau et comparer chaque élément avec 
les éléments qui le succèdent. S’ils sont dans l’ordre aucune permutation n’est faite, 
sinon des permutations sont effectuées.
 */
public class NFA031_Mod4_5b_TableauTriParPermutation_FOR_FOR {

	public static void main(String[] args) {

		int i, j, temp, longueurTableau;
		int[] T = { 5, 7, 3, 1, 6 };
		longueurTableau = T.length;
		System.out.print("Tableau trié en ordre croissante : [");
		for (i = 0; i < longueurTableau - 1; i++) {
			for (j = i + 1; j < longueurTableau; j++) {
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
