/*
Calculez la somme des entiers compris entre 10 et 20,
en utilisant la boucle : Tant que (while)...Faire (do)...
*/

public class NFA031_Mod3_ExempleA1_SommeEntiers_entre10_20_WHILE_DO {
	public static void main(String[] args) {
		int somme = 0, i = 10;
		while (i <= 20) {
			somme = somme + i;
			i = i + 1;
		}
		System.out.print("La somme des entiers compris entre 10 et 20 = " + somme);
	}
}