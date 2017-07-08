/*
a) Ecrire un code qui permet à un utilisateur de rentrer N entiers
strictement positifs dans un tableau ‘tab’ , la taille N du tableau étant à choisir par
l’utilisateur .
b) Ecrire un code qui calcule la valeur maximale ‘MAX’ des entiers du tableau .
c) Ecrire un code qui calcule K , le nombre d'occurrences de cette valeur maximale .
d) Déclarer un tableau 'tabbis' , de taille N+K et le remplir avec les valeurs du
tableau 'tab' en insérant la valeur '0' après chaque occurrence de 'MAX' .
Par exemple , si le tableau 'tab' contient les valeurs : 3 , 7 , 2 , 5 , 7 , 1 , 7 , 3 , 
le tableau 'tabbis' devra contenir les valeurs : 3 , 7 , 0 , 2 , 5 , 7 , 0 , 1 , 7 , 0 , 3
*/

public class NFA031_Exam1_2017_Ex2 {
	public static void main(String[] args) {
		
		//a)
		// variante1 tab introduit au clavier
		int N = fournirTailleTableau();
		int[] tab = remplirTableau(N);
		
		// variante2 tab fournit en dur
		//int[] tab = { 3, 7, 2, 5, 7, 1, 7, 3 };
		
		afficherVecteur(tab);
		
		//b)
		int MAX = calculerMax(tab);
		System.out.println("MAX = " + MAX);
		
		//c)
		int K = calculerOccurencesMax(tab);
		System.out.println("Nb des occurences de la val maximale '" + MAX + "' : " + K);
		
		//d)
		int[] tabbis = creerTabbis(tab);
		afficherVecteur(tabbis);

	}

	// demander la taille du tableau
	public static int fournirTailleTableau() {
		System.out.print("Donner un nombre N strictement positif, pour la taille du tableau : ");
		int N = Lire.i();
		return N;
	}

	// remplir le tableau avec N valeurs entières:
	public static int[] remplirTableau(int N) {
		int[] tab = new int[N];
		{
			int valIntroduite;
			for (int i = 0; i < N; i++) {
				System.out.print("Donner un entier pour la position " + i + " : ");
				valIntroduite = Lire.i();
				tab[i] = valIntroduite;
			}
			return tab;
		}
	}

	// afficher le vecteur d'entiers
	public static void afficherVecteur(int[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = " ; ";
		}
		System.out.println("}");
	}

	// calculer la valeur MAX dans le tableaux d'entiers
	public static int calculerMax(int[] tab) {
		int max = -1;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}

	// calculer le nombre d'occurences de la val max du tableau
	public static int calculerOccurencesMax(int[] tab) {
		int nbOccurencesMax = 0;
		int max = calculerMax(tab);
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == max) {
				max = tab[i];
				nbOccurencesMax++;
			}
		}
		return nbOccurencesMax;
	}

	// créer tabbis
	public static int[] creerTabbis(int[] tab) {
		int K = calculerOccurencesMax(tab);
		int max = calculerMax(tab);
		int[] tabbis = new int[tab.length + K];
		int positionCourrante = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != max) {
				tabbis[positionCourrante] = tab[i];
				positionCourrante++;
			} else {
				if (tab[i] == max) {
					tabbis[positionCourrante] = tab[i];
					positionCourrante++;
					tabbis[positionCourrante] = 0;
					positionCourrante++;
				}

			}
		}
		
		return tabbis;
	}

}
