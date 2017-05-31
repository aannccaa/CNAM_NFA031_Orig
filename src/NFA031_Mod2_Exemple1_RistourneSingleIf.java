/*
 Le client d'un magasin bénéficie d'une ristourne de 5% 
 s'il achète un article dont le prix dépasse 200 €.
 Pour un achat strictement inférieur à 200€ , il ne bénéficie d'aucune ristourne . 
 Ecrivons un programme qui calcule le prix à payer par le client
 */
public class NFA031_Mod2_Exemple1_RistourneSingleIf {

	public static void main(String[] args) {
		double Prix;
		System.out.print("Donner le pris d'achat :");
		Prix = Lire.d();
		
		if (Prix >= 200) {
			Prix = Prix - Prix * 5 / 100;
			System.out.print("Le client a droit à une ristourne. ");
			System.out.format("Il doit payer : %.2f \n", Prix);

		} 
		System.out.print("FIN DU PROGRAMME");
	}

}
