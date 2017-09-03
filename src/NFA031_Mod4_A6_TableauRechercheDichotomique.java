/*
La recherche dichotomique
Principe : La recherche dichotomique optimise la recherche séquentielle. 
Elle s’opère sur un tableau trié (en ordre croissant). On compare la valeur recherchée 
à l’élément milieu du tableau. S’il y a égalité, on arrête la recherche. 
Dans le cas contraire, si la valeur recherchée est supérieure à l’élément milieu, 
on continue la recherche dans la partie supérieure du tableau, sinon on prendra 
la partie inférieure.
On continue le même le processus jusqu’à la rencontre de la valeur recherchée ou 
l’obtention d’un tableau à un seul élément.
 */
public class NFA031_Mod4_A6_TableauRechercheDichotomique {

	public static void main(String[] args) {

		int debut, milieu, fin, valRechercher = 1, longueurTableau;
		int valATrouver = 0;
		boolean estTrouve = false;
		int[] T = { 1, 3, 5, 6, 7, 9, 11 };

		longueurTableau = T.length;
		debut = 0;
		fin = longueurTableau;

		while ((estTrouve == false) && (debut <= fin)) {
			milieu = (debut + fin) / 2;
			if (valRechercher == T[milieu]) {
				valATrouver = milieu;
				estTrouve = true;
				
			} else {
				if (valRechercher < T[milieu]) {
					// si la val a rechercher < val du milieu, on cherche dans la moitie gauche
					fin = milieu - 1;					
				} else {
					if (valRechercher > T[milieu]) {
						// si la val a rechercher < val du milieu, on cherche dans la moitie droite
						debut = milieu + 1;
						
					}
				}
			}
		}
		if (estTrouve == true) {
			System.out.print("La valeur existe dans le tableau en position " + valATrouver);

		} else {
			System.out.print("La valeur n'existe pas dans le tableau.");
		}
	}

}
