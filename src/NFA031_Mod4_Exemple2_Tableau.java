/*
Une classe est composée de 25 élèves. Chaque élève passe un examen de trois matières:
mathématique (3), français (2) et informatique (5). 
Ecrire un algorithme pour réaliser les étapes suivantes:
a) Saisir les notes, puis calculer les moyennes des élèves et les ranger dans un tableau .
b) Parcourir le tableau et afficher une décision d’admission selon que la moyenne de
l’élève est supérieure ou égale à 10.
c) Calculer et afficher la moyenne générale de la classe.
*/

public class NFA031_Mod4_Exemple2_Tableau {
	public static void main(String[] args) {
		int nbEleves = 2, coefMath = 3, coefFra = 2, coefInfo = 5;
		double noteMathEleve, noteFraEleve, noteInfoEleve, moyenneNotesEleve, sommeMoyennesEleves = 0,
				moyenneGenClasse = 0;
		int i;
		String decision;
		double tab[] = new double[nbEleves];

		// calcul moyenne pour chaque élève:
		for (i = 0; i < nbEleves; i++) {
			System.out.print("Eleve " + (i + 1) + ", donner la note en Mathématique : ");
			noteMathEleve = Lire.d();
			System.out.print("Eleve " + (i + 1) + ", donner la note en Français : ");
			noteFraEleve = Lire.d();
			System.out.print("Eleve " + (i + 1) + ", donner la note en Informatique : ");
			noteInfoEleve = Lire.d();

			moyenneNotesEleve = (noteMathEleve * coefMath + noteFraEleve * coefFra + noteInfoEleve * coefInfo)
					/ (coefMath + coefFra + coefInfo);
			System.out.println("La moyenne des notes de l'elève " + (i + 1) + " = " + moyenneNotesEleve);

			// Decisions admission si moyenne de l'eleve >=10
			if (moyenneNotesEleve >= 10) {
				decision = "Admis";
			} else {
				decision = "Non admis";
			}
			System.out.println("=> Eleve " + (i + 1) + ": " + decision);
			sommeMoyennesEleves = sommeMoyennesEleves + moyenneNotesEleve;

			// ranger les moyennes des élèves dans un tableau:
			tab[i] = moyenneNotesEleve;

		}

		// imprimer le tableau des moyennes des notes des élèves:
		System.out.print("Le tableau des moyennes des notes des élèves est : [");
		String separateur = "";
		for (i = 0; i < nbEleves; i++) {
			System.out.print(separateur + tab[i]);
			separateur = ", ";
		}
		System.out.println("]");

		// calcul moyenne générale de la classe:
		moyenneGenClasse = sommeMoyennesEleves / nbEleves;
		System.out.println("La moyenne générale de la classe de " + nbEleves + " élèves = " + moyenneGenClasse);

	}

}
