package Basic;

public class Tablouri {

	public static void main(String[] args) {

		int[] tab1 = { 3, 6, 0, 1, 1, 3, 6, 7 };
		int[] tab2 = { 5, 2, 1 };
		int[] tabDeInversat = { 3, 6, 0, 1, 1, 3, 6, 7 };
		int index = 2;

		afiseazaVector(tab1);
		afiseazaVector(tab2);
		int maxVector = maxVector(tab1);
		System.out.println("Max : " + maxVector);

		int minVector = minVector(tab1);
		System.out.println("Min : " + minVector);

		int sumaVector = sumaValoriVector(tab1);
		System.out.println("Suma : " + sumaVector);

		int nrValoriVector = nrValoriVector(tab1);
		System.out.println("Nr. val : " + nrValoriVector);

		double mediaVector = medieValoriVector(tab1);
		System.out.format("Media : %.2f \n", mediaVector);

		int[] copyFragmentVector = copy(tab1, index, 2);

		afiseazaVector(copyFragmentVector);

		int[] vectorConcat = concat(tab1, tab2);
		afiseazaVector(vectorConcat);

		afiseazaVector(tab1);
		index = 2;
		int valoare = 7;
		int indexGasit = gasestePrimulIndex(tab1, valoare);
		System.out.println("Index gasit pt valoarea " + valoare + " : " + indexGasit);

		afiseazaVector(tab1);
		int n = 3;
		int[] indecsiExtrasi = extractIndecsi(tab1, n);
		afiseazaVector(indecsiExtrasi);

		n = 6;
		afiseazaVector(tab1);
		int nrValoriN = calculeazaCateValoriEgalesCuUnNumar(tab1, n);
		System.out.println("Nr valori egale cu " + n + " : " + nrValoriN);

		int[] vectorDupaEliminearaLuiN = extractVectorFaraValoareaN(tab1, n);
		afiseazaVector(vectorDupaEliminearaLuiN);

		// inverseaza valorile vectorului tabDeInversat (si-i afecteaza
		// valorile) !!!!
		invertVal(tabDeInversat);
		afiseazaVector(tabDeInversat);

		n = 3;
		int[] vectorCeleMaiMariElem = extractCeleMaiMariElemente(tab1, n);
		afiseazaVector(vectorCeleMaiMariElem);

		n = 3;
		afiseazaVector(tab1);
		int sumaCelorMaiMariNElem = sumaCelorMaiMariNElem(tab1, n);
		System.out.println("sumaCelorMaiMariNElem " + n + " : "+ sumaCelorMaiMariNElem);

	}

	// functiare care afiseaza un vector de intregi
	public static void afiseazaVector(int[] tab) {
		String separateur = "";
		System.out.print("{ ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(separateur + tab[i]);
			separateur = " ; ";
		}
		System.out.println(" } ");
	}

	// functia max sa returneze elementul max d'intr-un tablou de intregi

