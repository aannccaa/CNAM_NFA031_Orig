/*
Une classe est composée de 25 élèves. Chaque élève passe un examen de trois matières : 
les mathématiques avec un coefficient de 3, l’informatique avec un coefficient de 4 
et le français avec un coefficient de 2.
Ecrire un algorithme qui demande les notes des élèves, calcule leurs moyennes, 
la moyenne maximale, la moyenne minimale et la moyenne générale de la classe.
*/

public class NFA031_Mod3_ExoProp1_MoyenneMinMax_Notes {
	public static void main(String[] args) {
		int coefMath = 2, coefInfo = 4, coefFra = 2, nbEleves = 25;
		double noteMath, noteInfo, noteFra, moyenneEleve, sommeMoyennesEleves = 0, moyenneMinClasse = 20,
				moyenneMaxClasse = 0, moyenneGenClasse = 0;

		for (int i = 1; i <= nbEleves; i++) {
			System.out.print("Donner la note en Mathématique pour l'eleve n° " + i + " : ");
			noteMath = Lire.d();
			System.out.print("Donner la note en Informatique pour l'eleve n° " + i + " : ");
			noteInfo = Lire.d();
			System.out.print("Donner la note en Français pour l'eleve n° " + i + " : ");
			noteFra = Lire.d();

			moyenneEleve = (noteMath * coefMath + noteInfo * coefInfo + noteFra * coefFra)
					/ (coefMath + coefInfo + coefFra);
			System.out.format("L'eleve n° %d a une moyenne = %.2f \n", i, moyenneEleve);

			sommeMoyennesEleves = sommeMoyennesEleves + moyenneEleve;

			if (moyenneEleve <= moyenneMinClasse) {
				moyenneMinClasse = moyenneEleve;
			}
			if (moyenneEleve >= moyenneMaxClasse) {
				moyenneMaxClasse = moyenneEleve;
			}

		}
		moyenneGenClasse = sommeMoyennesEleves / nbEleves;
		System.out.format("Moyenne générale de la classe ayant %d eleves = %.2f \n", nbEleves, moyenneGenClasse);
		System.out.format("Moyenne min. de la classe ayant %d eleves = %.2f \n", nbEleves, moyenneMinClasse);
		System.out.format("Moyenne max. de la classe ayant %d eleves = %.2f \n", nbEleves, moyenneMaxClasse);

	}
}