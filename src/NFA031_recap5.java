/*
Pour fabriquer un mot de passe, vous convenez de donner 3 nombres entiers, qui ne
contiennent pas obligatoirement le même nombre de chiffres. Ces 3 nombres: n1, n2
et n3 seront ensuite séparés par les lettres A et B pour former le mot de passe de la façon
suivante: n1An2Bn3.
a) Déclarer un tableau 'tab' qui contiendra 3 objets de type String. Ce tableau stockera les
nombres sous forme de chaines de caractères.
Supposons que les 3 nombres soient: 12, 7 et 456. Pour saisir ces 3 nombres, l’utilisateur
adoptera la disposition suivante: 
1
2

7

4
5
6
*

Ecrire un code pour enregistrer dans le tableau 'tab' les données ainsi disposées.
b) Ecrire un code pour vérifier les nombres fournis.
N.B: pour cette vérification, il n’est pas demandé de convertir les nombres
vers le type ‘int’.
c) Ecrire un code pour afficher le mot de passe
 */
public class NFA031_recap5 {

	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 7;
		int n3 = 456;

	}

	public static String[] rentrerPassword() {
		char charIntroduit;
		int n1 = 12;
		int n2 = 7;
		int n3 = 456;
		String sep1 = "A";
		String sep2 = "B";
		String pwd = "";

		do {
			charIntroduit = Lire.c();
			if (charIntroduit != '\n') {
				pwd = pwd + charIntroduit;
			} else {
				pwd = pwd + sep1;
			}

		} while (charIntroduit != '*');

		String[] tabPwd = new String[pwd.length() + sep1.length() + sep2.length()];

		return tabPwd;
	}
}
