/*
Tri par bulle
Principe : le nom du tri vient du fait qu'à chaque passage les grands éléments remontent 
vers la fin du tableau, comme une bulle dans un liquide. 
*/
public class NFA031_Mod4_5c_TableauTriParBulle_FOR_FOR {

	public static void main(String[] args) {

		int[] tab = { 7, 5, 7, 3, 1, 6, 7, 6 };
		
		for (int i = 0; i < tab.length-1; i++) {
			for (int j = 0; j < tab.length-1; j++) {
				// Teste si 2 éléments successifs sont dans le bon ordre
				if (tab[j] > tab[j+1]) {
					// s'ils ne le sont pas, on échange leurs positions
					int temp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = temp;
					/* Le tableau n'est toujours pas trié */
				}
			}
		}
		
		// afficher le tableau trié:
		System.out.print("Le tableau trié par ordre croissante: [");
		String separateur = "";
		for (int i = 0; i < tab.length; i++) {
			System.out.print(separateur + tab[i]);
			separateur = ", ";
		}
		System.out.print("]");

	}

}
