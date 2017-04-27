/*
Ecrire un algorithme qui simule une opération de retrait d’argent. L’algorithme demandera
la saisie d’un solde et d’un montant de retrait et affichera un message et le nouveau solde
selon l’opération réalisée.
 */
public class NFA031_Mod2_ExoProp1a_RetraitArgent {

	public static void main(String[] args) {
		double mntRetrait, soldeCompte;
		System.out.print("Rentrez votre solde en banque ?: ");
		soldeCompte = Lire.d();
		System.out.print("Quelle est le montant que vous voulez retirer? :");
		mntRetrait = Lire.d();
		if (soldeCompte >= mntRetrait) {
			System.out.print("Opération authorisée. Voici le montant demandé");
		}
	}

}
