/*
  Ecrire un programme qui calcule et affiche le prix apr�s ristourne , lorsqu�on lui  
 fourni le prix avant la ristourne et le pourcentage de la ristourne .
 */
public class NFA031_Exo2_Mod1 {
	public static void main(String[] arg) {
		double prixAvantRistourne, pourcentageRisourne, prixApresRistourne;
		System.out.print("Donner un prix avant ristourne :");
		prixAvantRistourne = Lire.d();
		System.out.print("Donner le pourcentage de la ristourne: ");
		pourcentageRisourne = Lire.d();
		prixApresRistourne = prixAvantRistourne - prixAvantRistourne * pourcentageRisourne / 100;
		System.out.println("Le prix non format� apr�s ristourne est : " + prixApresRistourne + " euros.");
		System.out.format("Le prix format� apr�s ristourne est : %.2f euros \n", prixApresRistourne);

	}
}