package Basic;

public class Arrays {
	public static void main(String[] args) {
		int[] tabOrig = { 2, 1, 6, 0 };
		printArray("Orig array : ", tabOrig);

		int[] tabCopied = copyArray(tabOrig);
		// reverse elem. array
		int[] tabReverse = reverseArray(tabOrig, true);

		printArray("Reversed array : ", tabReverse);

		printArray("Copied array : ", tabCopied);

		int[] tabConcat = concatArrays(tabOrig, tabReverse);
		printArray("Concated array: ", tabConcat);

		int[] tabConcat1 = concatArrays1(tabOrig, tabReverse);
		printArray("Concated array 1: ", tabConcat1);

		int[] tabConcat3 = concatArrays3(tabOrig, tabReverse);
		printArray("Concated array 3: ", tabConcat3);

		int[] tab1 = { 1, 2 };
		int[] tab2 = { 3, 4, 5 };
		int[] tabMerged = mergeCata(tab1, tab2);
		printArray("Merged array : ", tabMerged);
	}

	public static int[] copyArray(int[] tab) {
		int[] tabCopied = new int[tab.length];

		for (int i = 0; i < tab.length; i++) {
			tabCopied[i] = tab[i];
		}
		return tabCopied;
	}

	public static void printArray(String message, int[] tab) {
		String separateur = "";
		System.out.print(message + "{ ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(separateur + tab[i]);
			separateur = " ; ";
		}
		System.out.println(" }");
	}

	public static int[] reverseArray(int[] tab, boolean createNewArray) {

		if (createNewArray == true) {
			int[] tabRevesed = new int[tab.length];

			for (int i = 0; i < tab.length; i++) {
				tabRevesed[i] = tab[tab.length - 1 - i];
			}
			return tabRevesed;
		} else {
			for (int i = 0; i < tab.length / 2; i++) {
				int index1 = i;
				int index2 = tab.length - 1 - i;
				swap(tab, index1, index2);

			}
			return tab;
		}

	}

	// x, y sunt valorile de inversat
	public static void swap(int[] tab, int x, int y) {
		int temp;
		temp = tab[x];
		tab[x] = tab[y];
		tab[y] = temp;

	}

	public static int[] concatArrays(int[] tab1, int[] tab2) {
		int[] tabConcat = new int[tab1.length + tab2.length];
		int offsetIndexTab2;

		for (int i = 0; i < tab1.length; i++) {
			tabConcat[i] = tab1[i];
		}
		offsetIndexTab2 = tab1.length;

		for (int i = 0; i < tab2.length; i++) {
			tabConcat[i + offsetIndexTab2] = tab2[i];
		}

		return tabConcat;
	}

	public static int[] concatArrays1(int[] tab1, int[] tab2) {
		int[] tabConcat = new int[tab1.length + tab2.length];
		int offsetIndexTab2 = tab1.length;

		for (int i = 0; i < tabConcat.length; i++) {
			if (i < tab1.length) {
				tabConcat[i] = tab1[i];
			} else {
				tabConcat[i] = tab2[i - offsetIndexTab2];
			}
		}

		return tabConcat;
	}

	public static int[] concatArrays3(int[] tab1, int[] tab2) {
		int[] tabConcat = new int[tab1.length + tab2.length];
		overwrite(tabConcat, tab1, 0);
		overwrite(tabConcat, tab2, tab1.length);

		return tabConcat;
	}

	public static void overwrite(int[] destinatie, int[] source, int indexDestinatie) {
		for (int i = 0; i < source.length; i++) {
			destinatie[indexDestinatie + i] = source[i];
		}
	}

	public static int[] mergeCata(int[] tab1, int[] tab2) {
		int mergedLength = tab1.length + tab2.length;
		int[] tabMerged = new int[mergedLength];
		int indexCurrent1 = 0;
		int indexCurrent2 = 0;
		int indexMerge = 0;
		
		while (indexCurrent1 < tab1.length && indexCurrent2 < tab2.length) {
			if (tab1[indexCurrent1] < tab2[indexCurrent2]) {
				tabMerged[indexMerge] = tab1[indexCurrent1];
				indexCurrent1++;
			} else {
				tabMerged[indexMerge] = tab2[indexCurrent2];
				indexCurrent2++;
			}
			indexMerge++;
		}

		for (int i = indexCurrent1; i < tab1.length; i++) {
			tabMerged[indexMerge] = tab1[i];
			indexMerge++;
		}
		
		for (int i = indexCurrent2; i < tab2.length; i++) {
			tabMerged[indexMerge] = tab2[i];
			indexMerge++;
		}

		return tabMerged;
	}

	public static int[] merge(int[] tab1, int[] tab2) {
		int mergedLength = tab1.length + tab2.length;
		int[] tabMerged = new int[mergedLength];
		int indexCurrent1 = 0;
		int indexCurrent2 = 0;

		for (int i = 0; i < mergedLength; i++) {
			// daca unul din tabele a ajuns la capat
			if (indexCurrent2 == tab2.length) {
				tabMerged[i] = tab1[indexCurrent1];
				indexCurrent1++;
			} else if (indexCurrent1 == tab1.length) {
				tabMerged[i] = tab2[indexCurrent2];
				indexCurrent2++;
			} else if (tab1[indexCurrent1] < tab2[indexCurrent2]) {
				tabMerged[i] = tab1[indexCurrent1];
				indexCurrent1++;
			} else {
				tabMerged[i] = tab2[indexCurrent2];
				indexCurrent2++;
			}

		}

		return tabMerged;
	}
}