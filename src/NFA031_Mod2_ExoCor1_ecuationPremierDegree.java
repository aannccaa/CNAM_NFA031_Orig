/*
Ecrire un algorithme qui réalise la résolution d’une équation du premier degré : a*x+b=0.
Remarque : la discussion à programmer est la suivante : 
si a est différent de 0 , alors l’équation admet une solution unique : x = -b/a ; 
si a = 0 , avec b non nul , alors l’équation n’admet pas de solution ; 
si a et b sont nuls , alors l’équation admet tout nombre réel comme solution .
*/

public class NFA031_Mod2_ExoCor1_ecuationPremierDegree {
	public static void main(String[] arg) {
		double a, b, x;
		System.out.print("Donner un nombre réel a= ");
		a = Lire.d();
		System.out.print("Donner un nombre réel b= ");
		b = Lire.d();
		if (a != 0) {
			x = -b / a;
			System.out.print("x = " + x);
		}
		if ((a == 0) && (b != 0)) {
			System.out.print("L’équation n’admet pas de solution. Division par zéro impossible.");
		}
		if ((a == 0) && (b == 0)) {
			System.out.print("L’équation admet tout nombre réel comme solution. Division 0/0");
		}
		System.out.println("FIN DE PROGRAMME");
	}
}