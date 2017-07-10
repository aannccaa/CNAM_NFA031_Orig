
public class NFA031_Mod4_A6_TableauRechercheDichotomique {

	public static void main(String[] args) {

		int debut, milieu, fin, valRechercher = 9, longueurTableau;
		boolean estTrouve = false;
		int[] T = { 1, 3, 5, 6, 7, 9, 11 };

		longueurTableau = T.length;
		debut = 1;
		fin = longueurTableau;

		while ((estTrouve = false) && (debut <= fin)) {
			milieu = (debut + fin) / 2;
			if (valRechercher < T[milieu]) {
				fin = milieu - 1;

			} else {
				if (valRechercher > T[milieu]) {
					debut = milieu + 1;

				} else {
					estTrouve = true;
				}
			}
		}
		if (estTrouve = true) {
			System.out.print("La valeur existe dans le tableau dans ");

		} else {
			System.out.print("La valeur existe dans le tableau.");
		}
	}

}
