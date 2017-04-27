/*
on suppose que le client d'un magasin ne bénéficie d'aucune ristourne 
si son achat est strictement inférieur à 200 € , 
qu'il bénéficie d'une ristourne de 5% pour un achat supérieur à 200€ 
et strictement inférieur à 500€ 
et d'une ristourne de 10% pour un achat supérieur à 500€ .
Pour résoudre ce problème , imbriquer des alternatives doubles
 */

public class NFA031_Mod2_Exemple5_RistourneIfElseImbrique {

	public static void main(String[] args) {
		double prix;
		System.out.print("Donner le prix d'achat :");
		prix = Lire.d();
		if (prix < 200) {
			System.out.print("Aucune ristourne appliquée. ");
			System.out.format("Le client doit payer : %.2f euros \n", prix);
		} else {
			if (prix < 500) {
				prix = prix - prix * 5/100;
				System.out.print("Ristourne de 5% appliquée. ");
				System.out.format("Le client doit payer: %.2f euros \n", prix);
			} else {
				prix = prix - prix * 10 / 100;
				System.out.print("Ristourne de 10% appliquée. ");
				System.out.format("Le client doit payer: %.2f euros \n", prix);
			}
		}
		System.out.println("FIN DE PROGRAMME");
	}

}
