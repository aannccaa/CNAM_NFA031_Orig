/*
lorsque un tableau est pass� � une fonction, c�est l�adresse du premier �l�ment de ce tableau qui est communiqu�e
au tableau, et, du coup, toute modification portant sur le tableau � l�int�rieur de la fonction
sera r�percut�e sur le tableau d�origine dans le programme principal, et ce la m�me si le nom
du tableau est chang� dans la fonction.
 */

public class NFA031_Mod5_Bb3_Fonctions_passerTableauEnParam {

	public static void main(String[] args) {

		int[] tab = { 1, 2, 3 };

		System.out.println("tab contient initialement les entiers suivants : ");

		for (int i = 0; i < 3; i++)

		{
			System.out.print(" " + tab[i]);
		}

		// Terminal.sautDeLigne();
		System.out.println();

		modif(tab);

		System.out.println("tab contient maintenant les entiers suivants : ");

		for (int i = 0; i < 3; i++) {
			System.out.print(" " + tab[i]);
		}
	}

	public static void modif(int[] u) {
		u[0] = 6;
		u[1] = 7;
		u[2] = 8;
	}

}
