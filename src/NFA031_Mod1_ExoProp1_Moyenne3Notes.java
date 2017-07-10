/*
Un élève passe un examen de trois matières avec les coefficients correspondants :
Mathématiques (3), Informatique (5) et Français (2). 
Ecrire un algorithme qui demande la saisie des notes de l’élève, 
calcule et affiche sa moyenne.
*/

/*

Algo: Moyenne_3_Notes

Déclarations
NoteMath, NoteInfo, NoteFra, Moyenne : réels;

Début
Ecrire ("Donner la note en Mathématiques :")
Lire (NoteMath)
Ecrire ("Donner la note en Informatique :")
Lire (NoteInfo)
Ecrire ("Donner la note en Français :")
Lire (NoteFra)
Moyenne = (3 * NoteMath + 5 * NoteInfo + 2 * NoteFra) / (3 + 5 + 2);
Ecrire ("La moyenne est :", Moyenne)

Fin Moyenne_3_Notes

 */

public class NFA031_Mod1_ExoProp1_Moyenne3Notes {
	public static void main(String[] arg) {
		double NoteMath, NoteInfo, NoteFra, Moyenne;
		System.out.print("Donner la note en Mathématiques :");
		NoteMath = Lire.d();
		System.out.print("Donner la note en Informatique :");
		NoteInfo = Lire.d();
		System.out.print("Donner la note en Français :");
		NoteFra = Lire.d();
		Moyenne = (3 * NoteMath + 5 * NoteInfo + 2 * NoteFra) / (3 + 5 + 2);
		System.out.print("La moyenne est :" + Moyenne);
	}
	
}