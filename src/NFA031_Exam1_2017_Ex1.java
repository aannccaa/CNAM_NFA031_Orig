/*
Expliquez , à l'aide d'un tableau d'évolution des variables , ce que fait le
programme suivant et indiquez les résultats qu'il fournit :
 */
public class NFA031_Exam1_2017_Ex1 {

	public static void main(String[] args) {
		String resultat = " ";
		boolean b = true;
		char car1 = 'd';
		char car2 = 'e';
		String s = "dededd";

		for (int i = 0; i < 6; i++) {
			if (b || (s.charAt(i) == car2)) {
				resultat = resultat + car2;
				b = ((s.charAt(i) == car1) && (i > 3));
				System.out.println("resultat au rang " + i + " vaut : " + resultat);
			}

			else {
				resultat = resultat + car1;
				b = (i % 3 == 2);
				System.out.println("resultat au rang " + i + " vaut : " + resultat);
			}

		}

	}

}
