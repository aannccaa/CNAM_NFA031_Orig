
public class NFA031_Mod4_5c_TableauTriParBulle_FOR_FOR {

	public static void main(String[] args) {

		int i, j, temp;
		int[] T = { 5, 7, 3, 1, 6 };
		int longueurTableau = T.length;
		String separateur = "";
		
		for (i = 0; i < longueurTableau-1; i++) {
			for (j = 0; j < longueurTableau-1; j++) {
				// Teste si 2 éléments successifs sont dans le bon ordre ou non
				if (T[j] > T[j+1]) {
					// s'ils ne le sont pas, on échange leurs positions
					temp = T[j];
					T[j] = T[j+1];
					T[j+1] = temp;
					/* Le tableau n'est toujours pas trié */
				}
			}
		}
		
		// afficher le tableau trié:
		System.out.print("Le tableau trié par ordre croissante: [");
		separateur = "";
		for (i = 0; i < longueurTableau; i++) {
			System.out.print(separateur + T[i]);
			separateur = ", ";
		}
		System.out.print("]");

	}

}
