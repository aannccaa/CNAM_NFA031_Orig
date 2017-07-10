/*
Calculer une ristourne de 5% à un client qui achète un article 
dont le prix est supérieur ou égal à 200 € et indiquer au client le prix qu'il doit payer.
Avec une boucle While, on peut demander à l'utilisateur s'il souhaite, ou non,
effectuer un autre calcul, en lui posant une question, sans avoir à fermer le programme.
Nous conviendrons de demander à l'utilisateur de taper 'O' s'il souhaite faire un calcul et 'N'
s'il souhaite arrêter le programme.
 */

public class NFA031_Mod3_ExempleB1_Ristourne_WHILE_DO {
	public static void main(String[] args) {
		double prix;
		char choix;
		//System.out.print("Voulez-vous faire un calcul (O/N) ? ");
		//transforme le charactère entré en majuscule:
		choix = Character.toUpperCase(Lire.c());
		while (choix == 'O') {
			System.out.print("Donner le prix d'achat :");
			prix = Lire.d();
			if (prix >= 200) {
				prix = prix - prix * 5 / 100;
			}
				System.out.format("Le client doit payer %.2f euros. \n", prix);
				System.out.print("Voulez-vous faire un autre calcul (O/N) ? ");
				choix = Character.toUpperCase(Lire.c());
			}
			System.out.print("FIN DU PROGRAMME");	
	}
}
