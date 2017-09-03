package Basic;

public class PoserUneQuestion {
	public static void main(String[] args) {
		boolean reponse;
		do {
		
			reponse = repondreQuestion("Pricepi ?");
		}while (!reponse);
		
		
	}

	public static boolean repondreQuestion(String question) {
		char choix;
		boolean choixIncorrect;
		do {
			System.out.print(question + "( O/N ) : ");

			choix = Character.toUpperCase(Lire.c());
			choixIncorrect = (choix != 'N') && (choix != 'O');
			if (choixIncorrect) {
				System.out.println("Choix incorrect, répéter la saisie. ");
			}

		} while (choixIncorrect);

		return (choix == 'O');
	}
}
