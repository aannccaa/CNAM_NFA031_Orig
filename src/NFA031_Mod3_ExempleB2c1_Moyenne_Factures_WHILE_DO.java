/*
écrivons un programme pour enregistrer des montants de factures. 
Ce programme devra à la fin indiquer la moyenne de factures enregistrées.
Le program suivant utilse une boucle While-Do.
 */

public class NFA031_Mod3_ExempleB2c1_Moyenne_Factures_WHILE_DO {

	public static void main(String[] args) {
		double sommeFactures=0, moyenneFactures, mntFacture;
		char choix;
		int compteur=0;
		
		System.out.print("Voulez-vous enregistrer une facture (O/N)? ");
		choix = Character.toUpperCase(Lire.c());
		while (choix =='O') {
			System.out.print("Donner le montant de la facture : ");
			mntFacture = Lire.d();
			sommeFactures = sommeFactures + mntFacture;
			compteur = compteur + 1;
			System.out.print("Voulez-vous enregistrer une facture (O/N) ? ");
			choix = Character.toUpperCase(Lire.c());
		}
		
		if (compteur == 0) {
			System.out.println("Aucune facture enregistrée. ");
		} else {
			moyenneFactures = sommeFactures / compteur;
			System.out.format("La moyenne des factures enregistrées = %.2f euros \n", moyenneFactures);
		}
		
		System.out.print("FIN DU PROGRAMME");
	}

}
