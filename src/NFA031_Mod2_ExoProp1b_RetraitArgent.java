/*
Exercice 1 b)
Ecrire un algorithme qui simule une op�ration de retrait d�argent. L�algorithme demandera
la saisie d�un solde et d�un montant de retrait et affichera un message et le nouveau solde
selon l�op�ration r�alis�e. 
Il faut prendre en compte une autorisation de d�couvert, un montant � fixer.
 */

public class NFA031_Mod2_ExoProp1b_RetraitArgent {

	public static void main(String[] args) {
		double mntRetrait, soldeCompte, mntDecouvert;
		System.out.print("Rentrez votre solde en banque : ");
		soldeCompte = Lire.d();
		
		if (soldeCompte == 0) {
			System.out.print("Op�ration non authoris�e. Solde du compte insufisant !");
		} else {

			System.out.print("Quel est le montant que vous voulez retirer? :");
			mntRetrait = Lire.d();

			if (soldeCompte >= mntRetrait) {
				soldeCompte = soldeCompte - mntRetrait;
				System.out.format("Op�ration authoris�e. Le nouveau solde du compte est de : %.2f euros.", soldeCompte);
			} else {
				mntDecouvert = mntRetrait - soldeCompte;
				System.out.format("Solde en banque insufisant ! Le d�couvert du compte apr�s op�ration serait de - %.2f euros \n", mntDecouvert);
				mntRetrait = mntRetrait - mntDecouvert;
				System.out.format("Le solde doit �tre positif. Vous ne pouvez retirer que maximum %.2f euros \n", mntRetrait);
			}
		}
	}

}
