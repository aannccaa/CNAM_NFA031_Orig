/*
pour un mot donnée, trouver la lettre qui se trouve sur une position choisie par l'utilisateur
 */
public class NFA031_Mod6_2a_Chaines_charAt_positionLettre_bis {

	public static void main(String[] args) {
		
		String mot = insertMot();
		System.out.println("Mot introduit : " + mot);
		
		char lettre = findCharacter(mot);
		System.out.println("Lettre trouvée : " + lettre);
		
	}
	
	public static String insertMot() {
		System.out.print("Introduire un mot : ");
		String mot = Lire.S();
		
		return mot;
	}
	
	public static char findCharacter(String mot) {
		int i;
		char c;
		System.out.println("Donner une position (entre 0 et " + (mot.length()-1) + ") : ");
		i= Lire.i();
		c = mot.charAt(i);
		return c;
	}

}
