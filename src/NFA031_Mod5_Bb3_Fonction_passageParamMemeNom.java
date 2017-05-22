/*
 
 */
public class NFA031_Mod5_Bb3_Fonction_passageParamMemeNom {

	public static void main(String[] args) {
		int a = 5;

		System.out.println("a vaut initialement : " + a);

		modif(a);

		System.out.println("apres l appel de modif a vaut : " + a);
	}

	public static void modif(int a) {
		a = 12;

	}

}
