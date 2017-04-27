/*
Ecrire un algorithme qui r�alise la r�solution d�une �quation du premier degr� : a*x+b=0.
Remarque : la discussion � programmer est la suivante : 
si a est diff�rent de 0 , alors l��quation admet une solution unique : x = -b/a ; 
si a = 0 , avec b non nul , alors l��quation n�admet pas de solution ; 
si a et b sont nuls , alors l��quation admet tout nombre r�el comme solution .
*/

public class NFA031_Mod2_ExoCor1_ecuationPremierDegree {
	public static void main(String[] arg) {
		double a, b, x;
		System.out.print("Donner un nombre r�el a= ");
		a = Lire.d();
		System.out.print("Donner un nombre r�el b= ");
		b = Lire.d();
		if (a != 0) {
			x = -b / a;
			System.out.print("x = " + x);
		}
		if ((a == 0) && (b != 0)) {
			System.out.print("L��quation n�admet pas de solution. Division par z�ro impossible.");
		}
		if ((a == 0) && (b == 0)) {
			System.out.print("L��quation admet tout nombre r�el comme solution. Division 0/0");
		}
		System.out.println("FIN DE PROGRAMME");
	}
}