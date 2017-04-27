/*
 Le client d'un magasin bénéficie d'une ristourne de 5% 
 s'il achète un article dont le prix dépasse 200 € . 
 Pour un achat strictement inférieur à 200€ , il ne bénéficie d'aucune ristourne . 
 Ecrivons un programme qui calcule le prix à payer par le client
 */
public class NFA031_Mod2_Exemple4_RistourneSwitchCase {

	public static void main(String[] args) {
		double prix;
		System.out.print("Donner le pris d'achat :");
		prix = Lire.d();
		String choix;
		if (prix < 200) {
			choix = "Pas de ristourne";

		} else {
			choix = "Ristourne appliquée";
		}

		switch (choix) {
		case ("Pas de ristourne"): {
			System.out.print("Le client n'a pas de droit à une ristourne. ");
			System.out.format("Il doit payer : %.2f euros \n", prix);
		}
		break;

		case ("Ristourne appliquée"): {
			prix = prix - prix * 5 / 100;
			System.out.print("Le client a droit à une ristourne. ");
			System.out.format("Il doit payer : %.2f \n", prix);
		}
		break;
		//default : System.out.print("???");
		}
		System.out.print("FIN DU PROGRAMME");

	}
}
