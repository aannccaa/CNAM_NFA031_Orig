/*
Exercice 3
Ecrire un algorithme qui demande 
un nombre total de secondes, convertit ce nombre en heures, minutes et secondes. 
L’affichage sera formaté ainsi : heures :minutes :secondes.

 */
public class NFA031_Mod1_ExoCor3_SecondesEnHHMMSS {

	public static void main(String[] args) {
		int n;  // nb. secondes à rentréer par l'utilisateur
		int h, m, s; // heures, minutes, secondes 
		
		/*
		 * n = s + m*60 + h*3600
		 */
		System.out.print("Donner un nombre de secondes:");
		n = Lire.i();
		h = n / 3600;
		m = (n - h * 3600) / 60;
		s = n - h * 3600 - m * 60;
		System.out.print("Cela fait en heures:minutes:secondes => " + h + ":" + m + ":" + s);
	}

}
