/*
 Le client d'un magasin b�n�ficie d'une ristourne de 5% 
 s'il ach�te un article dont le prix d�passe 200 � . 
 Pour un achat strictement inf�rieur � 200� , il ne b�n�ficie d'aucune ristourne . 
 Ecrivons un programme qui calcule le prix � payer par le client
 */
public class NFA031_Mod2_Exemple3_RistourneIfThenElse {

	public static void main(String[] args) {
		double Prix;
		System.out.print("Donner le pris d'achat :");
		Prix = Lire.d();
		if (Prix < 200) {
			System.out.print("Le client n'a pas de droit � une ristourne. ");
			System.out.format("Il doit payer : %.2f euros \n", Prix);
		} else {
			Prix = Prix - Prix * 5 / 100;
			System.out.print("Le client a droit � une ristourne. ");
			System.out.format("Il doit payer : %.2f \n", Prix);
		}
		System.out.print("FIN DU PROGRAMME");
	}

}
