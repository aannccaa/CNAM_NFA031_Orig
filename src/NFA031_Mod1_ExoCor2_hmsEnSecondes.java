/*
 Exercice 2
Ecrire un algorithme qui demande à l’utilisateur 
un nombre d’heures, 
un nombre de minutes et un nombre de secondes, 
convertit le tout en secondes et affiche le total.
 */

/*
	Algo:
	h : entier; //heures
	m : entier; //minutes
 	s : entier; //secondes
 	c : entier; //conversion en secondes
 	Ecrire ("Donner le nombre d'heures :")
 	Lire (h)
 	h <- Lire (h)
 	Ecrire ("Donner le nombre de minutes :")
 	Lire (m)
 	m <- Lire (m)
 	Ecrire ("Donner le nombre d'secondes :")
 	Lire (s)
 	s <- Lire (s)
 	c <- s+60*m+60*60*h
 	Ecrire ("Cela fait: ", c, " secondes") 
 	
 */

public class NFA031_Mod1_ExoCor2_hmsEnSecondes {
public static void main (String[] arg) {
	int h,m,s,c;
	System.out.print("Donner le nombre d'heures :");
	h = Lire.i();
	System.out.print("Donner le nombre de minutes: ");
	m = Lire.i();
	System.out.print("Donner le nombre de secondes :");
	s = Lire.i();
	c = s + m*60 + h*60*60;
	System.out.print("Cela fait :" + c + " secondes.");
	
}
}
