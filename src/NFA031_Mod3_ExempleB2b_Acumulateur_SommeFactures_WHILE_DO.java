/*
�crivons un programme pour enregistrer des montants de factures. 
Ce programme devra � la fin indiquer la somme de factures enregistr�es.
 */

public class NFA031_Mod3_ExempleB2b_Acumulateur_SommeFactures_WHILE_DO {

	public static void main(String[] args) {
		double mntFacture, sommeFactures=0;
		char choix;
		
		System.out.print("Voulez-vous enregistrer une facture (O/N) ? ");
		choix = Character.toUpperCase(Lire.c());
		while (choix == 'O') {
			System.out.print("Donner le montant de la facture : ");
			mntFacture = Lire.d();
			sommeFactures = sommeFactures + mntFacture;
			System.out.print("Voulez-vous enregistrer une facture (O/N) ? ");
			choix = Character.toUpperCase(Lire.c());
		}
		
		if (sommeFactures == 0) {
			System.out.println("La somme des factures enregistr�es =  " + sommeFactures + " euro. Vous n'avez enregistr� aucune facture");
		} else {
		System.out.format("La somme des factures enregistr�es = %.2f euros \n", sommeFactures);
	}
		System.out.print("FIN DU PROGRAMME");
}
}