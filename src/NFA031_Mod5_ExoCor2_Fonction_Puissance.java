/*
Ecrire une fonction qui calcule l’élévation d’un nombre a à la puissance b:
 a^b, où a est un réel strictement positif et b un entier strictement positif.
 On convient d'appeller a "mantisse" et b "exposant".
 */

public class NFA031_Mod5_ExoCor2_Fonction_Puissance {

	public static void main(String[] args) {
		int b = 1;
		double a = 1;

		a = introduireReelStrictementPositif(a);
		b = introduireEntierStrictementPositif(b);
		System.out.format("La valeur de a puissance b (a^b) est : %.2f \n", calculerPuissance(a, b));

	}

	// fonction qui demande à l'utilisateur un nombre réel > 0:
	public static double introduireReelStrictementPositif(double nombreReelStrictementPositif) {
		boolean estStrictementPositif;
		do {
			System.out.print("Donner un numéro a, réel strictement positif :");
			nombreReelStrictementPositif = Lire.d();
			if (nombreReelStrictementPositif <= 0) {
				System.out.println("Le numéro inseré n'est pas strictement positif. ");
				estStrictementPositif = false;
			} else {
				estStrictementPositif = true;
			}

		} while (!estStrictementPositif);

		return nombreReelStrictementPositif;
	}

	// fonction qui demande à l'utilisateur un nombre entier > 0:
	public static int introduireEntierStrictementPositif(int nombreEntierStrictementPositif) {
		boolean estStrictementPositif;
		do {
			System.out.print("Donner un numéro b, entier strictement positif :");
			nombreEntierStrictementPositif = Lire.i();
			if (nombreEntierStrictementPositif <= 0) {
				System.out.println("Le numéro inseré n'est pas strictement positif. ");
				estStrictementPositif = false;
			} else {
				estStrictementPositif = true;
			}

		} while (!estStrictementPositif);

		return nombreEntierStrictementPositif;
	}

	// fonction qui calcule la puissance de 2 nombres (mantisse suposée à être un nb réel,
	// l'exposant un nb. entier):
	public static double calculerPuissance(double mantisse, int exposant) {
		double puissance = 1;

		for (int i = 0; i < exposant; i++) {
			puissance = mantisse * puissance;
		}

		return puissance;
	}

}
