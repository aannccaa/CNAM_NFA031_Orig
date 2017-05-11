/*
a) Ecrire un code pour d�clarer un tableau de r�els de taille N, 
	N �tant � d�finir par l'utilisateur.
b) Ecrire un code pour remplir ce tableau.
c) Compl�ter le code pour qu'il demande � l'utilisateur un nombre x de son choix.

Le programme devra indiquer le nombre de r�els qui sont sup�rieurs ou �gaux �
ce nombre x fourni par l'utilisateur .
*/

public class NFA031_Mod4_Exemple1_Tableau {
	public static void main(String[] args) {

		int N, i, compteur = 0;
		System.out.print("Donner la taille du tableau de r�els: ");
		N = Lire.i();
		double tab[] = new double[N];

		for (i = 0; i < N; i++) {
			System.out.print("Donner le nombre r�el num�ro " + (i + 1) + " : ");
			tab[i] = Lire.d();
		}

		System.out.print("Donner un nombre r�el x: ");
		double x = Lire.d();

		for (i = 0; i < N; i++) {
			if (tab[i] >= x) {
				compteur = compteur + 1;
			}
		}
		System.out.println("Le nombre des r�els du tableau qui sont >= " + x + " est de " + compteur);
	}
}