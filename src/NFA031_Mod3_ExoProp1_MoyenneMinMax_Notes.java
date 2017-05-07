/*
Une classe est compos�e de 25 �l�ves. Chaque �l�ve passe un examen de trois mati�res : 
les math�matiques avec un coefficient de 3, l�informatique avec un coefficient de 4 
et le fran�ais avec un coefficient de 2.
Ecrire un algorithme qui demande les notes des �l�ves, calcule leurs moyennes, 
la moyenne maximale, la moyenne minimale et la moyenne g�n�rale de la classe.
*/

public class NFA031_Mod3_ExoProp1_MoyenneMinMax_Notes {
	public static void main(String[] args) {
		int coefMath = 2, coefInfo = 4, coefFra = 2, nbEleves = 25;
		double noteMath, noteInfo, noteFra, moyenneEleve, sommeMoyennesEleves = 0, moyenneMinClasse = 20,
				moyenneMaxClasse = 0, moyenneGenClasse = 0;

		for (int i = 1; i <= nbEleves; i++) {
			System.out.print("Donner la note en Math�matique pour l'eleve n� " + i + " : ");
			noteMath = Lire.d();
			System.out.print("Donner la note en Informatique pour l'eleve n� " + i + " : ");
			noteInfo = Lire.d();
			System.out.print("Donner la note en Fran�ais pour l'eleve n� " + i + " : ");
			noteFra = Lire.d();

			moyenneEleve = (noteMath * coefMath + noteInfo * coefInfo + noteFra * coefFra)
					/ (coefMath + coefInfo + coefFra);
			System.out.format("L'eleve n� %d a une moyenne = %.2f \n", i, moyenneEleve);

			sommeMoyennesEleves = sommeMoyennesEleves + moyenneEleve;

			if (moyenneEleve <= moyenneMinClasse) {
				moyenneMinClasse = moyenneEleve;
			}
			if (moyenneEleve >= moyenneMaxClasse) {
				moyenneMaxClasse = moyenneEleve;
			}

		}
		moyenneGenClasse = sommeMoyennesEleves / nbEleves;
		System.out.format("Moyenne g�n�rale de la classe ayant %d eleves = %.2f \n", nbEleves, moyenneGenClasse);
		System.out.format("Moyenne min. de la classe ayant %d eleves = %.2f \n", nbEleves, moyenneMinClasse);
		System.out.format("Moyenne max. de la classe ayant %d eleves = %.2f \n", nbEleves, moyenneMaxClasse);

	}
}