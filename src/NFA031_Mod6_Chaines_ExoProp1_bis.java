/*
Ecrire un programme qui lit en donnée l’infinitif d’un verbe du premier groupe ,
par exemple : chanter , et qui en affiche la conjugaison au présent de l’indicatif sous la forme :
je chante
tu chantes
il chante
nous chantons
vous chantez
ils chantent
 */
public class NFA031_Mod6_Chaines_ExoProp1_bis {

	public static void main(String[] args) {
		String infinitifVerbe = "chanter";
		String racineVerbe;
		int longueurRacine = infinitifVerbe.length() - 2;

		racineVerbe = infinitifVerbe.substring(0, longueurRacine);

		System.out.println("La racine du verbe '" + infinitifVerbe + "' est : " + racineVerbe);
		String[] tabPersonnes = { "je", "tu", "il/elle", "nous", "vous", "ils/elles" };
		String[] tabTerminaisons = { "e", "es", "e", "ons", "ez", "ent" };

		System.out.println("La conjugaison du verbe régulier '" + infinitifVerbe + "' au présent indicatif est:");

		for (int i = 0; i < tabPersonnes.length; i++) {
			
				
					System.out.println(tabPersonnes[i] + " " + racineVerbe + tabTerminaisons[i]);
				
				
			
		}
	}
}
