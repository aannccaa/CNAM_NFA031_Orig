/*
a) Ecrire un algorithme qui demande en entrée un tableau trié dont on gardera une place libre
à la fin du tableau. L’algorithme demandera ensuite une valeur et le rangera dans le tableau en
respectant l’ordre croissant des éléments.
Exemple :
{12, 15, 16, 18, 20}
Valeur à insérer : 17
{12, 15, 16, 17, 18, 20}

b) Vérifiez votre solution à l’aide d’un tableau d’évolution des variables .
 */

public class NFA031_Mod4_ExoProp1_Tableau_bis {

	public static void main(String[] args) {
		int[] tab = {12, 15, 16, 18, 20};
		
		// a)
		int[] tabbis = creerTabbis(tab);
		System.out.println("Le tableau est : ");
		afficherTab1D(tabbis);
		
		int[] tabOrdonne = ordonnerTabAsc(tabbis);
		System.out.println("Le tableau ordonné est : ");
		afficherTab1D(tabOrdonne);
	}

	public static int[] creerTabbis(int[] tab) {


		int[] tabbis = new int[tab.length+1];
		System.out.print("Donner la valeur à inserer : ");
		int val = Lire.i();
		for(int i=0; i<tab.length; i++) {
			tabbis[i] = tab[i];
		}
		tabbis[tabbis.length-1] = val;
		
		return tabbis;
		
		
	}

	public static void afficherTab1D(int[] tab) {
		String sep = "";
		
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = "; ";
		}
		System.out.println("}");
	}
	
	public static int[] ordonnerTabAsc(int[] tab) {
		for(int i=0; i<tab.length-1; i++) {
			for(int j=i+1; j<tab.length; j++) {
				if(tab[i]>tab[j]) {
					swap(tab, i, j);
				}
			}
		}
		
		return tab;
	}
	
	public static int[] swap(int[] tab, int x, int y) {
		int temp;
		temp = tab[x];
		tab[x] = tab[y];
		tab[y] = temp;
		
		return tab;
	}
}
