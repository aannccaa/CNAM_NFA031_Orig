/*
Soient a et b deux nombres entiers strictement positifs.
Ecrire un algorithme qui détermine la puissance de a par b: a^b, 
à l’aide de multiplications successives.
 */
public class NFA031_Mod3_ExoProp2_Puissance {

	public static void main(String[] args) {
		int a, b, puissance = 1;

		System.out.print("Donner un entier positif (a) :");
		a = Lire.i();
		System.out.print("Donner un entier positif (b) :");
		b = Lire.i();

		for (int i = 1; i <= b; i++) {
			puissance = puissance * a;
		}
		System.out.print("a^b = " + puissance);
	}

}
