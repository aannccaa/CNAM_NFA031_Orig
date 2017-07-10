/*
a) Ecrire un code pour déclarer un tableau de réels de taille N, 
	N étant à définir par l'utilisateur.
b) Ecrire un code pour remplir ce tableau.
c) Compléter le code pour qu'il demande à l'utilisateur un nombre x de son choix.

Le programme devra indiquer le nombre de réels qui sont supérieurs ou égaux à
ce nombre x fourni par l'utilisateur .
*/

public class NFA031_Mod4_Exemple1_Tableau {
	public static void main(String[] args) {

		int N, i, compteur = 0;
		System.out.print("Donner la taille du tableau de réels: ");
		N = Lire.i();
		double tab[] = new double[N];

		for (i = 0; i < N; i++) {
			System.out.print("Donner le nombre réel numéro " + (i + 1) + " : ");
			tab[i] = Lire.d();
		}

		System.out.print("Donner un nombre réel x: ");
		double x = Lire.d();

		for (i = 0; i < N; i++) {
			if (tab[i] >= x) {
				compteur = compteur + 1;
			}
		}
		System.out.println("Le nombre des réels du tableau qui sont >= " + x + " est de " + compteur);
	}
}