package allumettes;

public class Expert extends Joueur {

	Expert(String n) {
		 this.nom = n;
	}

	/* L'expert joue les meilleurs coups possibles, en laissant à l'adversaire un 
	   nombre congru à 1 modulo 4 d'allumettes par invariance. Lorsque le jeu est en sa défaveur,
	   il ne prend qu'1 allumette pour tenter de gagner du temps et ainsi augmenter les chances
	   d'une erreur de l'adversaire.
	*/

	int getPrise(Jeu jeu) {
		int nb = jeu.getNombreAllumettes();
		if (nb % 4 == 1) {
			return 1;
		}
		else {
			return java.lang.Math.abs(nb % 4 - 1);
		}
	}	
}
