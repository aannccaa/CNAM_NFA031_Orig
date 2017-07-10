/*
écrivons un algorithme pour déterminer le montant maximum atteint par les factures 
fournies par l'utilisateur, ainsi que le montant minimum de ces factures.
Un algorithme possible consiste à initialiser 'max' et 'min' avec la première valeur fournie par l'utilisateur,
puis à remplacer le contenu de 'max' par toute valeur fournie qui se révèle être plus grande
que la valeur actuelle de 'max' , ainsi que le contenu de 'min' par toute valeur fournie qui se
révèle être plus petite que la valeur actuelle de 'min' .
 */

public class NFA031_Mod3_ExempleB2d1_MinMax_Factures_DO_WHILE {

	public static void main(String[] args) {
		double mntFacture, mntFactureMin = 0, mntFactureMax = 0;
		char choix;
		int compteur = 1;

		do {
			System.out.print("Donner le montant de la facture n° " + compteur + " : ");
			mntFacture = Lire.d();
			if (compteur == 1) {
				mntFactureMin = mntFacture;
				mntFactureMax = mntFacture;
			}
			if (mntFacture >= mntFactureMax) {
				mntFactureMax = mntFacture;
			}
			if (mntFactureMax <= mntFactureMin) {
				mntFactureMin = mntFacture;
			}

			System.out.print("Voulez vous enregistrer une autre facture (O/N) ? ");
			choix = Character.toUpperCase(Lire.c());
			if (choix == 'O') {
				compteur = compteur + 1;
			}

		} while (choix == 'O');
		System.out.println("Le montant max de ces " + compteur + " factures = " + mntFactureMax + " euros.");
		System.out.println("Le montant min de ces " + compteur + " factures = " + mntFactureMin + " euros.");
		System.out.print("FIN DU PROGRAMME");
	}

}
