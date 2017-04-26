public class NFA031_Mod1_ExoProp2_Somme2Temps {
	public static void main(String[] args) {
		int hh, mm, ss, totalSecondes;
		System.out.print("Entrer un nombre d'heures pour le Temps 1 (hh) : ");
		hh = Lire.i();
		System.out.print("Entrer un nombre de minutes pour le Temps 1 (mm) : ");
		mm = Lire.i();
		System.out.print("Entrer un nombre de secondes pour le Temps 1 (ss) : ");
		ss = Lire.i();
		totalSecondes = ss + 60 * mm + 3600 * hh;	

		System.out.print("Entrer un nombre d'heures pour le Temps 2 (hh) : ");
		hh = Lire.i();
		System.out.print("Entrer un nombre de minutes pour le Temps 2 (mm) : ");
		mm = Lire.i();
		System.out.print("Entrer un nombre de secondes pour le Temps 2 (ss) : ");
		ss = Lire.i();
		totalSecondes = totalSecondes +(ss + 60 * mm + 3600 * hh);
		
		//calcul hh, mm, ss
		hh=totalSecondes/3600;
		mm=(totalSecondes -3600*hh)/60;
		ss = (totalSecondes -3600*hh-60*mm);
		
		//variante calcul ss1, mm1
		int ss1 = totalSecondes % 60;
		int mm1 = (totalSecondes % 3600) / 60;

		
		System.out.println("La somme des 2 temps est:" + hh+":"+mm+":"+ss);
		System.out.println("La somme des 2 temps est:" + hh+":"+mm1+":"+ss1);

	}
}