/*
Tri par bulle
Principe : le nom du tri vient du fait qu'à chaque passage les grands éléments remontent 
vers la fin du tableau, comme une bulle dans un liquide. 
*/

public class NFA031_Mod4_5c_TableauTriParBulle_DO_FOR_WHILE {

	public static void main(String[] args) {

		int i, temp;
		int T[] = { 5, 7, 3, 1, 6 };
		int longueurTableau = T.length;
		String separateur;

		boolean enDesordre;
		
		
		do  {
			enDesordre = false;//adica sortate pana la proba contrarie;

			for (i = 0; i < longueurTableau - 1; i++) {
				// Teste si 2 éléments successifs sont dans le bon ordre ou non
				

				if (T[i] > T[i + 1]) {
					// s'ils ne le sont pas, on échange leurs positions
					temp = T[i];
					T[i] = T[i + 1];
					T[i + 1] = temp;
					enDesordre = true;
				}
			}
		}
		while(enDesordre);//adica nesortate;
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
