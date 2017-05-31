import org.omg.CORBA.portable.ApplicationException;

public class NFA031_Mod4_5c_TableauTriParBulle_DO_FOR_WHILE {

	public static void main(String[] args) {

		int i, temp;
		int T[] = { 5, 7, 3, 1, 6 };
		int longueurTableau = T.length;
		String separateur;

		boolean enDesordre;
		
		
		do  {
			enDesordre = false;//adica sortate pana la proba contrarie;

			for (i = 0; i < longueurTableau - 1; i++) {
				// Teste si 2 �l�ments successifs sont dans le bon ordre ou non
				

				if (T[i] > T[i + 1]) {
					// s'ils ne le sont pas, on �change leurs positions
					temp = T[i];
					T[i] = T[i + 1];
					T[i + 1] = temp;
					enDesordre = true;
				}
			}
		}
		while(enDesordre);//adica nesortate;
		// afficher le tableau tri�:
		System.out.print("Le tableau tri� par ordre croissante: [");
		separateur = "";
		for (i = 0; i < longueurTableau; i++) {
			System.out.print(separateur + T[i]);
			separateur = ", ";
		}
		System.out.print("]");

	}

}
