/*
écrivons un programme pour enregistrer des montants de factures. 
Ce programme devra à la fin indiquer le nombre de factures enregistrées.
 */

public class NFA031_Mod3_ExempleB2a_Compteur_Factures_WHILE_DO {
	public static void main(String[] arg) {
		double mntFacture;
		char choix;
		int compteur = 0;
		System.out.print("Voulez-vous enregistrer une facture ? (O/N) ");
		choix = Character.toUpperCase(Lire.c());
		while (choix == 'O') {
			System.out.print("Donner le montant de la facture : ");
			mntFacture = Lire.d();
			compteur = compteur + 1;
			System.out.print("Voulez-vous enregistrer une facture ? (O/N) ");
			choix = Character.toUpperCase(Lire.c());
		}
		if (compteur == 0) {
			System.out.println("Vous n'avez pas enregistré de facture. ");
		} else {
			if (compteur == 1) {
				System.out.println("Vous avez enregistré une facture. ");
			} else {
				System.out.println("Vous avez enregistré " + compteur + " factures. ");
			}
		}
		System.out.print("FIN DU PROGRAMME");
	}
}