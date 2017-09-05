/*
Exercice 1 .

Un utilisateur souhaite saisir au clavier les lettres qui composent un mot . Pour cela , il décide
de rentrer un à un les lettres et d’appuyer sur la touche ‘Entrée’ à chaque saisie . De plus ,
il indique la fin de la saisie par le caractère * .
Ainsi , s’il veut rentrer le mot ‘car’ , les données apparaitront à l’écran avec la disposition
suivante : 
c
a
r
*

a) Ecrire un code pour fabriquer une variable Mot de type ‘String’ qui devra contenir les
lettres du mot fourni . Pour cela , vous pouvez saisir les lettres en tant que caractères ,
initialiser Mot avec l’affectation : Mot= "" et fabriquer Mot en utilisant la concaténation des
chaines . La concaténation s’opère entre deux chaines , mais peut aussi s’effectuer entre une
chaine et un caractère ; dans ce cas , le caractère est ajouté à la chaine de caractères .
b) L’utilisateur est parfois distrait et il lui arrive d’appuyer sur ‘Entrée’ sans fournir de
caractère . Modifier le programme du a) afin qu’il ne saisisse que les caractères formant le
mot .
 */
public class NFA031_Mod6_Chaines_ExoCor1_bis {

	public static void main(String[] args) {

		String mot = mot();
		System.out.println("Mot : " + mot);
	}

	public static String mot() {
		char c;
		String s = "";

		System.out.println("Donner un à un les char (* pour terminer) : ");
		do {
			c = Lire.c();
			if ((c != '*') && (c != '\n') && (Character.isLetter(c))) {
				s = s + c;
			}

		} while (c != '*');

		return s;
	}

}
