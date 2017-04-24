/*
Ecrire un programme qui calcule la moyenne de deux nombres entiers .
 */
public class NFA031_Exo4_Mod1 {

	public static void main(String[] args) {
		int a,b;
		System.out.print("Entrer premier entier :");
		a=Lire.i();
		System.out.print("Entrer deuxième entier :");
		b=Lire.i();
		double moyenne;
		moyenne = ((a+b)*1.0)/2;
		System.out.println("La moyenne est : " + moyenne);
	}

}
