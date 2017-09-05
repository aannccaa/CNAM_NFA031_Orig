/*
extraire une sous-chaîne d’une chaîne.
 */
public class NFA031_Mod6_2d_Chaines_substring_ExtractionString_bis {

	public static void main(String[] args) {
		String s = "aiuahf mihaf";
		int indexInf = 2;
		int indexSup = 5;
		
		String ss = s.substring(indexInf, indexSup);
		
		System.out.println("Chaine extraite : " + ss);

	}

}
