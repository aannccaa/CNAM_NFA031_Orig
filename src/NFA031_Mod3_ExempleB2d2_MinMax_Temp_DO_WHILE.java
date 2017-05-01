/*
Etudions des relev�s journaliers de temp�ratures en un endroit donn�, 
en supposant que les temp�ratures ne descendent jamais en-dessous de
-30 degr�s et de ne d�passent jamais 40 degr�s . 
On suppose que l'on effectue un relev� par jour pendant une semaine et 
l'on va r�diger un programme qui indique la valeur maximale et
la valeur minimale des temp�ratures relev�es.
L'initialisation de 'max' se fera avec -30 , afin de faire �ventuellement augmenter cette valeur 
et l'initialisation de 'min' se fera avec 40 , afin de faire �ventuellement diminuer cette valeur .
 */
public class NFA031_Mod3_ExempleB2d2_MinMax_Temp_DO_WHILE {

	public static void main(String[] args) {
		double temp, tempMin = 40, tempMax = -30;
		int compteur = 1;

		do {
			System.out.print("Donner la temperature du jour n� " + compteur + " : ");
			temp = Lire.d();
			if (temp > tempMax) {
				tempMax = temp;
			}
			if (temp < tempMin) {
				tempMin = temp;
			}
			compteur = compteur + 1;
		} while (compteur <= 7);

		System.out.println("Temperature min pour la semaine = " + tempMin);
		System.out.println("Temperature max pour la semaine = " + tempMax);
		
		System.out.print("FIN DU PROGRAMME");
	}



}
