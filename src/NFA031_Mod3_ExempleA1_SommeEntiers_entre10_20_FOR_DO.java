/*
Calculez la somme des entiers compris entre 10 et 20,
en utilisant la boucle : Pour (for)...
*/

public class NFA031_Mod3_ExempleA1_SommeEntiers_entre10_20_FOR_DO {
	public static void main(String[] args) {
		int somme = 0;
		for (int i = 10; i <= 20; i = i + 1) {
			somme = somme + i;
		}
		System.out.print("La somme des entiers compris entre 10 et 20 = " + somme);
	}
}