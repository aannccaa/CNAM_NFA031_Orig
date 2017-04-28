/*
Exercice 2)
Ecrire un algorithme qui permettra de r�aliser , selon le choix indiqu� par
l�utilisatEUR , la conversion FRFnc EURo ou la conversion EURo FRFnc d�un montant
tap� en entr�e .
*/

public class NFA031_Mod2ExoProp2_ConversionEUR_FR {
	public static void main(String[] args) {
		double mntEUR, mntFRF, tauxChange1EUR_FRF = 6.55957;
		int choixConversion;
		System.out.print("Pour convertir des EUR en FRF, tappez 1.\nPour convertir des FRF en EUR, tappez 2 : ");
		choixConversion = Lire.i();
		if ((choixConversion != 1) && (choixConversion != 2)) {
			System.out.print("Choix incorrect, les seuls choix accept�s sont 1 ou 2. Veuillez recommencer. ");
		} else {
			if (choixConversion == 1) {
				System.out.print("Rentrez le montant d'EUR � convertir : ");
				mntEUR = Lire.d();
				mntFRF = mntEUR * tauxChange1EUR_FRF;
				System.out.format(mntEUR + " EUR = %.2f FRF \n", mntFRF);
			} else {
				if (choixConversion == 2) {
					System.out.print("Rentrez le montant de FRF � convertir : ");
					mntFRF = Lire.d();
					mntEUR = mntFRF / tauxChange1EUR_FRF;
					System.out.format(mntFRF + " FRF = %.2f EUR \n", mntEUR);
				}
			}
		}
	}
}
