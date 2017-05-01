/*
Exercice 3
Un nombre est dit premier s’il n’admet comme diviseurs que 1 et lui-même. 
Par exemple, les nombres 1, 2 , 3 , 5 et 7 sont premiers.
Ecrire un algorithme qui indique si un nombre fourni par l’utilisateur est, ou non, premier .
 */

public class NFA031_Mod3_ExoCor3_NbPrim {
	public static void main(String[] args) {
		int n;
		boolean premier=true; //numar prim
		
		System.out.print("Donner un numéro entier n positiv > 0: ");
		n = Lire.i();
		if (n>=2) {
			for (int i=2; i<n; i=i+1) {
				if (n % i == 0) {
					premier = false;
				}
			}
		}
		if (premier == true) {
			System.out.println("Le numéro " + n + " est prim.");
		} else {
			System.out.println("Le numéro " + n + " n'est pas prim.");	
		}
		}
	}