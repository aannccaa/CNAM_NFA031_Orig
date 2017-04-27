/*
 Le client d'un magasin b�n�ficie d'une ristourne de 5% 
 s'il ach�te un article dont le prix d�passe 200 � . 
 Pour un achat strictement inf�rieur � 200� , il ne b�n�ficie d'aucune ristourne . 
 Ecrivons un programme qui calcule le prix � payer par le client
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
			choix = "Ristourne appliqu�e";
		}

		switch (choix) {
		case ("Pas de ristourne"): {
			System.out.print("Le client n'a pas de droit � une ristourne. ");
			System.out.format("Il doit payer : %.2f euros \n", prix);
		}
		break;

		case ("Ristourne appliqu�e"): {
			prix = prix - prix * 5 / 100;
			System.out.print("Le client a droit � une ristourne. ");
			System.out.format("Il doit payer : %.2f \n", prix);
		}
		break;
		//default : System.out.print("???");
		}
		System.out.print("FIN DU PROGRAMME");

	}
}
