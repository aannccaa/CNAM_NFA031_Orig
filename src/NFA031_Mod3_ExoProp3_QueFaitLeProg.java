/*
Expliquez ce que fait le programme suivant, en faisant un tableau 
qui retrace l’évolution pas à pas des variables du programme :
Remarque : ce code ne correspond à aucun problème concret. Son but est de s’entrainer à lire
un programme sans faire appel au sens de ce programme.
 */

public class NFA031_Mod3_ExoProp3_QueFaitLeProg {

	public static void main(String[] args) {
		{
			int i, j, r;

			for (i = 1; i <= 3; i = i + 1)

			{
				for (j = 1; j <= 5; j = j + 1)

				{
					if ((i + j) >= 6) {
						r = 2 * i + j;

						System.out.println("r vaut : " + r);
					}

					else {
						r = i + 3 * j;

						System.out.println("r vait : " + r);
					}
				}
			}

		}

	}
}