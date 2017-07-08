import javax.swing.plaf.synth.SynthSeparatorUI;

/*
Un garage vend quatre types de voitures , qui sont les suivants : berline , break ,
monospace et citadine .
Chaque type de voiture sera repéré par un indice : 0 pour le type berline , 1 pour le
type break , 2 pour le type monospace et 3 pour le type citadine .
a) Le gérant du garage veut créer un programme pour enregistrer ses ventes mensuelles par
type de voiture pendant un semestre . Les mois seront repérés par un indice variant de 0 à 5 .
Pour réaliser cela , déclarer un tableau de dimension 2 qui comportera 4 lignes et 6 colonnes .
Ecrire un code pour stocker dans la case repérée par la ligne i et la colonne j le nombre de
voitures de type i vendues pendant le mois j .
b) Rédiger une fonction qui calcule et affiche le nombre de voitures vendues pendant
le mois j , j étant un indice de mois fourni par l'utilisateur .
c) Rédiger une fonction qui calcule et affiche le nombre de voitures de type i vendues
pendant le semestre , i étant un indice de type de voiture fourni par l'utilisateur .
d) Rédiger une fonction qui calcule et affiche le nombre de voitures vendues pendant le
semestre .
 */

public class NFA031_Exam1_2017_Ex4 {

	public static void main(String[] args) {
		int nbTypesVoiture = 4;
		int nbMois = 6;
		int[][] tab = { { 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2, 2 }, { 1, 2, 3, 4, 5, 6 } };

		// a)
		// int[][] tabVentesVoituresParMois = creerTableau2D(indiceTypeVoiture,
		// indiceMois);
		// afficherTab(tabVentesVoituresParMois);

		// b)
		System.out.print("Donner le mois pour calculer le nombre de voitures vendues :");
		int indiceMois = Lire.i();
		calculerVentesParMois(tab, indiceMois);

		// c)
		System.out.print("Donner le type de voiture pour calculer son nb. total des ventes: ");
		int indiceTypeVoiture = Lire.i();
		calculerTotalVentesParTypeVoiture(tab, indiceTypeVoiture);
		
		//d)
		calculerTotalVentes(tab);

	}

	public static int[][] creerTableau2D(int nbLignes, int nbCol) {

		int[][] tab = new int[nbLignes][nbCol];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[j].length; j++) {
				System.out.print("Donner le nb. de voitures type " + i + ", vendus le mois de " + j + " : ");
				tab[i][j] = Lire.i();
			}
		}
		return tab;
	}

	public static void afficherTab(int[][] tab) {
		for (int i = 0; i < tab.length; i++) {
			String sep = "";
			System.out.print("{");
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(sep + tab[i][j]);
				sep = ";";
			}
			System.out.println("}");

		}

	}

	public static int calculerVentesParMois(int[][] tab, int indiceMois) {
		int nbVentesParMois = 0;

		for (int i = 0; i < tab.length; i++) {
			nbVentesParMois = nbVentesParMois + tab[i][indiceMois];
		}
		System.out.println("Nb ventes voitures pour le mois " + indiceMois + " = " + nbVentesParMois);
		return nbVentesParMois;
	}

	public static int calculerTotalVentesParTypeVoiture(int[][] tab, int indiceTypeVoiture) {
		int nbTotalVentesParTypeVoiture = 0;
		for(int j=0; j< tab[indiceTypeVoiture].length; j++){
			nbTotalVentesParTypeVoiture = nbTotalVentesParTypeVoiture + tab[indiceTypeVoiture][j];
			
			}
			System.out.println("Nb total des ventes de la voiture type " + indiceTypeVoiture + " = " + nbTotalVentesParTypeVoiture);
		
		return nbTotalVentesParTypeVoiture;
	}
	
	public static int calculerTotalVentes(int[][] tab){
		int nbTotalVentes=0;
		
		for(int i=0; i<tab.length;i++){
			for (int j=0; j<tab[i].length; j++){
				nbTotalVentes = nbTotalVentes + tab[i][j];
			}
		}
		System.out.println("Nb total ventes = " + nbTotalVentes);
		return nbTotalVentes;
	}
}