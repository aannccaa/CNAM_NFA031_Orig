/*
Un �l�ve passe un examen de trois mati�res avec les coefficients correspondants :
Math�matiques (3), Informatique (5) et Fran�ais (2). 
Ecrire un algorithme qui demande la saisie des notes de l��l�ve, 
calcule et affiche sa moyenne.
*/

/*

Algo: Moyenne_3_Notes

D�clarations
NoteMath, NoteInfo, NoteFra, Moyenne : r�els;

D�but
Ecrire ("Donner la note en Math�matiques :")
Lire (NoteMath)
Ecrire ("Donner la note en Informatique :")
Lire (NoteInfo)
Ecrire ("Donner la note en Fran�ais :")
Lire (NoteFra)
Moyenne = (3 * NoteMath + 5 * NoteInfo + 2 * NoteFra) / (3 + 5 + 2);
Ecrire ("La moyenne est :", Moyenne)

Fin Moyenne_3_Notes

 */

public class NFA031_Mod1_ExoProp1_Moyenne3Notes {
	public static void main(String[] arg) {
		double NoteMath, NoteInfo, NoteFra, Moyenne;
		System.out.print("Donner la note en Math�matiques :");
		NoteMath = Lire.d();
		System.out.print("Donner la note en Informatique :");
		NoteInfo = Lire.d();
		System.out.print("Donner la note en Fran�ais :");
		NoteFra = Lire.d();
		Moyenne = (3 * NoteMath + 5 * NoteInfo + 2 * NoteFra) / (3 + 5 + 2);
		System.out.print("La moyenne est :" + Moyenne);
	}
	
}