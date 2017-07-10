/*
Ecrire une procédure qui reçoit en entrée un tableau de 20 entiers, et une valeur entière à
rechercher dans le tableau. La procédure devra indiquer si la valeur à rechercher existe ou
non dans le tableau ainsi que l’indice de cette valeur dans le tableau (si la valeur y figure).
 */
public class NFA031_Mod5_ExoProp1_Fonction_RechercheEntierDansTableau {

	public static void main(String[] args) {
		int[] tab = { 3, 5, 3 };
		int valeurARechercher = 3;
		int indexValeurARechercher = rechercherValeur(valeurARechercher, tab);

		if (indexValeurARechercher == -1) {
			System.out.println("La valeur " + valeurARechercher + " n'a pas été trouvée dans le tableau. ");
		} else {
			System.out.println("Le premier index de la valeur recherchée " + valeurARechercher + " est : "
					+ indexValeurARechercher);
		}

	}

	public static String getTableauStr(int[] tableau) {
		String resultat = "[";
		String sep = "";
		for (int i = 0; i < tableau.length; i++) {
			resultat = resultat + sep + tableau[i];
			sep = ", ";
		}
		resultat = resultat + "]";
		return resultat;
	}

	public static void mainTest(String[] args) {
		int[][] tableauxDeTest = { { 3, 5, 3 }, {}, { 1, 2, 2 }, { -1, 1 } };

		int[] valeursDeTest = { -1, 0, 1, 2, 3, 4, 5 };

		int[][] resultatsAtendus = { { -1, -1, -1, -1, 0, -1, 1 }, { 0, -1, -1, -1, -1, -1, -1 },
				{ -1, -1, 0, 1, -1, -1, -1 }, { 0, -1, 1, -1, -1, -1, -1 }

		};

		for (int indexTableauATester = 0; indexTableauATester < tableauxDeTest.length; indexTableauATester++) {
			int[] tableauATester = tableauxDeTest[indexTableauATester];
			int[] resultatsAttendus = resultatsAtendus[indexTableauATester];
			executerTests(tableauATester, valeursDeTest, resultatsAttendus);
		}
		System.out.println("FIN");
	}

	public static void executerTests(int[] tableau, int[] valeursATester, int[] resultatsAttendus) {
		System.out.println("Test: " + getTableauStr(tableau));
		System.out.println("Valeurs: " + getTableauStr(valeursATester));
		System.out.println("Attendus: " + getTableauStr(resultatsAttendus));
		boolean ok = true;
		for (int i = 0; i < valeursATester.length; i++) {
			int valeur = valeursATester[i];
			int indexAttendu = resultatsAttendus[i];
			int index = rechercherValeur(valeur, tableau);
			if (index == indexAttendu) {// test OK

			} else {
				String msgFmt = "ERR: %s, r: %d, a: %d, t: %d";
				System.out.format(msgFmt, getTableauStr(tableau), valeur, indexAttendu, index);
				System.out.println();
				ok = false;
			}
		}
		String resultatTest = ok ? "OK" : "NOK";
		System.out.println("--------------------------------" + resultatTest);
	}

	public static int rechercherValeur(int valeurARechercher, int[] tableau) {
		int index = -1;

		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] == valeurARechercher) {
				index = i;
				break;
			}
		}

		return index;
	}

	public static int rechercherValeur2(int valeurARechercher, int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] == valeurARechercher) {
				return i;
			}
		}
		return -1;
	}

}
