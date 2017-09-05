/*
demander 5 noms à l’utilisateur, les placer dans un tableau. 
Le code demande ensuite à l’utilisateur de taper un nom et indique
si le nom fourni fait ou non partie du tableau
 */
public class NFA031_Mod6_2c_Chaines_equals {

	public static void main(String[] args) {
		int nombreMots = 3;
		String[] tab = new String[nombreMots];
		String motCherche;
		boolean estTrouve;

		for (int i = 0; i < nombreMots; i++) {
			System.out.print("Donner le mot n° " + i + " : ");
			tab[i] = Lire.S();
		}
		System.out.print("Donner un mot quelconque : ");
		motCherche = Lire.S();

		estTrouve = false;
		for(int i=0; i<nombreMots; i++) {
			if (motCherche.equals(tab[i])) {
				estTrouve = true;
			}
		}
		
		if (estTrouve) {
			System.out.println("Le mot '" + motCherche + "' existe dans le tableau. ");
		} else {
			System.out.println("Le mot '" + motCherche + "' n'existe dans le tableau. ");
		}
		
	}

}
