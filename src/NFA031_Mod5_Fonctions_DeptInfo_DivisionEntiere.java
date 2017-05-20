/*
calculer la division entière d’un nombre par un autre en utilisant la soustraction
pour calculer le résultat sans utiliser l’opérateur /.
 */
public class NFA031_Mod5_Fonctions_DeptInfo_DivisionEntiere {

	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int resultatDivisionEntiere = divisionEntiere3(x, y);
		System.out.println("x/y = " + resultatDivisionEntiere);
		System.out.println("x+y = " + add(x, y));
	
	}

	public static int divisionEntiere(int x, int y) {
		int compteur = 0;
		int rest = x;
		while (rest >= y) {
			rest = rest - y;
			compteur = compteur + 1;
			
		}
		return compteur;
	}
	public static int divisionEntiere1(int x, int y) {
		int compteur = 0;
		while (x >= y) {
			x = x - y;
			compteur = compteur + 1;
		}
		return compteur;
	}
	
	public static int divisionEntiere3(int x, int y) {
		if (x < y){
			return 0;
		} else {
			int tmp = divisionEntiere3(x-y, y);
			return tmp + 1;
		}
	}
	
	public static int add(int a, int b){
		if(a==0){
			return b;
		} else {
			int tmp = add(a-1, b);
			return tmp + 1;
		}
	}

}
