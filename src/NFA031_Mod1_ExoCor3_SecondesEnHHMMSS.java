/*
Exercice 3
Ecrire un algorithme qui demande 
un nombre total de secondes, convertit ce nombre en heures, minutes et secondes. 
L�affichage sera format� ainsi : heures :minutes :secondes.

 */
public class NFA031_Mod1_ExoCor3_SecondesEnHHMMSS {

	public static void main(String[] args) {
		int h, m, s, n; // heures, minutes, secondes, secondes entr�s par l'utilisateur � convertir
		/*
		 * n = s + m*60 + h*3600
		 */
		System.out.print("Donner un nombre de secondes:");
		n = Lire.i();
		h = n / 3600;
		m = (n - h * 3600)/60;
		s = n - h * 3600 - m * 60;
		System.out.print("Cela fait en heures:minutes:secondes => " + h + ":" + m + ":" + s);
	}

}
