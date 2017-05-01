/*
Exercice 1
On surveille la température d’un malade pendant 24 heures toutes les deux heures. 
Ecrire un algorithme qui demande la saisie des relevés de température 
et calcule la température moyenne. 
Il affichera son écart par rapport à la température normale.
 */

public class NFA031_Mod3_ExoCor1_TempMalade_FOR {

	public static void main(String[] args) {
		// char choix;
		double tempReleve, sommeTemp = 0, tempMoyenne, tempNormalle = 37, ecartTemp;
		int nombreTempReleve = 24 / 2;
		for (int i = 1; i <= nombreTempReleve; i = i + 1) {
			System.out.print("Rentrez la temperature pour le relevé n° " + i + ": ");
			tempReleve = Lire.d();
			sommeTemp = sommeTemp + tempReleve;

		}
		tempMoyenne = sommeTemp / nombreTempReleve;
		ecartTemp = tempMoyenne - tempNormalle;
		System.out.format("Temp moyenne = %.2f °C \n", tempMoyenne);
		System.out.format("L'écart de temp moyenne par rapport à la temperature normale est de %.2f °C \n", ecartTemp);

	}

}
