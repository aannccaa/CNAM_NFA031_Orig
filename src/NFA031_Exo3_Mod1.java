/*
Ecrire un programme qui calcule le prix à payer pour assister à n séances de 
cinéma , en supposant qu’il y a un abonnement de 10 euros et un prix de séance  
de 4 euros . Le nombre de séances est donné en mode conversationnel par
 l’utilisateur et le programme devra afficher le résultat calculé .

 */

public class NFA031_Exo3_Mod1 {
	public static void main (String[] arg) {
	int nombreSeances;
	double prixTotal;
	System.out.print("Donner le nombre de séances :");
	nombreSeances = Lire.i();
	prixTotal = 10 + 4*nombreSeances;
	System.out.println("Le prix à payer est : " + prixTotal);
	
	}
}