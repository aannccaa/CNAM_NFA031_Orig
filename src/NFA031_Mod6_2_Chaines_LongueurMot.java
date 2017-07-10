/*
Afficher la longueur d'un mot introduit par l'utilisateur.
 * 
 */
public class NFA031_Mod6_2_Chaines_LongueurMot {

	public static void main(String[] args) {
		int longueurMot;
		String motIntroduit;

		System.out.print("Donner un mot : ");
		motIntroduit = Lire.S();
		longueurMot = motIntroduit.length();
		System.out.println("Le mot introduit comporte " + longueurMot + " charactères.");
	}

}
