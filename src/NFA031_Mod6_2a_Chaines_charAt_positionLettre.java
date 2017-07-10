/*
pour un mot donnée, trouver la lettre qui se trouve sur une position choisie par l'utilisateur
 */
public class NFA031_Mod6_2a_Chaines_charAt_positionLettre {

	public static void main(String[] args) {
		int positionCharactereDansMot;
		int longueurMot;
		String motIntroduit;
		char characterDansMot;
		
		System.out.print("Donner un mot : ");
		motIntroduit = Lire.S();
		longueurMot = motIntroduit.length();
		
		System.out.println("Donner une position entre 0 et " + (longueurMot-1) + " : ");
		positionCharactereDansMot = Lire.i();
		characterDansMot = motIntroduit.charAt(positionCharactereDansMot);
		
		System.out.println("Sur la position " + positionCharactereDansMot + " se trouve le charactère " + characterDansMot);
		
	}

}
