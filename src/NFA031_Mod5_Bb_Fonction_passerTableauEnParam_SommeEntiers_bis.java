/*
Ecrire un program avec une fonction qui passe un tableau en paramettre et qui 
demande 5 entiers à un utilisateur et les stocke dans un tableau. 
La fonction ‘somme’ reçoit ce tableau en paramètre et retourne la somme des éléments du tableau :
*/

public class NFA031_Mod5_Bb_Fonction_passerTableauEnParam_SommeEntiers_bis {

	public static void main(String[] args) {
		int nombreEntiers = 3;
		int nombreEntiers2 = 2;
		int sommeEntiers;
		int tab[] = lireTableau("tablou 1", nombreEntiers);
		int tab2[] = lireTableau("tablou 2", nombreEntiers2);

		sommeEntiers = calcul_somme_entiers_tableau(tab);
		System.out.println("La somme des " + nombreEntiers + " entiers introduits est = " + sommeEntiers);
		sommeEntiers = calcul_somme_entiers_tableau(tab2);
		System.out.println("La somme des " + nombreEntiers + " entiers tableau 2 introduits est = " + sommeEntiers);
		
	}

	// fonction qui passe un tableau d'entiers en parametre
	public static int[] lireTableau(String nomTableau, int longueurTableau) {
		int tableau[] = new int[longueurTableau];
		if (nomTableau != null && nomTableau != "") {
			System.out.println("Introduire la liste des entiers appellée  " + nomTableau);
		}
		
		for (int i = 0; i < longueurTableau; i++) {
			System.out.print("Donner l'entier numéro: " + (i + 1) + " : ");
			tableau[i] = Lire.i();
		}
		return tableau;

	}

	public static int calcul_somme_entiers_tableau(int tableau[]) {

		int sommeEntiersTableau = 0;
		for (int i = 0; i < tableau.length; i++) {
			sommeEntiersTableau = sommeEntiersTableau + tableau[i];
		}
		return sommeEntiersTableau;
	}

}
