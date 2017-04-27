/*
on suppose que le client d'un magasin ne b�n�ficie d'aucune ristourne 
si son achat est strictement inf�rieur � 200 � , 
qu'il b�n�ficie d'une ristourne de 5% pour un achat sup�rieur � 200� 
et strictement inf�rieur � 500� 
et d'une ristourne de 10% pour un achat sup�rieur � 500� .
Pour r�soudre ce probl�me , imbriquer des alternatives doubles
 */

public class NFA031_Mod2_Exemple5_RistourneIfElseImbrique {

	public static void main(String[] args) {
		double prix;
		System.out.print("Donner le prix d'achat :");
		prix = Lire.d();
		if (prix < 200) {
			System.out.print("Aucune ristourne appliqu�e. ");
			System.out.format("Le client doit payer : %.2f euros \n", prix);
		} else {
			if (prix < 500) {
				prix = prix - prix * 5/100;
				System.out.print("Ristourne de 5% appliqu�e. ");
				System.out.format("Le client doit payer: %.2f euros \n", prix);
			} else {
				prix = prix - prix * 10 / 100;
				System.out.print("Ristourne de 10% appliqu�e. ");
				System.out.format("Le client doit payer: %.2f euros \n", prix);
			}
		}
		System.out.println("FIN DE PROGRAMME");
	}

}
