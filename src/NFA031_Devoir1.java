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

public class NFA031_Devoir1 {

	public static void main(String[] args) {
		double tempReleve, moyenneTempJour, moyenneMin = 500, moyenneMax = -500, sommeTempJour = 0;
		char choix;
		int compteur = 0;
		
		do {
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
			System.out.format("La moyenne des temperatures du jour %d est de %.2f °C \n", compteur, moyenneTempJour);

			if (moyenneTempJour <= moyenneMin) {
				moyenneMin = moyenneTempJour;
			}
			if (moyenneTempJour >= moyenneMax) {
				moyenneMax = moyenneTempJour;
			}
			
			System.out.print("Voulez-vous enregistrer les temperatures pour un autre jour (O/N) ?");
			choix = Character.toUpperCase(Lire.c());
		} while (choix == 'O');

		System.out.println("Vous avez enregistré des temperatures pour " + compteur + " jours.");
		System.out.println("La moyenne la plus basse = " + moyenneMin + " °C.");
		System.out.println("La moyenne la plus haute = " + moyenneMax + " °C.");
		System.out.println("FIN DU PROGRAMME");
	}

}
