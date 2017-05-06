/*
NFA031  Devoir num�ro 1 du contr�le continu

Un m�t�orologue veut faire un programme pour calculer des moyennes journali�res de temp�ratures. 
Pour calculer une moyenne journali�re, il proc�de � 4 relev�s: � 9H, � 13H, � 17H et � 20H.

a) Ecrire un programme qui permet � ce m�t�orologue de saisir les donn�es d'un jour, 
afin de calculer la moyenne des temp�ratures de ce jour.

b) Compl�ter le programme pr�c�dent afin que le code �crit � la question a) puisse �tre r�p�t� 
autant de fois que le souhaite le m�t�orologue. 

c) Compl�ter le programme afin qu'il puisse afficher, apr�s la fin des saisies, 
la valeur de la moyenne la plus basse et la valeur de la moyenne la plus haute.

Remarque: pour r�soudre ce devoir, �crire un seul programme au final, qui r�soudra toutes les questions pos�es. 
 */

public class NFA031_Devoir1 {

	public static void main(String[] args) {
		double tempReleve, moyenneTempJour, moyenneMin = 500, moyenneMax = -500, sommeTempJour = 0;
		char choix;
		int compteur = 0;
		
		do {
			System.out.print("Donner la temperature � 9H: ");
			tempReleve = Lire.d();
			sommeTempJour = tempReleve;
			System.out.print("Donner la temperature � 13H: ");
			tempReleve = Lire.d();
			sommeTempJour = sommeTempJour + tempReleve;
			System.out.print("Donner la temperature � 17H: ");
			tempReleve = Lire.d();
			sommeTempJour = sommeTempJour + tempReleve;
			System.out.print("Donner la temperature � 20H: ");
			tempReleve = Lire.d();
			sommeTempJour = sommeTempJour + tempReleve;
			moyenneTempJour = sommeTempJour / 4;
			compteur = compteur + 1;
			System.out.format("La moyenne des temperatures du jour %d est de %.2f �C \n", compteur, moyenneTempJour);

			if (moyenneTempJour <= moyenneMin) {
				moyenneMin = moyenneTempJour;
			}
			if (moyenneTempJour >= moyenneMax) {
				moyenneMax = moyenneTempJour;
			}
			
			System.out.print("Voulez-vous enregistrer les temperatures pour un autre jour (O/N) ?");
			choix = Character.toUpperCase(Lire.c());
		} while (choix == 'O');

		System.out.println("Vous avez enregistr� des temperatures pour " + compteur + " jours.");
		System.out.println("La moyenne la plus basse = " + moyenneMin + " �C.");
		System.out.println("La moyenne la plus haute = " + moyenneMax + " �C.");
		System.out.println("FIN DU PROGRAMME");
	}

}
