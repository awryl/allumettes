package allumettes;

public class Rapide extends Joueur {

	Rapide(String n) {
		 this.nom = n;
	}
	
	/* Le joueur Rapide prend le maximum d'allumettes qu'il est règlementèrement possible
	   de prendre. Même si il reste un ou deux allumettes, il va prendre la dernière 
	   puisqu'il est vraiment très pressé.
	*/

	int getPrise(Jeu jeu) {
		if (jeu.getNombreAllumettes() < jeu.PRISE_MAX) {
			return jeu.getNombreAllumettes();
		}
		else {
			return jeu.PRISE_MAX;
		}
	}
}
