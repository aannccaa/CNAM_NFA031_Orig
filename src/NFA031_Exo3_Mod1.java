/*
Ecrire un programme qui calcule le prix � payer pour assister � n s�ances de 
cin�ma , en supposant qu�il y a un abonnement de 10 euros et un prix de s�ance  
de 4 euros . Le nombre de s�ances est donn� en mode conversationnel par
 l�utilisateur et le programme devra afficher le r�sultat calcul� .

 */

public class NFA031_Exo3_Mod1 {
	public static void main (String[] arg) {
	int nombreSeances;
	double prixTotal;
	System.out.print("Donner le nombre de s�ances :");
	nombreSeances = Lire.i();
	prixTotal = 10 + 4*nombreSeances;
	System.out.println("Le prix � payer est : " + prixTotal);
	
	}
}