	public static int maxVector(int[] tab) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}

	// functia min sa returneze elementul min d'intr-un tablou de intregi

	public static int minVector(int[] tab) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] < min) {
				min = tab[i];
			}
		}
		return min;
	}

	// functia suma sa returneze suma elementelor d'intr-un tablou de intregi

	public static int sumaValoriVector(int[] tab) {
		int suma = 0;
		for (int i = 0; i < tab.length; i++) {
			suma = suma + tab[i];
		}

		return suma;
	}

	// functia nrValori sa returneze numarul elementelor d'intr-un tablou de
	// intregi
	public static int nrValoriVector(int[] tab) {
		int nrValoriVector = tab.length;
		return nrValoriVector;
	}

	// functia media sa returneze media elementelor d'intr-un tablou de intregi
	public static double medieValoriVector(int[] tab) {
		double media;
		media = sumaValoriVector(tab) * 1.0 / nrValoriVector(tab);
		return media;
	}

	// functia care sa se numeasca copy care primeste un vector de intregi, un
	// index initial
	// si un nr de elemente si produce un alt tablou cu lungimea intre index
	// initial si nr elem.
	public static int[] copy(int[] tab, int index, int n) {
		// int maxN=tab.length-index;
		int copy[] = new int[n];
		for (int i = 0; i < n; i++) {
			copy[i] = tab[index];
			index = index + 1;
		}
		return copy;
	}

	// func care concat 2 vectori
	public static int[] concat(int[] tab1, int[] tab2) {
		int lungimeVectorConcat = tab1.length + tab2.length;
		int[] vectorConcat = new int[lungimeVectorConcat];
		int index = 0;
		for (int i = 0; i < tab1.length; i++) {
			vectorConcat[i] = tab1[i];
		}
		index = tab1.length;
		for (int i = index; i < vectorConcat.length; i++) {
			vectorConcat[i] = tab2[i - index];
		}
		return vectorConcat;
	}

	// func care gaseste primul index al unui elem din tablou, primind o
	// valoare (-1 daca nu exista)
	public static int gasestePrimulIndex(int[] tab, int valoare) {
		int index = -1;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == valoare) {
				index = i;
				break;
			}
		}
		return index;
	}

	// func care returneaza intr-un tablou toti indecsii unuei valori
	// dintr-un tablou
	public static int[] extractIndecsi(int[] tab, int n) {
		int lungimeVectorIndecsi = calculeazaCateValoriEgalesCuUnNumar(tab, n);
		int[] vectorIndecsi = new int[lungimeVectorIndecsi];
		int positieLibera = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == n) {
				vectorIndecsi[positieLibera] = i;
				positieLibera++;
			}
		}
		return vectorIndecsi;
	}

	// functie care numara valorile egale cu o valoare dintr-un vector
	public static int calculeazaCateValoriEgalesCuUnNumar(int[] tab, int n) {
		int nrValoriN = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == n) {
				nrValoriN = nrValoriN + 1;
			}
		}
		return nrValoriN;
	}

	// functie care elimina dintr-un tablou valorile egale cu un numar si
	// intoarce un nou tablou
	public static int[] extractVectorFaraValoareaN(int[] tab, int n) {

		int nrValDeEliminat = calculeazaCateValoriEgalesCuUnNumar(tab, n);
		int lungimeVectorDupaEliminari = tab.length - nrValDeEliminat;
		int[] vectorDupaEliminari = new int[lungimeVectorDupaEliminari];
		int pozitieLibera = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != n) {
				vectorDupaEliminari[pozitieLibera] = tab[i];
				pozitieLibera++;
			}
		}
		return vectorDupaEliminari;

	}

	// fc care inverseasa locul a doua elem x si y intr-un tablou
	public static void swap(int[] tab, int x, int y) {
		int temp;
		temp = tab[x];
		tab[x] = tab[y];
		tab[y] = temp;
	}

	public static int[] ordoneazaElemDesc(int[] tab){
		return ordoneaza(tab, true);
	}
	// fc care ordoneaza descrescator elem unui tablou
	public static int[] ordoneaza(int[] tab, boolean descrescator) {
		for (int i = 0; i < tab.length - 1; i++) {
			for (int j = i + 1; j < tab.length; j++) {
				if (descrescator && (tab[i] < tab[j])) {
					swap(tab, i, j);
				} else if (!descrescator && (tab[i] > tab[j])) {

					swap(tab, i, j);
				}
			}
		}
		return tab;
	}

	// func care returneaza intr-un tablou cele mai mari n elem
	// dintr-un alt tablou
	public static int[] extractCeleMaiMariElemente(int[] tab, int n) {
		int[] vectorCeleMaiMariElem = new int[n];
		int[] tabCopy = copy(tab, 0, tab.length);
		ordoneazaElemDesc(tabCopy);
		vectorCeleMaiMariElem = copy(tabCopy, 0, n);

		return vectorCeleMaiMariElem;
	}

	// suma celor mai mari n elemente dintr-un tablou (astuce: foloseste functia
	// precedenta si fc suma)
	public static int sumaCelorMaiMariNElem(int[] tab, int n) {
		int[] extractCeleMaiMariElemente = extractCeleMaiMariElemente(tab, n);
		int suma = sumaValoriVector(extractCeleMaiMariElemente);

		return suma;
	}

	// fc care inverseaza ordinea elem unui vector
	public static void invertVal(int[] tab) {
		int jumateVector = tab.length / 2;
		int temp;
		int indexMaxTab = tab.length - 1;
		for (int i = 0; i < jumateVector; i++) {
			temp = tab[i];
			tab[i] = tab[indexMaxTab - i];
			tab[indexMaxTab - i] = temp;
		}
	}

}
