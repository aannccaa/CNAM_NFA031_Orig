/*
Exercice 1
Ecrire un programme qui retourne la factorielle de n quand on lui fournit la
valeur de n. La factorielle d’un nombre entier n est le produit des entiers
successifs de 1 à n . On écrit : n ! = factorielle de n = 1*2*3*.......*n
Par exemple : 5 ! = 1*2*3*4*5 = 120
 */
public class NFA031_Mod3_ExempleExo1_Factorielle_FOR {

	public static void main(String[] args) {
		int n, i, fact_n=1;
		
		System.out.print("Pour calculer la factorielle de n, donner l'entier n >=1 : ");
		n = Lire.i();
		
		for (i=1 ; i<=n ; i=i+1) {
			fact_n = fact_n * i;
		}
		
		System.out.println("n ! = " + fact_n);
	}

}
