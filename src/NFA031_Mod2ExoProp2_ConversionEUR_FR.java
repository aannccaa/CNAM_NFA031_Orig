/*
Exercice 2)
Ecrire un algorithme qui permettra de réaliser , selon le choix indiqué par
l’utilisateur , la conversion FRF en EUR ou la conversion EUR en FRF d’un montant
tapé en entrée .
*/

public class NFA031_Mod2ExoProp2_ConversionEUR_FR {
	public static void main(String[] args) {
		double mntEUR, mntFRF, tauxChange1EUR_FRF = 6.55957;
		int choixConversion;
		System.out.print("Pour convertir des EUR en FRF, tappez 1.\nPour convertir des FRF en EUR, tappez 2 : ");
		choixConversion = Lire.i();
		if ((choixConversion != 1) && (choixConversion != 2)) {
			System.out.print("Choix incorrect, les seuls choix acceptés sont 1 ou 2. Veuillez recommencer. ");
		} else {
			if (choixConversion == 1) {
				System.out.print("Rentrez le montant d'EUR à convertir : ");
				mntEUR = Lire.d();
				mntFRF = mntEUR * tauxChange1EUR_FRF;
				System.out.format(mntEUR + " EUR = %.2f FRF \n", mntFRF);
			} else {
				if (choixConversion == 2) {
					System.out.print("Rentrez le montant de FRF à convertir : ");
					mntFRF = Lire.d();
					mntEUR = mntFRF / tauxChange1EUR_FRF;
					System.out.format(mntFRF + " FRF = %.2f EUR \n", mntEUR);
				}
			}
		}
	}
}
