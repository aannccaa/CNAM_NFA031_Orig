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
public class NFA031_Mod6_Chaines_ExoProp1 {

	public static void main(String[] args) {
		String infinitifVerbe = "chanter";
		String racineVerbe;
		int longueurRacine = infinitifVerbe.length() - 2;

		racineVerbe = infinitifVerbe.substring(0, longueurRacine);
	
		System.out.println("La racine du verbe '" + infinitifVerbe + "' est : " + racineVerbe );
		String conj_pers1_sg= "je " + racineVerbe + "e";
		String conj_pers2_sg= "tu " + racineVerbe + "es";
		String conj_pers3_sg= "il/elle " + racineVerbe + "e";
		String conj_pers1_pl= "nous  " + racineVerbe + "ons";
		String conj_pers2_pl= "vous  " + racineVerbe + "ez";
		String conj_pers3_pl= "ils/elles  " + racineVerbe + "ent";
		
		String[] tab = {conj_pers1_sg, conj_pers2_sg, conj_pers3_sg, conj_pers1_pl, conj_pers2_pl, conj_pers3_pl};
		System.out.println("La conjugaison du verbe '" + infinitifVerbe + "' au présent indicatif est:");
		for (int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

}
