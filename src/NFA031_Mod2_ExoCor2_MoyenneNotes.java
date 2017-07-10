/*
Un élève passe un examen de trois matières : les mathématiques avec un coefficient de 3,
l’informatique avec un coefficient de 4 et le français avec un coefficient de 2. 
Ecrire un algorithme qui demande les notes de l’élève, calcule sa moyenne 
et affiche une appréciation selon quatre tranches de notes (0-5, 5-10, 10-15, 15-20).
*/

public class NFA031_Mod2_ExoCor2_MoyenneNotes {
	public static void main (String[] args) {
		double noteMath, noteInfo, noteFra, moyenne;
		int coefMath=3, coefInfo=4, coefFra=2;
		System.out.print("Donner la note en Mathématiques :");
		noteMath = Lire.d();
		System.out.print("Donner la note en Informatique :");
		noteInfo = Lire.d();
		System.out.print("Donner la note en Français :");
		noteFra = Lire.d();
		moyenne = (noteMath*coefMath + noteInfo*coefInfo + noteFra*coefFra)/(coefMath+coefInfo+coefFra);
		System.out.format("La moyenne est : %.2f. ", moyenne);
		if (moyenne<5) {
			System.out.print("Appréciation: Insufissant");
		}
		if ((moyenne>=5)&&(moyenne<10)) {
			System.out.print("Appréciation: Moyen");
		}
		if ((moyenne>=10)&&(moyenne<15)) {
			System.out.print("Appréciation: Bien");
		}
		if (moyenne>=15) {
			System.out.print("Appréciation: Très Bien");
		}
	}
}