package allumettes;

public class Naif extends Joueur {

	Naif(String n) {
		 this.nom = n;
	}

	/* Le Naif prend un nombre au hasard d'allumettes tout en restant dans les règles
	*/

	int getPrise(Jeu jeu) {
		int nb = jeu.getNombreAllumettes();
		java.util.Random r = new java.util.Random();
		if (nb < jeu.PRISE_MAX) {
			return 1+r.nextInt(nb);
		}
		else {
			return 1+r.nextInt(jeu.PRISE_MAX);
		}
	}
}
