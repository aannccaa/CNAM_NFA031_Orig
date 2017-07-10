/*
Ecrire une procédure pour la résolution de l’équation du premier degré:
a*x+b=0, puis un algorithme qui l’appelle.
 */
public class NFA031_Mod5_ExempleExo2_Fonction_EcuationPremierDegre {

	public static void main(String[] args) {
		double a, b;
		System.out.println("Solution de l'équation du premier degré: a*x + b = 0 .");
		System.out.print("Donner a: ");
		a = Lire.d();
		System.out.print("Donner b: ");
		b = Lire.d();

		// fonction
		resoudreEquationPremierDegre(a, b);
		String message = resoudreEquationPremierDegreString(a, b);
		System.out.println(message);

	}

	public static void resoudreEquationPremierDegre(double a, double b) {
		double x;
		if (a != 0) {
			x = -b / a;
			System.out.println("Valeur de x = " + x);
		}

		if ((a == 0) && (b == 0)) {
			System.out.println("Tout nombre est une solution");
		}

		if ((a == 0) && (b != 0)) {
			System.out.println("Pas de solution, division par zéro impossible.");
		}
	}

	public static String resoudreEquationPremierDegreString(double a, double b) {
		double x;
		String message;
		if (a != 0) {
			x = -b / a;
			message = "Valeur de x = " + x;
		} else if (b == 0) {
			message = "Tout nombre est une solution";
		} else {// (a == 0) && (b != 0)

			message = "Pas de solution, division par zéro impossible.";
		}
		return message;
	}

	

	public static String resoudreEquationPremierDegreString3(double a, double b) {
		if (a != 0) {

			double x = -b / a;
			return "Valeur de x = " + x;
		}

		if (b == 0) {
			return "Tout nombre est une solution";
			// (a == 0) && (b != 0)
		}
		return "Pas de solution, division par zéro impossible.";

	}
}
