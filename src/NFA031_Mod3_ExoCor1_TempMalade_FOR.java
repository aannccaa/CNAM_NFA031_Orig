/*
Exercice 1
On surveille la temp�rature d�un malade pendant 24 heures toutes les deux heures. 
Ecrire un algorithme qui demande la saisie des relev�s de temp�rature 
et calcule la temp�rature moyenne. 
Il affichera son �cart par rapport � la temp�rature normale.
 */

public class NFA031_Mod3_ExoCor1_TempMalade_FOR {

	public static void main(String[] args) {
		// char choix;
		double tempReleve, sommeTemp = 0, tempMoyenne, tempNormalle = 37, ecartTemp;
		int nombreTempReleve = 24 / 2;
		for (int i = 1; i <= nombreTempReleve; i = i + 1) {
			System.out.print("Rentrez la temperature pour le relev� n� " + i + ": ");
			tempReleve = Lire.d();
			sommeTemp = sommeTemp + tempReleve;

		}
		tempMoyenne = sommeTemp / nombreTempReleve;
		ecartTemp = tempMoyenne - tempNormalle;
		System.out.format("Temp moyenne = %.2f �C \n", tempMoyenne);
		System.out.format("L'�cart de temp moyenne par rapport � la temperature normale est de %.2f �C \n", ecartTemp);

	}

}
