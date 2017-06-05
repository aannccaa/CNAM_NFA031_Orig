package Basic;

import java.util.stream.Collector.Characteristics;

public class Stringuri_recap {

	public static void main(String[] args) {
		// System.out.println(isConsecutive('c', 'e'));
		// System.out.println("litere cifre : " + extrageLitereCifre());

		String s = "ab13/02eB4";
		char c = 'b';
		int indexCar = indexCaracter(s, c);
		System.out.format("index du car '%c' est : %d", c, indexCar);
	}

	// citeste cate un char de la tastatura si sa construiesti un string in care
	// sa lasi doar literele si cifrele. Stop cand introduce *.
	public static String extrageLitereCifre() {
		char c;
		String litereCifre = "";
		System.out.println("Donner un character (terminer avec *) :");
		do {

			c = Lire.c();
			if (Character.isAlphabetic(c) || Character.isDigit(c)) {
				litereCifre = litereCifre + c;
			}
		} while (c != '*');
		return litereCifre;
	}

	// cauti un char intr-un string si returnezi indexul daca exista, -1 daca nu
	// exista
	public static int indexCaracter(String s, char c) {
		int indexCar = -1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == c) {
				indexCar = i;
			}
		}
		return indexCar;
	}

	// numara de cate ori apare un caracter intr-un string
	public static int numaraCaracter(String s, char separator) {
		int contor = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == separator) {
				contor++;
			}
		}
		return contor;
	}
	// dintr-un string si un caracter date, extrage un tablou cu indecsii caracterului
	public static int[] extrageIndecsiiUnuiCaracter(String s, char c){
	int indexSeparator;
	
	return tabIndecsiCar;
	}
	
	
	// avand un string il fragmentezi in fc de un separator. Obtii un array de
	// stringuri (fara separator)
	public static String[] fragmentString(String s, char separator){
		int nrSeparatori = numaraCaracter(s, separator);
		int lungimeTragmentedString = s.length()-nrSeparatori;
		int[] tabIndexSeparatori = new int [nrSeparatori];
		
		String[] fragmentedString = new String[lungimeTragmentedString];
		int indexSeparator;
		for (int i=0; i<s.length()-1; i++){
			if (s.charAt(i) == separator){
				indexSeparator = i;
				for (int j=0; j<nrSeparatori-1; j++){
				tabIndexSeparatori[j] = indexSeparator;
			}
		}
		
		return fragmentedString;
	}

	// se da un text intr-un string si dupa fiecare punct, daca nu e spatiu
	// introduci un spatiu.
	// Primul cuvant dupa punct se tranforma in majuscula (folosesti functia
	// Character.toUppercase)

	// functie ce introduce la stanga unui string un caract care se repeta, asa
	// incat stringul total sa
	// aiba anumita lungime

	// extrage dans un string[] suite de caractere succesive ex (BCDETDE => BCDE
	// si DE)

	public static boolean isConsecutive(char c, char d) {
		int ordC = Character.getNumericValue(c);
		int ordD = Character.getNumericValue(d);
		return ordD - ordC == 1;
	}

}
