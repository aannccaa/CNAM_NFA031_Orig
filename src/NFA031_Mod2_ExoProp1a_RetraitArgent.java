/*
Exercice 1 a)
Ecrire un algorithme qui simule une opération de retrait d’argent. L’algorithme demandera
la saisie d’un solde et d’un montant de retrait et affichera un message et le nouveau solde
selon l’opération réalisée.
 */
public class NFA031_Mod2_ExoProp1a_RetraitArgent {

	public static void main(String[] args) {
		double mntRetrait, soldeCompte;
		System.out.print("Rentrez votre solde en banque : ");
		soldeCompte = Lire.d();
		
		if (soldeCompte == 0) {
			System.out.print("Opération non authorisée. Solde en banque insufisant !");
		} else {

			System.out.print("Quel est le montant que vous voulez retirer? :");
			mntRetrait = Lire.d();

			if (soldeCompte >= mntRetrait) {
				soldeCompte = soldeCompte - mntRetrait;
				System.out.format("Opération authorisée. Le nouveau solde en banque est de : %.2f euros.", soldeCompte);
			} else {
				System.out.print("Opération non authorisée. Solde en banque insufisant !");
			}
		}
	}

}
