/*
En utilisant une boucle FOR, écrivons un code qui demande à l'utilisateur combien il souhaite
additionner de montants de factures et qui fournit en retour la moyenne des montants fournis.
 */

public class NFA031_Mod3_ExempleB3_MoyenneFactures_FOR {

	public static void main(String[] args) {
		double mntFacture, sommeFactures = 0, moyenneFactures;
		int i, nbFactures;

		System.out.print("Indiquez le nombre de factures à saisir : ");
		nbFactures = Lire.i();

		for (i = 1; i <= nbFactures; i = i + 1) {
			System.out.print("Donner le montant de la facture n° " + i + " : ");
			mntFacture = Lire.d();
			sommeFactures = sommeFactures + mntFacture;
		}

		moyenneFactures = sommeFactures / nbFactures;
		System.out.format("La moyenne de ces %d factures = %.2f euros \n", nbFactures, moyenneFactures);

		System.out.print("FIN DU PROGRAMME");
	}

}
