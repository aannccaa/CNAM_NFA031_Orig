
public class NFA031_Mod4_5c_TableauTriParBulle_DO_FOR_WHILE {

	public static void main(String[] args) {

		int i, temp;
		int T[] = { 5, 7, 3, 1, 6 };
		int longueurTableau = T.length;
		boolean enDesordre = true;
		String separateur;

		
		while (enDesordre) {
			// hypothèse : le tableau est trié
			enDesordre = false;

			for (i = 0; i < longueurTableau - 1; i++) {
				// Teste si 2 éléments successifs sont dans le bon ordre ou non
				if (T[i] > T[i + 1]) {
					// s'ils ne le sont pas, on échange leurs positions
					temp = T[i];
					T[i] = T[i + 1];
					T[i + 1] = temp;
					/* Le tableau n'est toujours pas trié */
					enDesordre = true;
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
