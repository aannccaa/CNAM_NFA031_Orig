/*
Soient a et b deux nombres entiers strictement positifs.
Ecrire un algorithme qui détermine la puissance de a par b: a^b, 
à l’aide de multiplications successives.
 */
public class NFA031_Mod3_ExoProp2_Puissance {

	public static void main(String[] args) {
		int a, b, puissance = 1;

		do {
			System.out.print("Donner un entier strictement positif (a>0) :");
			a = Lire.i();
			if (a <= 0) {
				System.out.print("Choix incorrect. ");
			}
		} while (a <= 0);

		do {
			System.out.print("Donner un entier positif (b>=0) :");
			b = Lire.i();
			if (b < 0) {
				System.out.print("Choix incorrect. ");
			}
		} while (b < 0);

		for (int i = 1; i <= b; i++) {
			puissance = puissance * a;
		}
		System.out.format("a^b = %d^%d = %d", a,b,puissance);
	}

}
