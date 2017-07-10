/*
écrivons un programme pour enregistrer des montants de factures. 
Ce programme devra à la fin indiquer la moyenne de factures enregistrées.
Pour indiquer l'évolution de la moyenne au fur et à mesure de la rentrée des données, 
placer la formule de la moyenne dans la boucle. 
Utiliser une boucle 'Faire (DO)...Tant que (WHILE)...' afin d'être assuré que 
l'utilisateur du programme rentre au-moins une valeur.
 */

public class NFA031_Mod3_ExempleB2c2_Moyenne_Factures_DO_WHILE {

	public static void main(String[] args) {
		double sommeFactures = 0, moyenneFactures, mntFacture;
		char choix;
		int compteur = 1;

		do {
			System.out.print("Donner le montant de la facture n° " + compteur + " : ");
			mntFacture = Lire.d();
			sommeFactures = sommeFactures + mntFacture;
			moyenneFactures = sommeFactures / compteur;
			if (compteur >= 2) {
				System.out.format("La moyenne de ces %d factures = %.2f euros \n", compteur, moyenneFactures);
				;
			} else {
				System.out.format("%d facture enregistrée, la moyenne vaut %.2f euros \n", compteur, moyenneFactures);
			}
			System.out.print("Voulez-vous enregistrer une autre facture (O/N) ? ");
			choix = Character.toUpperCase(Lire.c());
			if (choix == 'O') {
				compteur = compteur + 1;
			}
		} while (choix == 'O');

		System.out.print("FIN DU PROGRAMME");
	}

}
