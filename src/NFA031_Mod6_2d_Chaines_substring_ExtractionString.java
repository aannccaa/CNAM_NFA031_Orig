/*
extraire une sous-cha�ne d�une cha�ne.
 */
public class NFA031_Mod6_2d_Chaines_substring_ExtractionString {

	public static void main(String[] args) {
		int indiceInf=2;
		int indiceSup = 6;
		String chaineIntroduite = "azeryuiop";
		String chaineExtraite;
		
		chaineExtraite = chaineIntroduite.substring(indiceInf,indiceSup);
		System.out.println("La chaine apr�s extraction : " + chaineExtraite);
		

	}

}
