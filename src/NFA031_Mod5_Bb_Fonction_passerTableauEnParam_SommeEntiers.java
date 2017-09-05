/*
Ecrire un program avec une fonction qui passe un tableau en paramettre et qui 
demande 5 entiers à un utilisateur et les stocke dans un tableau. 
La fonction ‘somme’ reçoit ce tableau en paramètre et retourne la somme des éléments du tableau :
*/

public class NFA031_Mod5_Bb_Fonction_passerTableauEnParam_SommeEntiers {

	public static void main(String[] args) {
		int nbEntiers= 3;
		
		int[] tab = creerTab(nbEntiers);
		afficherTab1D(tab);
		
		int somme = somme(tab);
		System.out.println("Somme entiers tableau = " + somme);
	
	}
	
	public static int[] creerTab(int nbEntiers) {
		int[] tab = new int[nbEntiers];
		for(int i =0; i<tab.length; i++) {
			System.out.print("Donner l'entier n° " + i + " : ");
			tab[i] = Lire.i();	
		}
		return tab;
	}
	
	public static void afficherTab1D(int[] tab) {
		String sep = "";
		System.out.print("{");
		for(int i =0; i<tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = "; ";
		}
		System.out.println("}");
	}
		
	public static int somme(int[] tab) {
		int somme = 0;
		for(int i=0; i< tab.length; i++) {
			somme = somme + tab[i];
		}
		
		return somme;
	}

}
