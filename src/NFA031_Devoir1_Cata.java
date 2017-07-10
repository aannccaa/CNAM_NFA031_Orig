/*
NFA031  Devoir numéro 1 du contrôle continu

Un météorologue veut faire un programme pour calculer des moyennes journalières de températures. 
Pour calculer une moyenne journalière, il procède à 4 relevés: à 9H, à 13H, à 17H et à 20H.

a) Ecrire un programme qui permet à ce météorologue de saisir les données d'un jour, 
afin de calculer la moyenne des températures de ce jour.

b) Compléter le programme précédent afin que le code écrit à la question a) puisse être répété 
autant de fois que le souhaite le météorologue. 

c) Compléter le programme afin qu'il puisse afficher, après la fin des saisies, 
la valeur de la moyenne la plus basse et la valeur de la moyenne la plus haute.

Remarque: pour résoudre ce devoir, écrire un seul programme au final, qui résoudra toutes les questions posées. 
 */

public class NFA031_Devoir1_Cata {
	public static void main(String[] args) {
		double tempReleve, moyenneTempJour, moyenneMin = 500, moyenneMax = -500, sommeTempJour = 0;
		char choix;
		int compteur = 0;
		boolean vreauSaMaiFacOZi;
		
		do {
			if(compteur == 0) {
				System.out.print("Voulez-vous enregistrer les temperatures météo du jour (O/N) ?");
			} else {
				System.out.println("Voulez-vous enregistrer les temperatures pour un autre jour (O/N) ?");
			}

			choix = citesteCaracterCorect();

			// aici caracterul e corect pentru ca din bucla precedenta nu ies
			// altfel
			
			vreauSaMaiFacOZi = choix == 'O';
			
			if (vreauSaMaiFacOZi) {
				System.out.print("Donner la temperature à 9H: ");
				tempReleve = Lire.d();
				sommeTempJour = tempReleve;
				System.out.print("Donner la temperature à 13H: ");
				tempReleve = Lire.d();
				sommeTempJour = sommeTempJour + tempReleve;
				System.out.print("Donner la temperature à 17H: ");
				tempReleve = Lire.d();
				sommeTempJour = sommeTempJour + tempReleve;
				System.out.print("Donner la temperature à 20H: ");
				tempReleve = Lire.d();
				sommeTempJour = sommeTempJour + tempReleve;
				moyenneTempJour = sommeTempJour / 4;
				compteur = compteur + 1;
				System.out.format("La moyenne des temperatures du jour %d est de %.2f °C \n", compteur,
						moyenneTempJour);

				if (moyenneTempJour <= moyenneMin) {
					moyenneMin = moyenneTempJour;
				}
				if (moyenneTempJour >= moyenneMax) {
					moyenneMax = moyenneTempJour;
				}
			} else {// choix == 'N'
				vreauSaMaiFacOZi = false; // bizonul nu mai vrea
			}
		} while(vreauSaMaiFacOZi);
		
		if (compteur > 0) {

			System.out.println("Vous avez enregistré des temperatures pour " + compteur + " jours.");
			System.out.println("La moyenne la plus basse = " + moyenneMin + " °C.");
			System.out.println("La moyenne la plus haute = " + moyenneMax + " °C.");
		}
		System.out.println("FIN DU PROGRAMME");
	}

	private static char citesteCaracterCorect() {
		char choix;
		// obtin un caracter corect
		boolean caracterCorect;
		do {
			choix = Character.toUpperCase(Lire.c());
			caracterCorect = (choix == 'O');
			if (!caracterCorect) {
				System.out.print("Choix invalide. Scrie O/N!");
			}
		} while(!caracterCorect);// daca caracterul e corect, termin citirea caracterului
		return choix;
	}
}
