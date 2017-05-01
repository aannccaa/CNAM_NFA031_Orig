/*
Calculez la somme des entiers compris entre 2 nombres choisis par l'utilisateur,
en utilisant la boucle : Tant que (while)...Faire (do)...
*/

public class NFA031_Mod3_ExempleA1_SommeEntiers_entreBornesChoisies_WHILE_DO {
	public static void main(String[] args) {
		int entier1, entier2, entierInf, entierSup;
		System.out.println("Calcul somme des entiers compris entre 2 nombres choisis : ");
		System.out.print("Entrer un premier nombre entier : ");
		entier1 = Lire.i();
		System.out.print("Entrer un deuxième nombre entier : ");
		entier2 = Lire.i();
		if (entier1 <= entier2) {
			entierInf = entier1;
			entierSup = entier2;
		} else {
			entierInf = entier2;
			entierSup = entier1;
		}
		int somme = 0, i = entierInf;
		while (i <= entierSup) {
			somme = somme + i;
			i = i + 1;
		}
		System.out.print("La somme des entiers compris entre " + entierInf + " et " + entierSup + " = " + somme);
	}
}