/*
Ecrire un program avec une fonctionne qui passe un tableau en paramettre et qui 
demande 5 entiers à un utilisateur et les stocke dans un tableau. 
La fonction ‘somme’ reçoit ce tableau en paramètre et retourne la somme des éléments du tableau :
*/

public class NFA031_Mod5_Bb_Fonction_passerTableauEnParam_SommeEntiers {

	public static void main(String[] args) {
		int nombreEntiers=5;
		int sommeEntiers;
		int tab[] = new int[nombreEntiers];
		
		for (int i=0; i<nombreEntiers; i++) {
			System.out.print("Donner l'entier numéro: " + i +" : " );
		tab[i] = Lire.i();
		}
		
		sommeEntiers = calcul_somme_entiers_tableau (tab);
		System.out.println("La somme des " + nombreEntiers + " entiers introduits est = " +sommeEntiers);
	}

	// fonction qui passe un tableau d'entiers en parametre
	public static int calcul_somme_entiers_tableau (int T[]) {
		int nombreEntiersTableau=5, sommeEntiersTableau=0;
		for(int i=0; i<nombreEntiersTableau; i++) {
			sommeEntiersTableau = sommeEntiersTableau + T[i];
		}
		return sommeEntiersTableau;
	}
	

}
