/*
a) Ecrire un programme qui demande à l’utilisateur une série de N nombres entiers
strictement positifs et qui les stocke dans un tableau.
b) Calculer la valeur maximale atteinte par les nombres du tableau.
c) Ajouter à votre programme la détermination du nombre d’entiers qui sont égaux à
cette valeur maximale, ainsi que la détermination des indices auxquels ils sont situés.
d) Ajouter à votre programme le calcul de la moyenne des nombres du tableau.
*/

public class NFA031_Mod4_ExoCor1_Tableau_bis {
	public static void main(String[] args) {

		// a)
		int[] tab = stockerN();
		System.out.print("Tableau rentré : ");
		afficherTab1D(tab);

		// b)
		int max = calcMax(tab);
		System.out.println("Val max : " + max);

		// c)
		int nbMax = calcNbMax(tab, max);
		System.out.println("Nombre des val max : " + nbMax);

		int[] tabIndicesMax = calcIndicesNbMax(tab, max, nbMax);
		System.out.print("List des indices correspondant au val. max : ");
		afficherTab1D(tabIndicesMax);

		// d)
		double moyenne = calcMoyenne(tab);
		System.out.format("Moyenne  : %.2f \n",moyenne);
	}

	public static int[] stockerN() {
		int n;
		System.out.print("Donner n : ");
		n = Lire.i();
		int[] tab = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Donner la val pour l'indice " + i + " : ");
			tab[i] = Lire.i();
		}

		return tab;

	}

	public static void afficherTab1D(int[] tab) {
		System.out.print("{");
		String sep = "";
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = "; ";
		}
		System.out.println("}");

	}

	public static int calcMax(int[] tab) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < tab.length; i++) {
			max = tab[0];
			if (tab[i] >= max) {
				max = tab[i];
			}
		}
		return max;
	}

	public static int calcNbMax(int[] tab, int max) {
		int nbMax = 0;

		for (int i = 0; i < tab.length; i++) {		
			if (tab[i] >= max) {
				nbMax++;
			}
		}
		return nbMax;
	}

	public static int[] calcIndicesNbMax(int[] tab, int max, int nbMax) {
		
		int[] tabIndicesMax = new int[nbMax];
		int positionLibre = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] >= max) {
				tabIndicesMax[positionLibre] = i;
				positionLibre++;
			}
		}
		return tabIndicesMax;
	}

	public static double calcMoyenne(int[] tab) {
		double moyenne;
		int somme = 0;

		for (int i = 0; i < tab.length; i++) {
			somme = somme + tab[i];
		}
		moyenne = (somme*1.0) / tab.length;

		return moyenne;
	}
}