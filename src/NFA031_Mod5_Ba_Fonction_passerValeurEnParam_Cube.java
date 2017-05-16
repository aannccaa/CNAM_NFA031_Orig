//calcul du cube d’un nombre , réalisé à l’aide d’une fonction.
public class NFA031_Mod5_Ba_Fonction_passerValeurEnParam_Cube {

	public static void main(String[] args) {
		double nombreIntroduit, cubeNombreIntroduit;
		System.out.print("Donner un nombre: ");
		nombreIntroduit = Lire.d();

		cubeNombreIntroduit = calcul_cube(nombreIntroduit);
		System.out.println("Son cube vaut: " + cubeNombreIntroduit);

	}

	// fonction qui passe une valeur double en parametre
	public static double calcul_cube(double x) {
		double cube;
		cube = x * x * x;
		return cube;
	}

}
